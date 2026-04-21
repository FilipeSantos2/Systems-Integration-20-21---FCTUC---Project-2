package entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table(name = "researchers")
public class Researchers implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// we use this generation type to match that of SQLWriteStudents
	@Id
	private String name;
	private int numberofpublications;
	private int reads;
	private int citations;
	private String institutions_name;
	
	@ManyToOne
    @JoinColumn(name = "institutions_name", insertable = false, updatable = false)
	private Institutions institution;

	@ManyToMany
	@JoinTable(
	  name = "researchers_skillsandexpertise", 
	  joinColumns = @JoinColumn(name = "researchers_name"), 
	  inverseJoinColumns = @JoinColumn(name = "skillsandexpertise_skill"))
	private Set<SkillsAndExpertise> skills = new HashSet<>();
	
	@ManyToMany
	@JoinTable(
		name = "researchers_publications", 
		joinColumns = @JoinColumn(name = "researchers_name"), 
		inverseJoinColumns = @JoinColumn(name = "publications_id"))
	private Set<Publications> publications = new HashSet<>();
	
	public Researchers() {
	}

	

	public Researchers(String name, int numberofpublications, int reads, int citations, String institutions_name,
			Institutions institution, Set<SkillsAndExpertise> skills, Set<Publications> publications) {
		super();
		this.name = name;
		this.numberofpublications = numberofpublications;
		this.reads = reads;
		this.citations = citations;
		this.institutions_name = institutions_name;
		this.institution = institution;
		this.skills = skills;
		this.publications = publications;
	}
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getNumberofpublications() {
		return numberofpublications;
	}



	public void setNumberofpublications(int numberofpublications) {
		this.numberofpublications = numberofpublications;
	}



	public int getReads() {
		return reads;
	}



	public void setReads(int reads) {
		this.reads = reads;
	}



	public int getCitations() {
		return citations;
	}



	public void setCitations(int citations) {
		this.citations = citations;
	}



	public String getInstitutions_name() {
		return institutions_name;
	}



	public void setInstitutions_name(String institutions_name) {
		this.institutions_name = institutions_name;
	}



	public Institutions getInstitution() {
		return institution;
	}



	public void setInstitution(Institutions institution) {
		this.institution = institution;
	}



	public Set<SkillsAndExpertise> getSkills() {
		return skills;
	}



	public void setSkills(Set<SkillsAndExpertise> skills) {
		this.skills = skills;
	}



	public Set<Publications> getPublications() {
		return publications;
	}



	public void setPublications(Set<Publications> publications) {
		this.publications = publications;
	}



	@Override
	public String toString() {
		return "Researchers [name=" + name + ", numberofpublications=" + numberofpublications + ", reads=" + reads
				+ ", citations=" + citations + ", institutions_name=" /*+ institutions_name /*+ ", skills=" + skills*/ + "]";
	}
}
