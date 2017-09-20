/**
 * CalculadoraService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soapWebServices;

public interface CalculadoraService extends java.rmi.Remote {
    public float soma(float arg0, float arg1) throws java.rmi.RemoteException;
    public float subtracao(float arg0, float arg1) throws java.rmi.RemoteException;
    public float multiplicacao(float arg0, float arg1) throws java.rmi.RemoteException;
    public float divisao(float arg0, float arg1) throws java.rmi.RemoteException;
}
