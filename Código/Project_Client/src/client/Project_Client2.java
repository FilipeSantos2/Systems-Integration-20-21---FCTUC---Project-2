package client;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


import auxiliar.InstitutionsList;
import copy.InstitutionsCopy;
import service.PublicationsSoapProxy;
import service.ResearchersSoapProxy;

public class Project_Client2{

	public static void main(String[] args) throws RemoteException {
		Project_Client2 c = new Project_Client2();
		Scanner myScanner = new Scanner(System.in);
		int iOption;
		while (true) {
			c.printOptions();
			iOption = Integer.parseInt(myScanner.nextLine());
			switch (iOption) {
			case 1:
				c.showResearchers();
				break;
			case 2:
				System.out.printf("Enter name: ");
				c.showSpecificResearcher(myScanner.nextLine());
				break;
			case 3:
				System.out.printf("Enter skill: ");
				c.showSkillOwners(myScanner.nextLine());
				break;
			case 4:
				c.showPublications();
				break;
			case 5:
				System.out.printf("Enter title: ");
				c.showSpecificPublication(myScanner.nextLine());
				break;
			case 6:
				System.out.printf("Enter name: ");
				c.showResearcherPublications(myScanner.nextLine());
				break;
			case 7:
				c.showInstitutions();
				break;
			case 8:
				System.out.printf("Enter name: ");
				c.showSpecificInstitution(myScanner.nextLine());
				break;
			case 9:
				System.out.printf("Enter name: ");
				c.showResearcherInstitution(myScanner.nextLine());
				break;
			case 10:
				myScanner.close();
				return;
			default:
				// code block
			}
		}
	}

	public void showResearchers() throws RemoteException {
		System.out.println("");
		ResearchersSoapProxy proxy = new ResearchersSoapProxy(
				"http://localhost:8080/Project_SOAP_Web_Services/services/ResearchersSoap");
		String[] s = proxy.getResearchers();
		ArrayList<String> wordList = new ArrayList<>();
		wordList = new ArrayList<String>(Arrays.asList(s));
		int i, j;
		int numberSkills;
		int numberPublications;
		for (i = 0; i < wordList.size(); ++i) {
			System.out.println("Name: " + wordList.get(i));
			i++;
			System.out.println("\tCitations: " + wordList.get(i));
			i++;
			System.out.println("\tNumber of publications: " + wordList.get(i));
			i++;
			System.out.println("\tNumber of Reads: " + wordList.get(i));
			i++;
			System.out.println("\tInstitution name: " + wordList.get(i));
			i++;
			System.out.println("");
			// Skills information
			numberSkills = Integer.parseInt(wordList.get(i));
			++i;
			System.out.printf("\tSkills: ");
			for (j = 0; j < numberSkills; ++j, ++i) {
				System.out.printf("%s; ", wordList.get(i));
			}
			System.out.println("");
			System.out.println("");
			// Publications informations
			numberPublications = Integer.parseInt(wordList.get(i));
			++i;
			System.out.println("\tPublications: ");
			for (j = 0; j < numberPublications; ++j, ++i) {
				System.out.println("\tTitle: " + wordList.get(i));
				++i;
				System.out.println("\tDate: " + wordList.get(i));
				++i;
				System.out.println("\tDOI: " + wordList.get(i));
				++i;
				System.out.println("\tSource: " + wordList.get(i));
				++i;
				System.out.println("\tProject: " + wordList.get(i));
				++i;
				System.out.println("\tAbstract: " + wordList.get(i));
				System.out.println("==============================================================================");

			}
			System.out.println("");
			--i;

			System.out.println("\n");
		}
	}

