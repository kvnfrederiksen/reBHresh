package com.bullhorn.soap26;

import java.net.MalformedURLException;
import java.net.URL;

public class Util {
	public static URL buildUrl(String baseUrl, String version) {
		return buildUrl(baseUrl, version, false);
	}
	public static URL buildUrl(String baseUrl, String version, boolean isAdmin) {
		String url =  baseUrl + "webservices-" + version + "/" + (isAdmin ? "admin" : "") + "?wsdl";
		try {
			return new URL(url);
		} catch (MalformedURLException e) {
			throw new RuntimeException(e);
		}
	}

}
