package beans;

import java.util.ArrayList;

import javax.ejb.Remote;

@Remote
public interface ResearchersBeanRemote {
	public ArrayList<String> readResearchers();
	public ArrayList<String> readSpecificResearcher(String name);
	public ArrayList<String> readSkillOwners(String skill);
}