	public void showSpecificResearcher(String name) throws RemoteException {
		System.out.println("");
		ResearchersSoapProxy proxy = new ResearchersSoapProxy(
				"http://localhost:8080/Project_SOAP_Web_Services/services/ResearchersSoap");
		String[] s = proxy.getSpecificResearcher(name);
		ArrayList<String> wordList = new ArrayList<>();
		wordList = new ArrayList<String>(Arrays.asList(s));
		int i, j;
		int numberSkills;
		int numberPublications;
		for (i = 0; i < wordList.size(); ++i) {
			System.out.println("Name: " + wordList.get(i));
			i++;
			System.out.println("\tCitations: " + wordList.get(i));
			i++;
			System.out.println("\tNumber of publications: " + wordList.get(i));
			i++;
			System.out.println("\tNumber of Reads: " + wordList.get(i));
			i++;
			System.out.println("\tInstitution name: " + wordList.get(i));
			i++;
			System.out.println("");
			// Skills information
			numberSkills = Integer.parseInt(wordList.get(i));
			++i;
			System.out.printf("\tSkills: ");
			for (j = 0; j < numberSkills; ++j, ++i) {
				System.out.printf("%s; ", wordList.get(i));
			}
			System.out.println("");
			System.out.println("");
			// Publications informations
			numberPublications = Integer.parseInt(wordList.get(i));
			++i;
			System.out.println("\tPublications: ");
			for (j = 0; j < numberPublications; ++j, ++i) {
				System.out.println("\tTitle: " + wordList.get(i));
				++i;
				System.out.println("\tDate: " + wordList.get(i));
				++i;
				System.out.println("\tDOI: " + wordList.get(i));
				++i;
				System.out.println("\tSource: " + wordList.get(i));
				++i;
				System.out.println("\tProject: " + wordList.get(i));
				++i;
				System.out.println("\tAbstract: " + wordList.get(i));
				System.out.println("==============================================================================");

			}
			System.out.println("");
			--i;

			System.out.println("\n");
		}
	}

	public void showSkillOwners(String skill) throws RemoteException {
		System.out.println("");
		ResearchersSoapProxy proxy = new ResearchersSoapProxy(
				"http://localhost:8080/Project_SOAP_Web_Services/services/ResearchersSoap");
		String[] s = proxy.getSkillOwners(skill);
		ArrayList<String> wordList = new ArrayList<>();
		wordList = new ArrayList<String>(Arrays.asList(s));
		int i, j;
		int numberSkills;
		int numberPublications;
		for (i = 0; i < wordList.size(); ++i) {
			System.out.println("Name: " + wordList.get(i));
			i++;
			System.out.println("\tCitations: " + wordList.get(i));
			i++;
			System.out.println("\tNumber of publications: " + wordList.get(i));
			i++;
			System.out.println("\tNumber of Reads: " + wordList.get(i));
			i++;
			System.out.println("\tInstitution name: " + wordList.get(i));
			i++;
			System.out.println("");
			// Skills information
			numberSkills = Integer.parseInt(wordList.get(i));
			++i;
			System.out.printf("\tSkills: ");
			for (j = 0; j < numberSkills; ++j, ++i) {
				System.out.printf("%s; ", wordList.get(i));
			}
			System.out.println("");
			System.out.println("");
			// Publications informations
			numberPublications = Integer.parseInt(wordList.get(i));
			++i;
			System.out.println("\tPublications: ");
			for (j = 0; j < numberPublications; ++j, ++i) {
				System.out.println("\tTitle: " + wordList.get(i));
				++i;
				System.out.println("\tDate: " + wordList.get(i));
				++i;
				System.out.println("\tDOI: " + wordList.get(i));
				++i;
				System.out.println("\tSource: " + wordList.get(i));
				++i;
				System.out.println("\tProject: " + wordList.get(i));
				++i;
				System.out.println("\tAbstract: " + wordList.get(i));
				System.out.println("==============================================================================");

			}
			System.out.println("");
			--i;

			System.out.println("\n");
		}
	}

