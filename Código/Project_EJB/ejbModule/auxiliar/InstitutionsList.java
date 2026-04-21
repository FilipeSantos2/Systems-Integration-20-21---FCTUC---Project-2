package auxiliar;

import java.util.ArrayList;

import copy.InstitutionsCopy;

public class InstitutionsList {
	private ArrayList<InstitutionsCopy> institutionsList = new ArrayList<InstitutionsCopy>();
	
	public InstitutionsList() {
	}
	
	public InstitutionsList(ArrayList<InstitutionsCopy> institutionsList) {
		super();
		this.institutionsList = institutionsList;
	}

	public ArrayList<InstitutionsCopy> getInstitutionsList() {
		return institutionsList;
	}

	public void setInstitutionsList(ArrayList<InstitutionsCopy> institutionsList) {
		this.institutionsList = institutionsList;
	}
	
}
