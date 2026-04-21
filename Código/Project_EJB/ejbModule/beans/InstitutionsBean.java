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

import copy.InstitutionsCopy;
import entities.Institutions;
import entities.Researchers;

/**
 * Session Bean implementation class InstitutionsBean
 */
@Stateless
@LocalBean
public class InstitutionsBean implements InstitutionsBeanRemote, InstitutionsBeanLocal {

    /**
     * Default constructor. 
     */
    public InstitutionsBean() {
        // TODO Auto-generated constructor stub
    }
    
    @PersistenceContext(name = "TestPersistence")
	private EntityManager em;
    public ArrayList<InstitutionsCopy> readInstitutions() {
		String jpql = "SELECT i FROM Institutions i";
		TypedQuery<Institutions> typedQuery = em.createQuery(jpql, Institutions.class);
		List<Institutions> mylist = typedQuery.getResultList();
		
		ArrayList<InstitutionsCopy> isCopy = new ArrayList<>();
		Set<Researchers> researchers = new HashSet<>();
		System.out.println("CREATING COPY");
		for(Institutions ins : mylist) {
			InstitutionsCopy iCopy = new InstitutionsCopy();
			iCopy.setName(ins.getName());
			iCopy.setLocation(ins.getLocation());
			iCopy.setDepartment(ins.getDepartment());
			researchers = ins.getResearchers();
			for(Researchers rs : researchers) {
		    	iCopy.getResearchers().add(rs.getName());
		    }
			isCopy.add(iCopy);
		}
		
		return isCopy;
    }

    public ArrayList<InstitutionsCopy> readSpecificInstitution(String name) {
		String jpql = "SELECT i FROM Institutions i WHERE i.name = :name2";
		TypedQuery<Institutions> typedQuery = em.createQuery(jpql, Institutions.class).setParameter("name2", name);
		
		List<Institutions> mylist = typedQuery.getResultList();
		
		ArrayList<InstitutionsCopy> isCopy = new ArrayList<>();
		Set<Researchers> researchers = new HashSet<>();
		System.out.println("CREATING COPY");
		for(Institutions ins : mylist) {
			InstitutionsCopy iCopy = new InstitutionsCopy();
			iCopy.setName(ins.getName());
			iCopy.setLocation(ins.getLocation());
			iCopy.setDepartment(ins.getDepartment());
			researchers = ins.getResearchers();
			for(Researchers rs : researchers) {
		    	iCopy.getResearchers().add(rs.getName());
		    }
			isCopy.add(iCopy);
		}
		
		return isCopy;
    }
    
    public ArrayList<InstitutionsCopy> readResearchInstitution(String name) {
		String jpql = "SELECT i FROM Institutions i, IN (i.researchers) r WHERE r.name = :name2";
		TypedQuery<Institutions> typedQuery = em.createQuery(jpql, Institutions.class).setParameter("name2", name);
		List<Institutions> mylist = typedQuery.getResultList();
		
		ArrayList<InstitutionsCopy> isCopy = new ArrayList<>();
		Set<Researchers> researchers = new HashSet<>();
		System.out.println("CREATING COPY");
		for(Institutions ins : mylist) {
			InstitutionsCopy iCopy = new InstitutionsCopy();
			iCopy.setName(ins.getName());
			iCopy.setLocation(ins.getLocation());
			iCopy.setDepartment(ins.getDepartment());
			researchers = ins.getResearchers();
			for(Researchers rs : researchers) {
		    	iCopy.getResearchers().add(rs.getName());
		    }
			isCopy.add(iCopy);
		}
		
		return isCopy;
    }
}
