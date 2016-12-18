package hibernateTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.TypedQuery;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



@ManagedBean
@SessionScoped
public class CreateStudentDemo {
	List<Entso_e_load> entso_e_loads;
	Date selectedDate;
	String country;
	String type;
	
	
	public List<Entso_e_load> getEntso_e_loads() {
		return entso_e_loads;
	}

	public CreateStudentDemo(){
		try {
			this.selectedDate = new SimpleDateFormat("yyyy-MM-dd").parse("2015-01-01");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.country = "AT";
	}
	
	
	


	@SuppressWarnings("unchecked")
	public void listEmployees() throws ParseException{
	      Session session = HibernateUtil.getSession();
	      
	      try {
			TypedQuery<Entso_e_load> query = session.createQuery("FROM Entso_e_load E WHERE E.date = :selectedDate AND E.country = :country");
			query.setParameter("selectedDate", selectedDate);
			query.setParameter("country", country);
	    	 entso_e_loads = query.getResultList();
	    	  /*for (Iterator iterator = 
	    			  result.iterator(); iterator.hasNext();){
				       Entso_e_load myTempResult = (Entso_e_load) iterator.next(); 
				       System.out.print(myTempResult);        
				      
	    	  		}*/
	    	 
	    	 
		} catch (HibernateException  e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
	      
	 }
	
/*	//here we get the list of all entso_e_load
	public void getAllEntsoLoad (){
		
		
		try {
			//start a transaction
			session.beginTransaction();
			
			//query Entso_e_load
			List<Entso_e_load> allEntsoLoad = session.createQuery("from Entso_e_load").list();
			
		} finally {
			factory.close();
		}
	}*/



/*	public void createhibernate() {
	
	
	try {			
		// create a student object
		System.out.println("Creating new student object...");
		Student tempStudent = new Student("Enoch", "Fernandez", "enoch@luv2code.com");
		
		// start a transaction
		session.beginTransaction();
		
		// save the student object
		System.out.println("Saving the student...");
		session.save(tempStudent);
		
		// commit transaction
		session.getTransaction().commit();
		
		System.out.println("Done!");
	}
	finally {
		factory.close();
	}
}*/
}