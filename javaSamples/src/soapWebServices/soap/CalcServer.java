package soapWebServices.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService // SEI - Service Endpoint Interface
@SOAPBinding(style = Style.RPC) // Remote Procedure Call - Vai empacotar e gerar o wsdl
public interface CalcServer {

	@WebMethod
	float sum(float number1, float number2);

	@WebMethod
	float division(float number1, float number2);

	@WebMethod
	float multiplication(float number1, float number2);

	@WebMethod
	float subtracty(float number1, float number2);

}
