package entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "skillsandexpertise")
public class SkillsAndExpertise implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// we use this generation type to match that of SQLWriteStudents
	@Id
	private String skill;
	
	@ManyToMany(mappedBy = "skills")
	private Set<Researchers> researchers = new HashSet<>();
	

	public SkillsAndExpertise() {
	}

	public SkillsAndExpertise(String skill) {
		super();
		this.skill = skill;
	}

	
	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	
	public Set<Researchers> getResearchers() {
		return researchers;
	}

	public void setResearchers(Set<Researchers> researchers) {
		this.researchers = researchers;
	}
	
	@Override
	public String toString() {
		return "SkillsAndExpertise [skill=" + skill + /*", researchers=" + researchers +*/ "]";
	}

	

}
