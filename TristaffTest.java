package reBHresh;

//Used Bullhorn's REST and SOAP SDKs to change every comment or description field in every recordin a test database to 
//"kfred wuz hurr" with the record owner's Primary Private Label ID number after it

import com.bullhorn.apiservice.query.DtoQuery;
import com.bullhorn.apiservice.result.ApiFindResult;
import com.bullhorn.apiservice.result.ApiQueryResult;
import com.bullhorn.apiservice.session.ApiSession;
import com.bullhorn.apiservice.ApiService;
import com.bullhorn.entity.user.CorporateUserDto;
import com.bullhorn.apiservice.ApiService_Service;
import java.net.*;
import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.api.BullhornRestCredentials;
import com.bullhornsdk.data.api.StandardBullhornData;
import com.bullhornsdk.data.exception.RestApiException;
import com.bullhornsdk.data.model.entity.core.standard.Appointment;
import com.bullhornsdk.data.model.entity.core.standard.Placement;
import com.bullhornsdk.data.model.entity.core.standard.Task;
import com.bullhornsdk.data.model.entity.core.standard.Tearsheet;
import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.bullhornsdk.data.model.entity.core.standard.Category;
import com.bullhornsdk.data.model.entity.core.standard.ClientContact;
import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.bullhornsdk.data.model.entity.core.standard.JobOrder;
import com.bullhornsdk.data.model.entity.core.standard.JobSubmission;
import com.bullhornsdk.data.model.entity.core.standard.Note;
import com.bullhornsdk.data.model.entity.core.standard.NoteEntity;
import com.bullhornsdk.data.model.parameter.QueryParams;
import com.bullhornsdk.data.model.parameter.SearchParams;
import com.bullhornsdk.data.model.parameter.standard.ParamFactory;
import com.bullhornsdk.data.model.response.list.NoteEntityListWrapper;
import com.bullhornsdk.data.model.response.list.AppointmentListWrapper;
import com.bullhornsdk.data.model.response.list.PlacementListWrapper;
import com.bullhornsdk.data.model.response.list.TaskListWrapper;
import com.bullhornsdk.data.model.response.list.TearsheetListWrapper;
import com.bullhornsdk.data.model.response.list.CandidateListWrapper;
import com.bullhornsdk.data.model.response.list.ClientContactListWrapper;
import com.bullhornsdk.data.model.response.list.JobOrderListWrapper;
import com.bullhornsdk.data.model.response.list.JobSubmissionListWrapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.joda.JodaModule;
import com.google.common.collect.Sets;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.xml.namespace.QName;

public class TristaffTest{
	
	private String password = "Christos1!";
	private String username = "kfred.bbo";
	private QueryParams params = ParamFactory.queryParams();
	private SearchParams searchparams = ParamFactory.searchParams();
	private Set<String> fields = Sets.newHashSet("id");
	private ObjectMapper mapper = new ObjectMapper();
	private Pattern p = Pattern.compile("id(\"\\:)(.*?)(\\})");
	private Matcher m;
	private Appointment appointment = new Appointment();
	private AppointmentListWrapper appList;
	private Placement placement = new Placement();
	private PlacementListWrapper placementList;
	private Task task = new Task();
	private TaskListWrapper taskList;
	private JobSubmission jobSubmission = new JobSubmission();
	private JobSubmissionListWrapper jobSublist;
	private Tearsheet tearsheet = new Tearsheet();
	private TearsheetListWrapper tearsheetList;
	private Candidate candidate = new Candidate();
	private CandidateListWrapper candidateList;
	private ClientContact contact = new ClientContact();
	private ClientContactListWrapper contactList;
	private ClientCorporation corporation = new ClientCorporation();
	private JobOrder job = new JobOrder();
	private JobOrderListWrapper jobList;
	private NoteEntity note = new NoteEntity();
	private NoteEntityListWrapper noteList;
	Category category = new Category(1475325);
	ArrayList<Integer> companies = new ArrayList<Integer>();
	
	private TristaffTest() throws MalformedURLException, JsonProcessingException, RestApiException{
		init();
	}
	
