/**
 * ResearchersSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service;

public interface ResearchersSoap extends java.rmi.Remote {
    public java.lang.String[] getSpecificResearcher(java.lang.String name) throws java.rmi.RemoteException;
    public java.lang.String[] getResearchers() throws java.rmi.RemoteException;
    public java.lang.String[] getSkillOwners(java.lang.String skill) throws java.rmi.RemoteException;
}
