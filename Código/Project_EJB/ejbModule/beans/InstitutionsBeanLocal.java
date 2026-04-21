package beans;

import java.util.ArrayList;

import javax.ejb.Local;

import copy.InstitutionsCopy;

@Local
public interface InstitutionsBeanLocal {
	public ArrayList<InstitutionsCopy> readInstitutions();
	public ArrayList<InstitutionsCopy> readSpecificInstitution(String name);
	public ArrayList<InstitutionsCopy> readResearchInstitution(String name);
}
