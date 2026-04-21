package entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "institutions")
public class Institutions implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// we use this generation type to match that of SQLWriteStudents
	@Id
	private String name;
	private String location;
	private String department;
	
	@OneToMany
    @JoinColumn(name = "institutions_name") // we need to duplicate the physical information
    private Set<Researchers> researchers;

	public Institutions() {
	}

	public Institutions(String name, String location, String department, Set<Researchers> researchers) {
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



	public Set<Researchers> getResearchers() {
		return researchers;
	}



	public void setResearchers(Set<Researchers> researchers) {
		this.researchers = researchers;
	}



	@Override
	public String toString() {
		return "Institution: " + name + ", " + "location: " + location + ", " + "Department: " + department;
	}
}
