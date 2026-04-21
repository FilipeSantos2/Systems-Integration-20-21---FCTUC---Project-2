package service;

public class ResearchersSoapProxy implements service.ResearchersSoap {
  private String _endpoint = null;
  private service.ResearchersSoap researchersSoap = null;
  
  public ResearchersSoapProxy() {
    _initResearchersSoapProxy();
  }
  
  public ResearchersSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initResearchersSoapProxy();
  }
  
  private void _initResearchersSoapProxy() {
    try {
      researchersSoap = (new service.ResearchersSoapServiceLocator()).getResearchersSoap();
      if (researchersSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)researchersSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)researchersSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (researchersSoap != null)
      ((javax.xml.rpc.Stub)researchersSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public service.ResearchersSoap getResearchersSoap() {
    if (researchersSoap == null)
      _initResearchersSoapProxy();
    return researchersSoap;
  }
  
  public java.lang.String[] getSpecificResearcher(java.lang.String name) throws java.rmi.RemoteException{
    if (researchersSoap == null)
      _initResearchersSoapProxy();
    return researchersSoap.getSpecificResearcher(name);
  }
  
  public java.lang.String[] getResearchers() throws java.rmi.RemoteException{
    if (researchersSoap == null)
      _initResearchersSoapProxy();
    return researchersSoap.getResearchers();
  }
  
  public java.lang.String[] getSkillOwners(java.lang.String skill) throws java.rmi.RemoteException{
    if (researchersSoap == null)
      _initResearchersSoapProxy();
    return researchersSoap.getSkillOwners(skill);
  }
  
  
}