package entities;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "publications")
public class Publications implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// we use this generation type to match that of SQLWriteStudents
	@Id
	private int id;
	private String title;
	private Date datepublication;
	private String doi;
	private String source;
	private String project;
	
	@Column(length=5000)
	private String abstract2;
	
	@ManyToMany(mappedBy = "publications")
	private Set<Researchers> researchers = new HashSet<>();

	public Publications() {
	}

	public Publications(int id, String title, Date datepublication, String doi, String source, String project,
			String abstract2, Set<Researchers> researchers) {
		super();
		this.id = id;
		this.title = title;
		this.datepublication = datepublication;
		this.doi = doi;
		this.source = source;
		this.project = project;
		this.abstract2 = abstract2;
		this.researchers = researchers;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getDatepublication() {
		return datepublication;
	}

	public void setDatepublication(Date datepublication) {
		this.datepublication = datepublication;
	}

	public String getDoi() {
		return doi;
	}

	public void setDoi(String doi) {
		this.doi = doi;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String getAbstract2() {
		return abstract2;
	}

	public void setAbstract2(String abstract2) {
		this.abstract2 = abstract2;
	}
	
	public Set<Researchers> getResearchers() {
		return researchers;
	}

	public void setResearchers(Set<Researchers> researchers) {
		this.researchers = researchers;
	}

	@Override
	public String toString() {
		return "Publications [id=" + id + ", title=" + title + ", date=" + datepublication + ", doi=" + doi + ", source=" + source
				+ ", project=" + project + ", abstract2=" + abstract2 + "]";
	}
	
	
	
}
