package hibernatedemo.repo;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.wipro.hibernatedemo.entity.Pan;
import hibernatedemo.util.HibernateUtil;


public class PanRepo {
	

	public static void updatePan() {
		Scanner sc= new Scanner(System.in); 
    	
    	System.out.println("Please enter pan id");
    	int id= sc.nextInt();
    	System.out.println("Please enter pan holder name");
    	String panholderName= sc.next();
    	System.out.println("Please enter pan Number");
    	String panNumber= sc.next();
		Pan m= new Pan(id,panholderName,panNumber);
    	save(m);
		
		
	}
	 public static void createPan()
	    {
	    	Scanner sc= new Scanner(System.in); 
	    	System.out.println("Please enter pan holder name");
	    	String panholderName= sc.next();
	    	System.out.println("Please enter pan Number");
	    	String panNumber= sc.next();
			Pan m= new Pan(panholderName,panNumber);
	    	save(m);
	    	
	    	
	    	
	    }

	private static void save(Pan m) {
		Session session= HibernateUtil.getSessionFactory().getCurrentSession();
    	Transaction transaction=session.beginTransaction();
    	
    	if(m.getId()!=0)
    	{
    		Pan m1=findById(m.getId());
    		m1.setPanholderName(m.getPanholderName());
    		m1.setPanNumber(m.getPanNumber());
    		session.persist(m1);
    	}
    	else {
    	   	session.persist(m);
    	}
    	transaction.commit();
		
	}

	public static Pan findById(int id) {
		Session session= HibernateUtil.getSessionFactory().getCurrentSession();
    	Transaction transaction=session.beginTransaction();
    	Pan m=session.find(Pan.class, id);
		return m;
	}

	public static Pan deleteById(int id) {
		Session session= HibernateUtil.getSessionFactory().getCurrentSession();
    	Transaction transaction=session.beginTransaction();
    	Pan m=session.find(Pan.class, id);
    	session.remove(m);
    	transaction.commit();
    	return m;
		
		
	}

	public static List<Pan> findAll() {
		Session session= HibernateUtil.getSessionFactory().getCurrentSession();
    	Transaction transaction=session.beginTransaction();
    	String hqlQuery="from Pan";
    	Query query=session.createQuery(hqlQuery);
    	List<Pan> list=query.list();
    	return list;
	}

	public static List<String> findAllPanHolderNames() {
		Session session= HibernateUtil.getSessionFactory().getCurrentSession();
    	Transaction transaction=session.beginTransaction();
    	String hqlQuery="SELECT panholderName from Pan";
    	Query query=session.createQuery(hqlQuery);
    	List<String> list=query.list();
    	return list;
		
	}
	public static List<Pan> findBypanNumber(String panNumber) {
		Session session= HibernateUtil.getSessionFactory().getCurrentSession();
    	Transaction transaction=session.beginTransaction();
    	String hqlQuery="from Pan where panNumber=:pNumber";//select *  from movie where movie_language=''
    	Query query=session.createQuery(hqlQuery,Pan.class);
    	query.setParameter("pNumber",panNumber);
    	List<Pan> list=query.list();
    	return list;
	}
	
}
	
	
	    
