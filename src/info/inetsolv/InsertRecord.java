package info.inetsolv;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class InsertRecord {

	public static void main(String[] args) {
		
       Employee employee = new Employee();
       employee.setEno(9);
     
       employee.setSalary(900000d);
       
       

     
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
//		
//		Employee employee = session.get(Employee.class,7);
//		employee.setSalary(10000d);
//		employee.setEname(null);
//		session.update(employee);
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();

		
	}

}
