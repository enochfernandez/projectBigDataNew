package hibernateTest;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static SessionFactory sessionFactory;
    static {
        try {
            sessionFactory = new Configuration()
            		.configure("hibernate.cfg.xml")
    				.addAnnotatedClass(Entso_e_load.class)
    				.buildSessionFactory();
        } catch (Throwable ex) {
            // Log exception!
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static Session getSession()
            throws HibernateException {
        return sessionFactory.openSession();
    }
}
