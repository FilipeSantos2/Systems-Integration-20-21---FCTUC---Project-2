/**
 * ResearchersSoapService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service;

public interface ResearchersSoapService extends javax.xml.rpc.Service {
    public java.lang.String getResearchersSoapAddress();

    public service.ResearchersSoap getResearchersSoap() throws javax.xml.rpc.ServiceException;

    public service.ResearchersSoap getResearchersSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
