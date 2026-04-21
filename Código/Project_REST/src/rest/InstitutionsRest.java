package rest;

import java.util.ArrayList;
import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import auxiliar.InstitutionsList;
import beans.InstitutionsBeanRemote;
import copy.InstitutionsCopy;

@Path("/institution")
public class InstitutionsRest {
	
	public static void main(String[] args) {
	}
	
	@POST
	@Path("/post1")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getInstitutions(String s) {
		Context context;

		Properties jndiProperties = new Properties();

		jndiProperties.setProperty("java.naming.factory.initial", "org.jboss.naming.remote.client.InitialContextFactory");
		jndiProperties.setProperty("java.naming.provider.url","http-remoting://localhost:8080");
		jndiProperties.setProperty("jboss.naming.client.ejb.context","true");

		try {
			context = new InitialContext(jndiProperties);
			
			InstitutionsBeanRemote myejb = (InstitutionsBeanRemote) context.lookup("Project_EAR/Project_EJB/InstitutionsBean!beans.InstitutionsBeanRemote");
			
			ArrayList<InstitutionsCopy> is = myejb.readInstitutions();
			
			InstitutionsList isList = new InstitutionsList(is);
			
			return Response.status(Status.OK).entity(isList).build();
			
		} catch (NamingException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	@POST
	@Path("/post2")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getSpecificInstitution(String name) {
		Context context;

		Properties jndiProperties = new Properties();

		jndiProperties.setProperty("java.naming.factory.initial", "org.jboss.naming.remote.client.InitialContextFactory");
		jndiProperties.setProperty("java.naming.provider.url","http-remoting://localhost:8080");
		jndiProperties.setProperty("jboss.naming.client.ejb.context","true");

		try {
			context = new InitialContext(jndiProperties);

			InstitutionsBeanRemote myejb = (InstitutionsBeanRemote) context.lookup("Project_EAR/Project_EJB/InstitutionsBean!beans.InstitutionsBeanRemote");


			ArrayList<InstitutionsCopy> is = myejb.readSpecificInstitution(name);
			
			InstitutionsList isList = new InstitutionsList(is);
			
			return Response.status(Status.OK).entity(isList).build();
			
		} catch (NamingException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	@POST
	@Path("/post3")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getResearcherInstitution(String name) {
		Context context;

		Properties jndiProperties = new Properties();

		jndiProperties.setProperty("java.naming.factory.initial", "org.jboss.naming.remote.client.InitialContextFactory");
		jndiProperties.setProperty("java.naming.provider.url","http-remoting://localhost:8080");
		jndiProperties.setProperty("jboss.naming.client.ejb.context","true");

		try {
			context = new InitialContext(jndiProperties);
			
			InstitutionsBeanRemote myejb = (InstitutionsBeanRemote) context.lookup("Project_EAR/Project_EJB/InstitutionsBean!beans.InstitutionsBeanRemote");
			
			ArrayList<InstitutionsCopy> is = myejb.readResearchInstitution(name);
			
			InstitutionsList isList = new InstitutionsList(is);
			
			return Response.status(Status.OK).entity(isList).build();
			
		} catch (NamingException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
}
