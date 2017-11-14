package com.bullhorn.soap26;

import com.bullhorn.soap26.User;
import com.bullhorn.soap26.ApiService;
import com.bullhorn.soap26.ApiStartSessionResult;

public class Session {
	private ApiService api;
	private ApiStartSessionResult startSessionResult;

	public Session(ApiService api) {
		this.api = api;
	}
	
	public boolean logIn(User user) {
		startSessionResult = api.startSession(user.getUserName(), user.getPassword(), user.getApiKey());
		return true;
	}

	public void logOut() {
		startSessionResult = null;
	}

	public String session() {
		return startSessionResult.getSession();
	}
}
