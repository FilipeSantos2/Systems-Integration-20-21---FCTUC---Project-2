package copy;

import java.io.Serializable;
import java.util.ArrayList;


public class InstitutionsCopy implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// we use this generation type to match that of SQLWriteStudents

	private String name;
	private String location;
	private String department;
	
    private ArrayList<String> researchers = new ArrayList<>();
    
    public InstitutionsCopy() {
	}

	public InstitutionsCopy(String name, String location, String department, ArrayList<String> researchers) {
		super();
		this.name = name;
		this.location = location;
		this.department = department;
		this.researchers = researchers;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public ArrayList<String> getResearchers() {
		return researchers;
	}

	public void setResearchers(ArrayList<String> researchers) {
		this.researchers = researchers;
	}

	@Override
	public String toString() {
		return "InstitutionsCopy [name=" + name + ", location=" + location + ", department=" + department
				+ ", researchers=" + researchers + "]";
	}
	
	

	
}
