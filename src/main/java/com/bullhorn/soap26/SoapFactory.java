package com.bullhorn.soap26;

import java.net.URL;
import javax.xml.namespace.QName;

public class SoapFactory {
	public static com.bullhorn.soap26.ApiService load(String baseUrl, String version) {
		URL wsdlLocation = Util.buildUrl(baseUrl, version);
		QName serviceName = new QName("http://apiservice.bullhorn.com/", "ApiService");
		com.bullhorn.soap26.ApiService_Service apiService_service = new com.bullhorn.soap26.ApiService_Service(wsdlLocation, serviceName);
		return apiService_service.getApiServicePort();
	}

}
