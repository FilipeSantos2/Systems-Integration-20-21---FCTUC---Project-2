package service;

import java.util.Arrays;
import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import beans.PublicationsBeanRemote;
public class PublicationsSoap {
	public String[] getPublications() {
		Context context;

		Properties jndiProperties = new Properties();

		jndiProperties.setProperty("java.naming.factory.initial", "org.jboss.naming.remote.client.InitialContextFactory");
		jndiProperties.setProperty("java.naming.provider.url","http-remoting://localhost:8080");
		jndiProperties.setProperty("jboss.naming.client.ejb.context","true");

		try {

			context = new InitialContext(jndiProperties);
			PublicationsBeanRemote myejb = (PublicationsBeanRemote) context.lookup("Project_EAR/Project_EJB/PublicationsBean!beans.PublicationsBeanRemote");
			
			
			Object[] oa = myejb.readPublications().toArray();
			
			String[] stringArray = Arrays.copyOf(oa, oa.length, String[].class);
			
			return stringArray;
			
		} catch (NamingException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public String[] getSpecificPublication(String title) {
		Context context;

		Properties jndiProperties = new Properties();

		jndiProperties.setProperty("java.naming.factory.initial", "org.jboss.naming.remote.client.InitialContextFactory");
		jndiProperties.setProperty("java.naming.provider.url","http-remoting://localhost:8080");
		jndiProperties.setProperty("jboss.naming.client.ejb.context","true");

		try {

			context = new InitialContext(jndiProperties);
			PublicationsBeanRemote myejb = (PublicationsBeanRemote) context.lookup("Project_EAR/Project_EJB/PublicationsBean!beans.PublicationsBeanRemote");
			
			
			Object[] oa = myejb.readSpecificPublication(title).toArray();
			
			String[] stringArray = Arrays.copyOf(oa, oa.length, String[].class);
			
			return stringArray;
			
		} catch (NamingException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public String[] getResearcherPublications(String name) {
		Context context;

		Properties jndiProperties = new Properties();

		jndiProperties.setProperty("java.naming.factory.initial", "org.jboss.naming.remote.client.InitialContextFactory");
		jndiProperties.setProperty("java.naming.provider.url","http-remoting://localhost:8080");
		jndiProperties.setProperty("jboss.naming.client.ejb.context","true");

		try {

			context = new InitialContext(jndiProperties);
			PublicationsBeanRemote myejb = (PublicationsBeanRemote) context.lookup("Project_EAR/Project_EJB/PublicationsBean!beans.PublicationsBeanRemote");
			
			
			Object[] oa = myejb.readResearcherPublications(name).toArray();
			
			String[] stringArray = Arrays.copyOf(oa, oa.length, String[].class);
			
			return stringArray;
			
		} catch (NamingException e) {
			System.out.println("Mistake");
			e.printStackTrace();
		}
		return null;
	}
}
