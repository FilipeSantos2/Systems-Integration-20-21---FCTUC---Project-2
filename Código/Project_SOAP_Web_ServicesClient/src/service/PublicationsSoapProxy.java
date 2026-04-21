package service;

public class PublicationsSoapProxy implements service.PublicationsSoap {
  private String _endpoint = null;
  private service.PublicationsSoap publicationsSoap = null;
  
  public PublicationsSoapProxy() {
    _initPublicationsSoapProxy();
  }
  
  public PublicationsSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initPublicationsSoapProxy();
  }
  
  private void _initPublicationsSoapProxy() {
    try {
      publicationsSoap = (new service.PublicationsSoapServiceLocator()).getPublicationsSoap();
      if (publicationsSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)publicationsSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)publicationsSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (publicationsSoap != null)
      ((javax.xml.rpc.Stub)publicationsSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public service.PublicationsSoap getPublicationsSoap() {
    if (publicationsSoap == null)
      _initPublicationsSoapProxy();
    return publicationsSoap;
  }
  
  public java.lang.String[] getResearcherPublications(java.lang.String name) throws java.rmi.RemoteException{
    if (publicationsSoap == null)
      _initPublicationsSoapProxy();
    return publicationsSoap.getResearcherPublications(name);
  }
  
  public java.lang.String[] getSpecificPublication(java.lang.String title) throws java.rmi.RemoteException{
    if (publicationsSoap == null)
      _initPublicationsSoapProxy();
    return publicationsSoap.getSpecificPublication(title);
  }
  
  public java.lang.String[] getPublications() throws java.rmi.RemoteException{
    if (publicationsSoap == null)
      _initPublicationsSoapProxy();
    return publicationsSoap.getPublications();
  }
  
  
}