	private void init() throws MalformedURLException, JsonProcessingException{
		
		QName SERVICE_NAME = new QName("http://apiservice.bullhorn.com/", "ApiService");
		
		URL serviceUrl = new URL(ApiService_Service.class.getResource("."),
				"https://api.bullhornstaffing.com/webservices-1.0/?wsdl");
		ApiService service = new ApiService_Service(serviceUrl, SERVICE_NAME).getApiServicePort();

		ApiSession currentSession = service.startSession(username, password, "BED3FC9B-CC34-C1DC-1DF10ECBEB058996");
		
		BullhornRestCredentials creds = new BullhornRestCredentials();		
		creds.setUsername(username);
		creds.setPassword(password);
		creds.setRestClientId("5a3978c9-05fb-4c05-8c74-9801bc265ee0");
		creds.setRestClientSecret("MyTvghTA9Olz0UBrXmruo0AeDWvXenLB");
		creds.setRestAuthorizeUrl("https://auth.bullhornstaffing.com/oauth/authorize");
		creds.setRestTokenUrl("https://auth.bullhornstaffing.com/oauth/token");
		creds.setRestLoginUrl("https://rest.bullhornstaffing.com/rest-services/login");
		creds.setRestSessionMinutesToLive("10");
		
		DtoQuery users = new DtoQuery();
		users.setEntityName("CorporateUser");
		ApiQueryResult queryResult = service.query(currentSession, users); 
		currentSession = queryResult.getSession();
		BullhornData rest =  new StandardBullhornData(creds);
		String troll;
		int userID;		
		
		for (int i = 0; i < queryResult.getIds().size(); i++)
		{
			
			if(i != 0) 
				currentSession = service.startSession(username, password, "BED3FC9B-CC34-C1DC-1DF10ECBEB058996");
			ApiFindResult user = service.find(currentSession, "CorporateUser", queryResult.getIds().get(i));
			CorporateUserDto thisUser = (CorporateUserDto)user.getDto();
			troll = "kfred wuz hurr "+thisUser.getPrimaryPrivateLabelID();
			userID = thisUser.getUserID();
			rest(userID, troll, rest, 1);
			rest(userID, troll, rest, 2);
			rest(userID, troll, rest, 3);
			rest(userID, troll, rest, 4);
			rest(userID, troll, rest, 5);
			rest(userID, troll, rest, 6);
			rest(userID, troll, rest, 7);
			rest(userID, troll, rest, 8);
			
		}	
		System.out.println("Success!!");
		
	}
	
