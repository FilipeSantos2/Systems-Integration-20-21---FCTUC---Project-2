package beans;

import java.util.ArrayList;

import javax.ejb.Remote;

@Remote
public interface PublicationsBeanRemote {
	public ArrayList<String> readPublications();
	public ArrayList<String> readSpecificPublication(String title);
	public ArrayList<String> readResearcherPublications(String name);
}