	public void showPublications() throws RemoteException {
		System.out.println("");
		PublicationsSoapProxy proxy = new PublicationsSoapProxy(
				"http://localhost:8080/Project_SOAP_Web_Services/services/PublicationsSoap");
		String[] s = proxy.getPublications();
		ArrayList<String> wordList = new ArrayList<>();
		wordList = new ArrayList<String>(Arrays.asList(s));
		int i, j;
		int numberResearchers;
		for (i = 0; i < wordList.size(); ++i) {
			System.out.println("Publication " + wordList.get(i));
			++i;
			System.out.println("\tTitle: " + wordList.get(i));
			++i;
			System.out.println("\tDate: " + wordList.get(i));
			++i;
			System.out.println("\tDOI: " + wordList.get(i));
			++i;
			System.out.println("\tSource: " + wordList.get(i));
			++i;
			System.out.println("\tProject: " + wordList.get(i));
			++i;
			System.out.println("\tAbstract: " + wordList.get(i));
			++i;
			numberResearchers = Integer.parseInt(wordList.get(i));
			++i;
			System.out.printf("\tResearchers: ");
			for(j = 0; j < numberResearchers; ++j, ++i) {
				System.out.printf("%s; ", wordList.get(i));
			}
			i--;
			System.out.println("\n");
			System.out.println("==============================================================================");

		}
		System.out.println("\n\n\n");
	}
	
	public void showSpecificPublication(String title) throws RemoteException {
		System.out.println("");
		PublicationsSoapProxy proxy = new PublicationsSoapProxy(
				"http://localhost:8080/Project_SOAP_Web_Services/services/PublicationsSoap");
		String[] s = proxy.getSpecificPublication(title);
		ArrayList<String> wordList = new ArrayList<>();
		wordList = new ArrayList<String>(Arrays.asList(s));
		int i, j;
		int numberResearchers;;
		for (i = 0; i < wordList.size(); ++i) {
			System.out.println("Publication " + wordList.get(i));
			++i;
			System.out.println("\tTitle: " + wordList.get(i));
			++i;
			System.out.println("\tDate: " + wordList.get(i));
			++i;
			System.out.println("\tDOI: " + wordList.get(i));
			++i;
			System.out.println("\tSource: " + wordList.get(i));
			++i;
			System.out.println("\tProject: " + wordList.get(i));
			++i;
			System.out.println("\tAbstract: " + wordList.get(i));
			++i;
			numberResearchers = Integer.parseInt(wordList.get(i));
			++i;
			System.out.printf("\tResearchers: ");
			for(j = 0; j < numberResearchers; ++j, ++i) {
				System.out.printf("%s; ", wordList.get(i));
			}
			i--;
			System.out.println("\n");
			System.out.println("==============================================================================");

		}
		System.out.println("\n\n\n");
	}
	
	public void showResearcherPublications(String name) throws RemoteException {
		System.out.println("");
		PublicationsSoapProxy proxy = new PublicationsSoapProxy(
				"http://localhost:8080/Project_SOAP_Web_Services/services/PublicationsSoap");
		String[] s = proxy.getResearcherPublications(name);
		ArrayList<String> wordList = new ArrayList<>();
		wordList = new ArrayList<String>(Arrays.asList(s));
		int i, j;
		int numberResearchers;;
		for (i = 0; i < wordList.size(); ++i) {
			System.out.println("Publication " + wordList.get(i));
			++i;
			System.out.println("\tTitle: " + wordList.get(i));
			++i;
			System.out.println("\tDate: " + wordList.get(i));
			++i;
			System.out.println("\tDOI: " + wordList.get(i));
			++i;
			System.out.println("\tSource: " + wordList.get(i));
			++i;
			System.out.println("\tProject: " + wordList.get(i));
			++i;
			System.out.println("\tAbstract: " + wordList.get(i));
			++i;
			numberResearchers = Integer.parseInt(wordList.get(i));
			++i;
			System.out.printf("\tResearchers: ");
			for(j = 0; j < numberResearchers; ++j, ++i) {
				System.out.printf("%s; ", wordList.get(i));
			}
			i--;
			System.out.println("\n");
			System.out.println("==============================================================================");

		}
		System.out.println("\n\n\n");
	}

	
	public void showInstitutions() {
		Client client = ClientBuilder.newClient();
		//client.register(JacksonJaxbJsonProvider.class);
		WebTarget target = client.target("http://localhost:8080/Project_REST/rest/institution/post1");
		Response response;

		InstitutionsList isList = new InstitutionsList();
		Entity<InstitutionsList> input = Entity.entity(isList, MediaType.APPLICATION_JSON);
		response = target.request().post(input);
		
		isList = response.readEntity(InstitutionsList.class);
		ArrayList<InstitutionsCopy> is = isList.getInstitutionsList();
		
		int i = 0, j;
		for(i = 0; i < is.size(); ++i) {
			System.out.println("Institution " + i);
			System.out.println("\tName: " + is.get(i).getName());
			System.out.println("\tLocation: " + is.get(i).getLocation());
			System.out.println("\tDepartment: " + is.get(i).getDepartment());
			System.out.println("");
			System.out.printf("\tResearcher(s): ");
			ArrayList<String> rs = is.get(i).getResearchers();
			for(j = 0; j < rs.size(); ++j) {
				System.out.printf("%s; ", rs.get(j));
			}
			System.out.println("\n");
		}
		
		response.close();
	}
	
