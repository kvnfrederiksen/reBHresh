package com.bullhorn.soap26;

import com.bullhorn.soap26.Session;

public class TestMain {
	
	private static Session session;
	private static ApiService api;
	private static User user;
	
	public static void main(String[] args)
	{
		
		api = SoapFactory.load("https://api.bullhornstaffing.com/", "2.6");
		user = new User("1818023E-A783-8BBB-0A73AC116F2E8125", "kfrederiksenSL2", "Christos1!");
		session = new Session(api);
		session.logIn(user);
		System.out.print(session.session());
		
	}

}
