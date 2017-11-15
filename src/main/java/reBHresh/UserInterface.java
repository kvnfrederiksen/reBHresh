package reBHresh;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.IconView;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.api.BullhornRestCredentials;
import com.bullhornsdk.data.api.StandardBullhornData;
import com.bullhorn.soap26.Session;
import com.bullhorn.soap26.ApiService;
import com.bullhorn.soap26.User;
import com.bullhorn.soap26.SoapFactory;
import com.bullhorn.apiservice.*;
import java.net.*;
import javax.xml.namespace.*;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.soap.SOAPFaultException;

public class UserInterface extends JFrame{
	
	protected JTextField username = new JTextField();
	protected JTextField password = new JTextField(120);
	protected JTextField clientIDOrKey = new JTextField();
	protected JTextField clientSecret = new JTextField();
	protected String[] sChoice = {"REST", "SOAP v2", "SOAP v1"};
	protected JComboBox jcbChoice = new JComboBox(sChoice);
	ImageIcon msgicon = new ImageIcon("bullicon.png");
	private JPanel pnl;
	private JTextArea lbl;
	
	
	public UserInterface() {
		initUI();
	}//end constructor
	
	private BullhornData executeREST(){
		
		Pattern p1 = Pattern.compile("[a-z0-9]{32}", Pattern.CASE_INSENSITIVE);
		Matcher m1 = p1.matcher(clientSecret.getText());
		boolean b1 = m1.find();
		Pattern p2 = Pattern.compile("[a-z0-9]{8}-[a-z0-9]{4}-[a-z0-9]{4}"+
				"-[a-z0-9]{4}-[a-z0-9]{12}", Pattern.CASE_INSENSITIVE);
		Matcher m2 = p2.matcher(clientIDOrKey.getText());
		boolean b2 = m2.find();
		System.out.print(password.getText());
		
		if(!b1||!b2)
			{
			
			if(!b1){
				JOptionPane.showMessageDialog(pnl, "A special character has been detected in your\n"+
						"Client Secret.", "Warning", JOptionPane.WARNING_MESSAGE, msgicon);
				clientSecret.setText("");}
			if(!b2){
				JOptionPane.showMessageDialog(pnl, "Your Client ID is not in the correct format", 
						"Warning", JOptionPane.WARNING_MESSAGE, msgicon);
				clientIDOrKey.setText("");}
			
			}
		else{
			
				BullhornRestCredentials creds = new BullhornRestCredentials();
				
				creds.setUsername(username.getText());
				creds.setPassword(password.getText());
				creds.setRestClientId(clientIDOrKey.getText());
				creds.setRestClientSecret(clientSecret.getText());
				creds.setRestAuthorizeUrl("https://auth.bullhornstaffing.com/oauth/authorize");
				creds.setRestTokenUrl("https://auth.bullhornstaffing.com/oauth/token");
				creds.setRestLoginUrl("https://rest.bullhornstaffing.com/rest-services/login");
				creds.setRestSessionMinutesToLive("10");
				
				BullhornData bullhornData =  new StandardBullhornData(creds);
				
				lbl = new JTextArea("Here is your new token:\n\n"+ bullhornData.getBhRestToken());
				lbl.setEditable(false);
				JOptionPane.showMessageDialog(null,	lbl, "reBHresh", JOptionPane.INFORMATION_MESSAGE, msgicon);
				return bullhornData;			
		}
		return null;
	}//end executeREST
	
	private Session executeSOAPv2() throws MalformedURLException, SOAPFaultException, WebServiceException{		
			
			ApiService api = SoapFactory.load("https://api.bullhornstaffing.com/", "2.6");;
			Session session = new Session(api);
			User user = new User(clientIDOrKey.getText(), username.getText(), password.getText());
			session.logIn(user);
			
			lbl = new JTextArea("Here is your new token:\n\n"+ session.session());
			lbl.setEditable(false);
			JOptionPane.showMessageDialog(null, lbl, "reBHresh", JOptionPane.INFORMATION_MESSAGE, msgicon);
			return session;
			
	}//end executeSOAPv2
	
	private com.bullhorn.apiservice.session.ApiSession executeSOAPv1() throws MalformedURLException, SOAPFaultException,
	WebServiceException{
					
			QName SERVICE_NAME = new QName("http://apiservice.bullhorn.com/", "ApiService");
			
			URL serviceUrl = new URL(ApiService_Service.class.getResource("."), 
					"https://api.bullhornstaffing.com/webservices-1.0/?wsdl");
			com.bullhorn.apiservice.ApiService service = 
					new com.bullhorn.apiservice.ApiService_Service(serviceUrl, SERVICE_NAME).getApiServicePort();

	        // // Start an API session with the authentication information
			com.bullhorn.apiservice.session.ApiSession currentSession = service.startSession(username.getText(), 
					password.getText(), clientIDOrKey.getText());
	        
			lbl = new JTextArea("Here is your new token:\n\n"+currentSession.getClient());
			lbl.setEditable(false);
			JOptionPane.showMessageDialog(null, lbl, "reBHresh", JOptionPane.INFORMATION_MESSAGE, msgicon);
	        return currentSession;	
	}
	
