package beans;

import java.util.ArrayList;

import javax.ejb.Local;

@Local
public interface ResearchersBeanLocal {
	public ArrayList<String> readResearchers();
	public ArrayList<String> readSpecificResearcher(String name);
	public ArrayList<String> readSkillOwners(String skill);
}
