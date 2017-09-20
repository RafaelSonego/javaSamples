package soapWebServices;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class CalculadoraClient {

	public static void main(String[] args) throws Exception {
		URL url = new URL("http://127.0.0.1:9876/calc?wsdl");
		QName qname = new QName("http://webservices/", "CalculadoraServiceImplService");
		Service ws = Service.create(url, qname);
		CalculadoraService calc = ws.getPort(CalculadoraService.class);

		System.out.println(calc.soma(10, 5));

	}

}
