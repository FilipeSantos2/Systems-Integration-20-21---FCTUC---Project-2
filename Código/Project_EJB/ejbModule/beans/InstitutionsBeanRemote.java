package beans;

import java.util.ArrayList;

import javax.ejb.Remote;

import copy.InstitutionsCopy;

@Remote
public interface InstitutionsBeanRemote {
	public ArrayList<InstitutionsCopy> readInstitutions();
	public ArrayList<InstitutionsCopy> readSpecificInstitution(String name);
	public ArrayList<InstitutionsCopy> readResearchInstitution(String name);
}