	public void showSpecificInstitution(String name) {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080/Project_REST/rest/institution/post2");
		Response response;

		InstitutionsList isList = new InstitutionsList();
		Entity<String> input = Entity.entity(name, MediaType.APPLICATION_JSON);
		response = target.request().post(input);
		
		isList = response.readEntity(InstitutionsList.class);
		ArrayList<InstitutionsCopy> is = isList.getInstitutionsList();
		
		int i = 0, j;
		for(i = 0; i < is.size(); ++i) {
			System.out.println("Institution ");
			System.out.println("\tName: " + is.get(i).getName());
			System.out.println("\tLocation: " + is.get(i).getLocation());
			System.out.println("\tDepartment: " + is.get(i).getDepartment());
			System.out.println("");
			System.out.printf("\tResearcher(s): ");
			ArrayList<String> rs = is.get(i).getResearchers();
			for(j = 0; j < rs.size(); ++j) {
				System.out.printf("%s; ", rs.get(j));
			}
			System.out.println("\n");
		}
		
		
		response.close();
	}
	
	public void showResearcherInstitution(String name) {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080/Project_REST/rest/institution/post3");
		Response response;

		InstitutionsList isList = new InstitutionsList();
		Entity<String> input = Entity.entity(name, MediaType.APPLICATION_JSON);
		response = target.request().post(input);
		
		isList = response.readEntity(InstitutionsList.class);
		//Usar GenericType deve resolver as coisas com arrayList
		ArrayList<InstitutionsCopy> is = isList.getInstitutionsList();
		
		int i = 0, j;
		for(i = 0; i < is.size(); ++i) {
			System.out.println("Institution ");
			System.out.println("\tName: " + is.get(i).getName());
			System.out.println("\tLocation: " + is.get(i).getLocation());
			System.out.println("\tDepartment: " + is.get(i).getDepartment());
			System.out.println("");
			System.out.printf("\tResearcher(s): ");
			ArrayList<String> rs = is.get(i).getResearchers();
			for(j = 0; j < rs.size(); ++j) {
				System.out.printf("%s; ", rs.get(j));
			}
			System.out.println("\n");
		}
		
		
		response.close();
	}
	

	public void printOptions() {
		System.out.println("1. See all Researchers");
		System.out.println("2. See specific Researcher");
		System.out.println("3. See Skill's Owners");
		System.out.println("4. See all Publications");
		System.out.println("5. See specific Publication");
		System.out.println("6. See Researcher's Publications");
		System.out.println("7. See all Institutions");
		System.out.println("8. See specific Institution");
		System.out.println("9. See Researcher's Institution");
		System.out.println("10. Exit");
		System.out.printf("Choose Option: ");
	}
}