	private void rest(int user, String troll, BullhornData rest, int entitySwitch){
		
		mapper.registerModule(new JodaModule());
		
		int count = 500;
		int start = 0;
		
		switch(entitySwitch){
		
		case 1:{
			
			try {
				do{
					
				searchparams.setStart(start);
				candidateList = (CandidateListWrapper) rest.search(candidate.getClass(), 
						"owner.id:"+user, fields, searchparams);
				
				if(candidateList.getCount()!=0){
				Matcher m = p.matcher(mapper.writeValueAsString(candidateList.getData()));
				
				while(m.find()){
					int id = Integer.parseInt(m.group(2));
				
					candidate = new Candidate(id);
					candidate.setComments(troll);
					rest.updateEntity(candidate);
					System.out.println("Success!");
					
					}
				
				}
				
				if (candidateList.getCount()==500)
					start += 500;
				else
					count = candidateList.getCount();}while (count == 500);
				System.out.println("Candidate Success! " + user);
					rest.refreshBhRestToken();
				
			} catch (JsonProcessingException e1) {
				e1.printStackTrace();
			}
			
		}
		break;
		case 2:{
			
			try {
				do{
					
				params.setStart(start);
				appList = (AppointmentListWrapper) rest.query(appointment.getClass(), 
						"owner.id=" + user, fields, params);
				
				if(appList.getCount()!=0){
				Matcher m = p.matcher(mapper.writeValueAsString(appList.getData()));
				
				while(m.find()){
					int id = Integer.parseInt(m.group(2));
				
					appointment = new Appointment(id);
					appointment.setDescription(troll);
					rest.updateEntity(appointment);
					
					}
				
				}
				
				if (appList.getCount()==500)
					start += 500;
				else
					count = appList.getCount();}while (count == 500);
				System.out.println("Appointment Success! " + user);
					rest.refreshBhRestToken();
				
			} catch (JsonProcessingException e1) {
				e1.printStackTrace();
			}
			
		}
		break;
		case 3:{
			
			Note note;
			try {
				do{
					
				params.setStart(start);
				noteList = (NoteEntityListWrapper) rest.query(this.note.getClass(), 
						"note.commentingPerson.id=" + user, fields, params);
				
				if(noteList.getCount()!=0){
				Matcher m = p.matcher(mapper.writeValueAsString(noteList.getData()));
				
				while(m.find()){
					int id = Integer.parseInt(m.group(2));
				
					note = new Note(id);
					note.setComments(troll);
					rest.updateEntity(note);
					
					}
				
				}
				
				if (noteList.getCount()==500)
					start += 500;
				else
					count = noteList.getCount();}while (count == 500);
				System.out.println("Note Success! " + user);
					rest.refreshBhRestToken();
				
			} catch (JsonProcessingException e1) {
				e1.printStackTrace();
			}catch (RestApiException e) {
				e.printStackTrace();
			}
			
		}
		break;
		case 4:{
			
			try {
				do{
					
				params.setStart(start);
				taskList = (TaskListWrapper) rest.query(task.getClass(), 
						"owner.id=" + user, fields, params);
				
				if(taskList.getCount()!=0){
				Matcher m = p.matcher(mapper.writeValueAsString(taskList.getData()));
				
				while(m.find()){
					int id = Integer.parseInt(m.group(2));
				
					task = new Task(id);
					task.setDescription(troll);
					rest.updateEntity(task);
					
					}
				
				}if (taskList.getCount()==500)
					start += 500;
				else
					count = taskList.getCount();}while (count == 500);
				System.out.println("Task Success! " + user);
					rest.refreshBhRestToken();
				
			} catch (JsonProcessingException e1) {
				e1.printStackTrace();
			}
			
		}
		break;
		case 5:{
			
			try {
				do{
					
				params.setStart(start);
				tearsheetList = (TearsheetListWrapper) rest.query(tearsheet.getClass(), 
						"owner.id=" + user, fields, params);
				
				if(tearsheetList.getCount()!=0){
				Matcher m = p.matcher(mapper.writeValueAsString(tearsheetList.getData()));
				
				while(m.find()){
					int id = Integer.parseInt(m.group(2));
				
					tearsheet = new Tearsheet(id);
					tearsheet.setDescription(troll);
					rest.updateEntity(tearsheet);
					
					}
				
				}if (tearsheetList.getCount()==500)
					start += 500;
				else
					count = tearsheetList.getCount();}while (count == 500);
				System.out.println("Tearsheet Success! " + user);
					rest.refreshBhRestToken();
				
			} catch (JsonProcessingException e1) {
				e1.printStackTrace();
			}
			
		}
		break;
		case 6:{
			
			try {
				do{
					
				params.setStart(start);
				contactList = (ClientContactListWrapper) rest.query(contact.getClass(), 
						"owner.id=" + user, fields, params);
				
				if(contactList.getCount()!=0){
				Matcher m = p.matcher(mapper.writeValueAsString(contactList.getData()));
				
				while(m.find()){
					int id = Integer.parseInt(m.group(2));
					
					contact = rest.findEntity(ClientContact.class, id);
					
					companies = companies(companies, contact.getClientCorporation().getId(), rest, troll);
					
					contact = new ClientContact(id);
					contact.setComments(troll);
					contact.setCategory(category);
					rest.updateEntity(contact);
					System.out.println("Contact " + id + " Success");
					
					}}if (contactList.getCount()==500)
						start += 500;
					else
						count = contactList.getCount();}while (count == 500);
					System.out.println("Contact and Company Success! " + user);
					rest.refreshBhRestToken();
				
			} catch (JsonProcessingException e1) {
				e1.printStackTrace();
			}catch (RestApiException e) {
				e.printStackTrace();
			}
			
		}
		break;
		case 7:{
			
			try {
				do{
					
				params.setStart(start);
				jobSublist = (JobSubmissionListWrapper) rest.query(jobSubmission.getClass(), 
						"sendingUser.id=" + user, fields, params);
				
				if(jobSublist.getCount()!=0){
				Matcher m = p.matcher(mapper.writeValueAsString(jobSublist.getData()));
				
				while(m.find()){
					int id = Integer.parseInt(m.group(2));
					
					jobSubmission = new JobSubmission(id);
					jobSubmission.setComments(troll);
					rest.updateEntity(jobSubmission);
					
					}}if (jobSublist.getCount()==500)
						start += 500;
					else
						count = jobSublist.getCount();}while (count == 500);
				System.out.println("Submission Success! " + user);
					rest.refreshBhRestToken();
				
			} catch (JsonProcessingException e1) {
				e1.printStackTrace();
			}
			
		}
		break;	
		case 8:{
			
			try {
				do{
					
				params.setStart(start);
				jobList = (JobOrderListWrapper) rest.query(job.getClass(), 
						"owner.id=" + user, fields, params);
				
				if(jobList.getCount()!=0){
				Matcher m = p.matcher(mapper.writeValueAsString(jobList.getData()));
				
				while(m.find()){
					int id = Integer.parseInt(m.group(2));
					
					jobs(id, rest, troll);
					job = new JobOrder(id);
					job.setDescription(troll);
					rest.updateEntity(job);
					
					}}if (jobList.getCount()==500)
						start += 500;
					else
						count = jobList.getCount();}while (count == 500);
					System.out.println("Job and Placement Success! " + user);
					rest.refreshBhRestToken();
				
			} catch (JsonProcessingException e1) {
				e1.printStackTrace();
			}
			
		}
		break;		
		}
		
	}
	
