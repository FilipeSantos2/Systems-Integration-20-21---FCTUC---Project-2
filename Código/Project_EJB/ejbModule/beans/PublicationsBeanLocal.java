package beans;

import java.util.ArrayList;

import javax.ejb.Local;

@Local
public interface PublicationsBeanLocal {
	public ArrayList<String> readPublications();
	public ArrayList<String> readSpecificPublication(String title);
	public ArrayList<String> readResearcherPublications(String name);
}