	private void initUI(){
		
		JLabel un = new JLabel("Username: ");
		JLabel pw = new JLabel("Password: ");
		JLabel cID = new JLabel("Client ID: ");
		JLabel cscrt = new JLabel("Client Secret: ");
		JLabel aK = new JLabel("apiKey: ");
		aK.setVisible(false);
		JButton go = new JButton("Go!");
		jcbChoice.setSelectedIndex(0);
		boolean bClock;
		
		jcbChoice.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e){
				
				if(!jcbChoice.getSelectedItem().equals(sChoice[0])){
					clientSecret.setVisible(false);
					cID.setVisible(false);
					cscrt.setVisible(false);
					aK.setVisible(true);}
				else{
					clientSecret.setVisible(true);
					cID.setVisible(true);
					cscrt.setVisible(true);
					aK.setVisible(false);}					
				
			}
		});
		
		go.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e){
				
				Clock clock;
				
				if(jcbChoice.getSelectedItem().equals(sChoice[0])){
					clock = new Clock(executeREST(), null, null, 1);
					dispose();}
				else {
					Pattern p = Pattern.compile("[a-z0-9]{8}-[a-z0-9]{4}-[a-z0-9]{4}"+
							"-[a-z0-9]{16}", Pattern.CASE_INSENSITIVE);
					Matcher m = p.matcher(clientIDOrKey.getText());
					boolean b = m.find();
					
					if(!b){
						JOptionPane.showMessageDialog(pnl, "Your apiKey is not in the correct format", 
								"Warning", JOptionPane.WARNING_MESSAGE, msgicon);
						clientIDOrKey.setText("");}
					else
					if(jcbChoice.getSelectedItem().equals(sChoice[1])){
					try {
						clock = new Clock(null, executeSOAPv2(), null, 2);
						dispose();
					} catch (MalformedURLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch(SOAPFaultException e1){					
						e1.printStackTrace();
						JOptionPane.showMessageDialog(pnl, "Bad Creds.\n\nchek urself b4 u rek urself brah", "reBHresh",
								JOptionPane.WARNING_MESSAGE, msgicon);
					}
					catch(WebServiceException e2){
						JOptionPane.showMessageDialog(pnl, "Dude...\n\nYou aren't connected to the internet."+
								"\n\nDo you even computer?", "reBHresh",
								JOptionPane.WARNING_MESSAGE, msgicon);
					}}
				else
					try {
						clock = new Clock(null, null, executeSOAPv1(), 3);
						dispose();
					} catch (MalformedURLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch(SOAPFaultException e1){					
					e1.printStackTrace();
					JOptionPane.showMessageDialog(pnl, "Bad Creds.\n\nchek urself b4 u rek urself brah", "reBHresh",
							JOptionPane.WARNING_MESSAGE, msgicon);}
					catch(WebServiceException e2){
						JOptionPane.showMessageDialog(pnl, "Dude...\n\nYou aren't connected to the internet."+
								"\n\nDo you even computer?", "reBHresh",
								JOptionPane.WARNING_MESSAGE, msgicon);}
					
				}
			}
			
		});
		
		createLayout(jcbChoice, un, username, pw, password, cID, aK, clientIDOrKey, cscrt, clientSecret, go);
		
		setIconImage(msgicon.getImage());
		setTitle("reBHresh");
		setSize(300, 245);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}//end initUI
	
	private void createLayout(JComponent... arg)
	{//start createLayout
		
		Container pane = getContentPane();
		GroupLayout gl = new GroupLayout(pane);
		pane.setLayout(gl);
		
		gl.setHorizontalGroup(gl.createSequentialGroup()
				.addGap(50)
				.addGroup(gl.createParallelGroup()
						.addComponent(arg[0])
						.addComponent(arg[1])
						.addComponent(arg[2])
						.addComponent(arg[3])
						.addComponent(arg[4])
						.addComponent(arg[5])
						.addComponent(arg[6])
						.addComponent(arg[7])
						.addComponent(arg[8])
						.addComponent(arg[9])
						.addComponent(arg[10]))
				.addGap(50)
		);
		
		gl.setVerticalGroup(gl.createSequentialGroup()
				.addGroup(gl.createSequentialGroup()
						.addComponent(arg[0],GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, 
								GroupLayout.PREFERRED_SIZE)
						.addComponent(arg[1])
						.addComponent(arg[2],GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, 
								GroupLayout.PREFERRED_SIZE)
						.addComponent(arg[3])
						.addComponent(arg[4],GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, 
								GroupLayout.PREFERRED_SIZE)
						.addComponent(arg[5])
						.addComponent(arg[6])
						.addComponent(arg[7], GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, 
								GroupLayout.PREFERRED_SIZE)
						.addComponent(arg[8])
						.addComponent(arg[9], GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, 
								GroupLayout.PREFERRED_SIZE)
						.addComponent(arg[10]))
		);
		
		pack();
		
	}//end createLayout
}