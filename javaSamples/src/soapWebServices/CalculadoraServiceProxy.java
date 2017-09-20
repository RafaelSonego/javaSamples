package soapWebServices;

public class CalculadoraServiceProxy implements soapWebServices.CalculadoraService {
  private String _endpoint = null;
  private soapWebServices.CalculadoraService calculadoraService = null;
  
  public CalculadoraServiceProxy() {
    _initCalculadoraServiceProxy();
  }
  
  public CalculadoraServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initCalculadoraServiceProxy();
  }
  
  private void _initCalculadoraServiceProxy() {
    try {
      calculadoraService = (new soapWebServices.CalculadoraServiceImplServiceLocator()).getCalculadoraServiceImplPort();
      if (calculadoraService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)calculadoraService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)calculadoraService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (calculadoraService != null)
      ((javax.xml.rpc.Stub)calculadoraService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public soapWebServices.CalculadoraService getCalculadoraService() {
    if (calculadoraService == null)
      _initCalculadoraServiceProxy();
    return calculadoraService;
  }
  
  public float soma(float arg0, float arg1) throws java.rmi.RemoteException{
    if (calculadoraService == null)
      _initCalculadoraServiceProxy();
    return calculadoraService.soma(arg0, arg1);
  }
  
  public float subtracao(float arg0, float arg1) throws java.rmi.RemoteException{
    if (calculadoraService == null)
      _initCalculadoraServiceProxy();
    return calculadoraService.subtracao(arg0, arg1);
  }
  
  public float multiplicacao(float arg0, float arg1) throws java.rmi.RemoteException{
    if (calculadoraService == null)
      _initCalculadoraServiceProxy();
    return calculadoraService.multiplicacao(arg0, arg1);
  }
  
  public float divisao(float arg0, float arg1) throws java.rmi.RemoteException{
    if (calculadoraService == null)
      _initCalculadoraServiceProxy();
    return calculadoraService.divisao(arg0, arg1);
  }
  
  
}