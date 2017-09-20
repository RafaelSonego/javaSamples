package soapWebServices.client;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import soapWebServices.soap.CalcServer;

public class CalcClient {
	public static void main(String[] args) throws Exception {
		URL url = new URL("http://127.0.0.1/teste?wsdl");
		QName qname = new QName("http://impl.soap.soapWebServices/", "CalcServerImplService");
		Service service = Service.create(url, qname);
		CalcServer calcServer = service.getPort(CalcServer.class);
		System.out.println(calcServer.sum(2, 3));
	}
}
