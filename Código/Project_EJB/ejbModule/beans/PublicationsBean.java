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

/**
 * Session Bean implementation class PublicationsBean
 */
@Stateless
@LocalBean
public class PublicationsBean implements PublicationsBeanRemote, PublicationsBeanLocal {

    /**
     * Default constructor. 
     */
    public PublicationsBean() {
        // TODO Auto-generated constructor stub
    }
    
    @PersistenceContext(name = "TestPersistence")
	private EntityManager em;
    public ArrayList<String> readPublications() {
    	String jpql = "SELECT s FROM Publications s ";
    	TypedQuery<Publications> typedQuery = em.createQuery(jpql, Publications.class);
		List<Publications> mylist = typedQuery.getResultList();
		ArrayList<String> ps = new ArrayList<>();
		Set<Researchers> researchers = new HashSet<>();
		for (Publications st : mylist) {
			ps.add(String.valueOf(st.getId()));
		    ps.add(st.getTitle());
		    ps.add(st.getDatepublication().toString());
		    ps.add(st.getDoi());
		    ps.add(st.getSource());
		    ps.add(st.getProject());
		    ps.add(st.getAbstract2());
		    researchers = st.getResearchers();
		    ps.add(String.valueOf(researchers.size()));
		    for(Researchers rs : researchers) {
		    	ps.add(rs.getName());
		    }
		}
		return ps;
    }
    
    public ArrayList<String> readSpecificPublication(String title) {
    	String jpql = "SELECT s FROM Publications s Where s.title = :title2";
    	TypedQuery<Publications> typedQuery = em.createQuery(jpql, Publications.class).setParameter("title2", title);
		List<Publications> mylist = typedQuery.getResultList();
		ArrayList<String> ps = new ArrayList<>();
		Set<Researchers> researchers = new HashSet<>();
		for (Publications st : mylist) {
			ps.add(String.valueOf(st.getId()));
		    ps.add(st.getTitle());
		    ps.add(st.getDatepublication().toString());
		    ps.add(st.getDoi());
		    ps.add(st.getSource());
		    ps.add(st.getProject());
		    ps.add(st.getAbstract2());
		    researchers = st.getResearchers();
		    ps.add(String.valueOf(researchers.size()));
		    for(Researchers rs : researchers) {
		    	ps.add(rs.getName());
		    }
		}
		return ps;
    }
    
    public ArrayList<String> readResearcherPublications(String name) {
    	String jpql = "SELECT p FROM Publications p, IN (p.researchers) r WHERE r.name = :name2";
    	TypedQuery<Publications> typedQuery = em.createQuery(jpql, Publications.class).setParameter("name2", name);
		List<Publications> mylist = typedQuery.getResultList();
		ArrayList<String> ps = new ArrayList<>();
		Set<Researchers> researchers = new HashSet<>();
		for (Publications st : mylist) {
			ps.add(String.valueOf(st.getId()));
		    ps.add(st.getTitle());
		    ps.add(st.getDatepublication().toString());
		    ps.add(st.getDoi());
		    ps.add(st.getSource());
		    ps.add(st.getProject());
		    ps.add(st.getAbstract2());
		    researchers = st.getResearchers();
		    ps.add(String.valueOf(researchers.size()));
		    for(Researchers rs : researchers) {
		    	ps.add(rs.getName());
		    }
		}
		return ps;
    }

}
