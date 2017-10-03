package reBHresh;

import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Duration;
import java.util.HashSet;
import java.util.Set;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import com.bullhornsdk.data.api.BullhornData;
import com.bullhorn.soap26.Session;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.parameter.QueryParams;
import com.bullhornsdk.data.model.parameter.standard.ParamFactory;
import com.bullhornsdk.data.model.response.list.CorporateUserListWrapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.joda.JodaModule;

public class Clock {

	ImageIcon msgicon = new ImageIcon("bullicon.png");
	
	public Clock(BullhornData rest, Session soapv2, com.bullhorn.apiservice.session.ApiSession soapv1, int selection) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                    ex.printStackTrace();
                }

                JFrame frame = new JFrame("reBHresh");
                JButton newSession = new JButton("New Session");
                newSession.addActionListener(new ActionListener() {
                    @Override
                    
                    public void actionPerformed(ActionEvent e) {
                        UserInterface ui = new UserInterface();
                        ui.setVisible(true);
                        frame.dispose();
                    }
                });
                frame.setIconImage(msgicon.getImage());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.add(new StopWatchPane(rest, soapv2, soapv1, selection, newSession));
                frame.setSize(175, 100);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }

    public class StopWatchPane extends JPanel {

        private JLabel label1;
        private JTextArea label2;
        private long lastTickTime;
        private Timer timer;
        CorporateUser corp = new CorporateUser();
        
        private void setVisible(){
        	setVisible(false);
        }

        public StopWatchPane(BullhornData rest, Session soapv2, com.bullhorn.apiservice.session.ApiSession soapv1,
        		int selection, JButton newSession) {
            setLayout(new GridBagLayout());
            label1 = new JLabel(String.format("%02d:%02d", 0, 0));

            timer = new Timer(100, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    long runningTime = System.currentTimeMillis() - lastTickTime;
                    Duration duration = Duration.ofMillis(runningTime);
                    long minutes = duration.toMinutes();
                    duration = duration.minusMinutes(minutes);
                    long millis = duration.toMillis();
                    long seconds = millis / 1000;
                    millis -= (seconds * 1000);
                    label1.setText(String.format("%02d:%02d", minutes, seconds));

        			Set<String> id = new HashSet<String>();
        			id.add("id>0");
        			QueryParams params = ParamFactory.queryParams();
        			CorporateUserListWrapper corpList = (CorporateUserListWrapper) rest.query(corp.getClass(), "id>0", null, params);
        			ObjectMapper mapper = new ObjectMapper();
        			mapper.registerModule(new JodaModule());
        			try {
						System.out.print(mapper.writeValueAsString(corpList));
					} catch (JsonProcessingException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
                 
                    if(selection == 1){
                    	
                    	if(minutes == 9 && seconds == 50){
                    		label2 = new JTextArea("Here is your new token:\n\n"+rest.getBhRestToken());
                			label2.setEditable(false);
                			JOptionPane.showMessageDialog(null, label2, "reBHresh", JOptionPane.INFORMATION_MESSAGE, msgicon);
                    		label1.setText(String.format("%02d:%02d", 0, 0));
                    		lastTickTime = System.currentTimeMillis();
                    	}
                    	
                    }
                    else{
                    	
                    	if(minutes == 4 && seconds == 50){
                    		if(selection == 2){
                    			label2 = new JTextArea("Here is your new token:\n\n"+soapv2.session());
                    			label2.setEditable(false);
                    			JOptionPane.showMessageDialog(null, label2, "reBHresh", JOptionPane.INFORMATION_MESSAGE, msgicon);}
                    		else{
                    			label2 = new JTextArea("Here is your new token:\n\n"+soapv1.getClient());
                    			label2.setEditable(false);
                    			JOptionPane.showMessageDialog(null, label2, "reBHresh", JOptionPane.INFORMATION_MESSAGE, msgicon);}
                    		label1.setText(String.format("%02d:%02d", 0, 0));
                    		lastTickTime = System.currentTimeMillis();
                    	}
                    
                    }
                }
            });
            
            lastTickTime = System.currentTimeMillis();
            timer.start();

            GridBagConstraints gbc = new GridBagConstraints();
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.weightx = 1;
            gbc.gridwidth = GridBagConstraints.REMAINDER;
            gbc.insets = new Insets(4, 4, 4, 4);
            add(label1, gbc);
              gbc.gridx = 0;
            gbc.gridy++;
            gbc.weightx = 0;
            gbc.gridwidth = 1;
            gbc.gridx++;
            add(newSession, gbc);
        }

    }

}