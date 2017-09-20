/**
 * CalculadoraServiceImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soapWebServices;

public class CalculadoraServiceImplServiceLocator extends org.apache.axis.client.Service implements soapWebServices.CalculadoraServiceImplService {

    public CalculadoraServiceImplServiceLocator() {
    }


    public CalculadoraServiceImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CalculadoraServiceImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CalculadoraServiceImplPort
    private java.lang.String CalculadoraServiceImplPort_address = "http://127.0.0.1:9876/calc";

    public java.lang.String getCalculadoraServiceImplPortAddress() {
        return CalculadoraServiceImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CalculadoraServiceImplPortWSDDServiceName = "CalculadoraServiceImplPort";

    public java.lang.String getCalculadoraServiceImplPortWSDDServiceName() {
        return CalculadoraServiceImplPortWSDDServiceName;
    }

    public void setCalculadoraServiceImplPortWSDDServiceName(java.lang.String name) {
        CalculadoraServiceImplPortWSDDServiceName = name;
    }

    public soapWebServices.CalculadoraService getCalculadoraServiceImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CalculadoraServiceImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCalculadoraServiceImplPort(endpoint);
    }

    public soapWebServices.CalculadoraService getCalculadoraServiceImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            soapWebServices.CalculadoraServiceImplPortBindingStub _stub = new soapWebServices.CalculadoraServiceImplPortBindingStub(portAddress, this);
            _stub.setPortName(getCalculadoraServiceImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCalculadoraServiceImplPortEndpointAddress(java.lang.String address) {
        CalculadoraServiceImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (soapWebServices.CalculadoraService.class.isAssignableFrom(serviceEndpointInterface)) {
                soapWebServices.CalculadoraServiceImplPortBindingStub _stub = new soapWebServices.CalculadoraServiceImplPortBindingStub(new java.net.URL(CalculadoraServiceImplPort_address), this);
                _stub.setPortName(getCalculadoraServiceImplPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("CalculadoraServiceImplPort".equals(inputPortName)) {
            return getCalculadoraServiceImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservices/", "CalculadoraServiceImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservices/", "CalculadoraServiceImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CalculadoraServiceImplPort".equals(portName)) {
            setCalculadoraServiceImplPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
