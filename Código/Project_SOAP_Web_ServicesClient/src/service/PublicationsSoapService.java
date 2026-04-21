/**
 * PublicationsSoapService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service;

public interface PublicationsSoapService extends javax.xml.rpc.Service {
    public java.lang.String getPublicationsSoapAddress();

    public service.PublicationsSoap getPublicationsSoap() throws javax.xml.rpc.ServiceException;

    public service.PublicationsSoap getPublicationsSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
