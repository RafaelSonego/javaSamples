package soapWebServices.soap.publish;

import javax.xml.ws.Endpoint;

import soapWebServices.soap.impl.CalcServerImpl;

public class CalcServerPublisher {
	public static void main(String[] args) {
		Endpoint.publish("http://127.0.0.1/teste", new CalcServerImpl());
	}

}
