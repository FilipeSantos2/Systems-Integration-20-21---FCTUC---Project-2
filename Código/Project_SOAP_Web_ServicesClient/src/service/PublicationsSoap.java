/**
 * PublicationsSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service;

public interface PublicationsSoap extends java.rmi.Remote {
    public java.lang.String[] getResearcherPublications(java.lang.String name) throws java.rmi.RemoteException;
    public java.lang.String[] getSpecificPublication(java.lang.String title) throws java.rmi.RemoteException;
    public java.lang.String[] getPublications() throws java.rmi.RemoteException;
}