	private ArrayList<Integer> companies(ArrayList<Integer> companies, int corp, BullhornData rest, String troll){
		
		int floorIndex = -1;
		int ceilingIndex = companies.size();
		Collections.sort(companies);
		
		while(floorIndex+1<ceilingIndex){
			
			int difference = ceilingIndex - floorIndex;
			int halfDifference = difference/2;
			int guessIndex = floorIndex + halfDifference;
			
			int guessValue = companies.get(guessIndex);
			
			if (guessValue == corp){
				return companies;}
			if(guessValue > corp)
				ceilingIndex=guessIndex;
			else
				floorIndex=guessIndex;
			
		}
		
		corporation = rest.findEntity(ClientCorporation.class, corp);
		corporation.setCompanyDescription(troll);
		rest.updateEntity(corporation);
		companies.add(corp);
		System.out.println("Company " + corp + " Success!");
		return companies;
		
	}
	
	private void jobs(int jobID, BullhornData rest, String troll){
		
		int start = 0;
		int count = 500;
		
		try {
			do{
				
			params.setStart(start);
			placementList = (PlacementListWrapper) rest.query(placement.getClass(), 
					"jobOrder.id=" + jobID, fields, params);
			
			if(placementList.getCount()!=0){
			Matcher m = p.matcher(mapper.writeValueAsString(placementList.getData()));
			
			while(m.find()){
				int id = Integer.parseInt(m.group(2));
				
				placement = new Placement(id);
				placement.setComments(troll);
				rest.updateEntity(placement);
				System.out.println("Success!" + id);
				
				}}if (placementList.getCount()==500)
					start += 500;
				else
					count = placementList.getCount();}while (count == 500);
				System.out.println("Placement Success!" + jobID);
				rest.refreshBhRestToken();
			
		} catch (JsonProcessingException e1) {
			e1.printStackTrace();
		}
		
	}
	
	public static void main(String... args)
	{//start main
		
		EventQueue.invokeLater(new Runnable()
		{
	
			@Override
			public void run()
			{
				
				try {
					TristaffTest test = new TristaffTest();
				} catch (MalformedURLException e) {
					e.printStackTrace();
				} catch (JsonProcessingException e) {
					e.printStackTrace();
				} catch (RestApiException e) {
					e.printStackTrace();
				}
			}
			
		});
		
    }//end main

}
