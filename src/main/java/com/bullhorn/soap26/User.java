package com.bullhorn.soap26;

public class User {
	private String apiKey;
	private String userName;
	private String password;

	public User(){}
	public User(String apiKey, String userName, String password) {
		this.apiKey = apiKey;
		this.userName = userName;
		this.password = password;
	}

	public String getApiKey() {
		return apiKey;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}
}
