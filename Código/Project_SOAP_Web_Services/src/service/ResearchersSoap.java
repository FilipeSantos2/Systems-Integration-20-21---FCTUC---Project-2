package service;


import java.util.Arrays;
import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import beans.ResearchersBeanRemote;

public class ResearchersSoap {
	
	public String[] getResearchers() {
		Context context;

		Properties jndiProperties = new Properties();

		jndiProperties.setProperty("java.naming.factory.initial", "org.jboss.naming.remote.client.InitialContextFactory");
		jndiProperties.setProperty("java.naming.provider.url","http-remoting://localhost:8080");
		jndiProperties.setProperty("jboss.naming.client.ejb.context","true");

		try {

			context = new InitialContext(jndiProperties);

			ResearchersBeanRemote myejb = (ResearchersBeanRemote) context.lookup("Project_EAR/Project_EJB/ResearchersBean!beans.ResearchersBeanRemote");
			
			
			Object[] oa = myejb.readResearchers().toArray();
			
			String[] stringArray = Arrays.copyOf(oa, oa.length, String[].class);
			
			return stringArray;
			
		} catch (NamingException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public String[] getSpecificResearcher(String name) {
		Context context;

		Properties jndiProperties = new Properties();

		jndiProperties.setProperty("java.naming.factory.initial", "org.jboss.naming.remote.client.InitialContextFactory");
		jndiProperties.setProperty("java.naming.provider.url","http-remoting://localhost:8080");
		jndiProperties.setProperty("jboss.naming.client.ejb.context","true");

		try {

			context = new InitialContext(jndiProperties);
			ResearchersBeanRemote myejb = (ResearchersBeanRemote) context.lookup("Project_EAR/Project_EJB/ResearchersBean!beans.ResearchersBeanRemote");
			
			
			Object[] oa = myejb.readSpecificResearcher(name).toArray();
			
			String[] stringArray = Arrays.copyOf(oa, oa.length, String[].class);
			
			return stringArray;
			
		} catch (NamingException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public String[] getSkillOwners(String skill) {
		Context context;

		Properties jndiProperties = new Properties();

		jndiProperties.setProperty("java.naming.factory.initial", "org.jboss.naming.remote.client.InitialContextFactory");
		jndiProperties.setProperty("java.naming.provider.url","http-remoting://localhost:8080");
		jndiProperties.setProperty("jboss.naming.client.ejb.context","true");

		try {

			context = new InitialContext(jndiProperties);
			ResearchersBeanRemote myejb = (ResearchersBeanRemote) context.lookup("Project_EAR/Project_EJB/ResearchersBean!beans.ResearchersBeanRemote");
			
			
			Object[] oa = myejb.readSkillOwners(skill).toArray();
			
			String[] stringArray = Arrays.copyOf(oa, oa.length, String[].class);
			
			return stringArray;
			
		} catch (NamingException e) {
			e.printStackTrace();
		}
		return null;
	}
}
