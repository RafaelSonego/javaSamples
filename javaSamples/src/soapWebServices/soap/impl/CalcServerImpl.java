package soapWebServices.soap.impl;

import javax.jws.WebService;

import soapWebServices.soap.CalcServer;

//SIB - Service Implementation Bean
@WebService(endpointInterface = "soapWebServices.soap.CalcServer") //Propriedade endpointInterface faz conectar com a SEI 
public class CalcServerImpl implements CalcServer {

	@Override
	public float sum(float number1, float number2) {
		return number1 + number2;
	}

	@Override
	public float division(float number1, float number2) {
		return number1 / number2;
	}

	@Override
	public float multiplication(float number1, float number2) {
		return number1 * number2;
	}

	@Override
	public float subtracty(float number1, float number2) {
		return number1 - number2;
	}

}
