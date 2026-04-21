package beans;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import entities.Publications;
import entities.Researchers;
import entities.SkillsAndExpertise;


/**
 * Session Bean implementation class ResearchersBean
 */
@Stateless
@LocalBean
public class ResearchersBean implements ResearchersBeanRemote, ResearchersBeanLocal {

	//ResearchersBean
	public ResearchersBean() {
        // TODO Auto-generated constructor stub
    }
	
	@PersistenceContext(name = "TestPersistence")
	private EntityManager em;
    public ArrayList<String> readResearchers() {
		String jpql = "SELECT r FROM Researchers r";
		TypedQuery<Researchers> typedQuery = em.createQuery(jpql, Researchers.class);
		List<Researchers> mylist = typedQuery.getResultList();
		ArrayList<String> rs = new ArrayList<>();
		Set<SkillsAndExpertise> skills = new HashSet<>();
		Set<Publications> publications = new HashSet<>();
		for (Researchers st : mylist) {
			rs.add(st.getName());
			rs.add(String.valueOf(st.getCitations()));
			rs.add(String.valueOf(st.getNumberofpublications()));
			rs.add(String.valueOf(st.getReads()));
			rs.add(st.getInstitutions_name());
			//Get Skills Information
			skills = st.getSkills();
			rs.add(String.valueOf(skills.size()));
			for (SkillsAndExpertise s : skills) {
			    rs.add(s.getSkill());
			}
			//Get Publication Information
			publications = st.getPublications();
			rs.add(String.valueOf(publications.size()));
			for (Publications p : publications) {
			    rs.add(p.getTitle());
			    rs.add(p.getDatepublication().toString());
			    rs.add(p.getDoi());
			    rs.add(p.getSource());
			    rs.add(p.getProject());
			    rs.add(p.getAbstract2());
			}
		}
		return rs;
    }
    
    public ArrayList<String> readSpecificResearcher(String name){
    	String jpql = "SELECT r FROM Researchers r WHERE r.name = :name2";
		TypedQuery<Researchers> typedQuery = em.createQuery(jpql, Researchers.class).setParameter("name2", name);;
		List<Researchers> mylist = typedQuery.getResultList();
		ArrayList<String> rs = new ArrayList<>();
		Set<SkillsAndExpertise> skills = new HashSet<>();
		Set<Publications> publications = new HashSet<>();
		for (Researchers st : mylist) {
			rs.add(st.getName());
			rs.add(String.valueOf(st.getCitations()));
			rs.add(String.valueOf(st.getNumberofpublications()));
			rs.add(String.valueOf(st.getReads()));
			rs.add(st.getInstitutions_name());
			//Get Skills Information
			skills = st.getSkills();
			rs.add(String.valueOf(skills.size()));
			for (SkillsAndExpertise s : skills) {
			    rs.add(s.getSkill());
			}
			//Get Publication Information
			publications = st.getPublications();
			rs.add(String.valueOf(publications.size()));
			for (Publications p : publications) {
			    rs.add(p.getTitle());
			    rs.add(p.getDatepublication().toString());
			    rs.add(p.getDoi());
			    rs.add(p.getSource());
			    rs.add(p.getProject());
			    rs.add(p.getAbstract2());
			}
		}
		return rs;
    }
    
    public ArrayList<String> readSkillOwners(String skill){
    	String jpql = "SELECT s FROM Researchers s, IN (s.skills) t WHERE t.skill = :skill2";
		TypedQuery<Researchers> typedQuery = em.createQuery(jpql, Researchers.class).setParameter("skill2", skill);
		List<Researchers> mylist = typedQuery.getResultList();
		ArrayList<String> rs = new ArrayList<>();
		Set<SkillsAndExpertise> skills = new HashSet<>();
		Set<Publications> publications = new HashSet<>();
		for (Researchers st : mylist) {
			rs.add(st.getName());
			rs.add(String.valueOf(st.getCitations()));
			rs.add(String.valueOf(st.getNumberofpublications()));
			rs.add(String.valueOf(st.getReads()));
			rs.add(st.getInstitutions_name());
			//Get Skills Information
			skills = st.getSkills();
			rs.add(String.valueOf(skills.size()));
			for (SkillsAndExpertise s : skills) {
			    rs.add(s.getSkill());
			}
			//Get Publication Information
			publications = st.getPublications();
			rs.add(String.valueOf(publications.size()));
			for (Publications p : publications) {
			    rs.add(p.getTitle());
			    rs.add(p.getDatepublication().toString());
			    rs.add(p.getDoi());
			    rs.add(p.getSource());
			    rs.add(p.getProject());
			    rs.add(p.getAbstract2());
			}
		}
		return rs;
    }

}