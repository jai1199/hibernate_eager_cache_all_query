package inheritance.hibernate.in;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
public static void main(String[] args) {
	

	Configuration cfg=new Configuration().configure().addAnnotatedClass(Car.class).addAnnotatedClass(Vehicle.class).addAnnotatedClass(Motorcycle.class);
	SessionFactory sessionFactory=cfg.buildSessionFactory();
	// Creating and saving a Car
	Session session = sessionFactory.openSession();
	Transaction trans=session.beginTransaction();

	trans.commit();
	session.close();

	// Retrieving a Vehicle (which could be a Car or Motorcycle)
//	Session session = sessionFactory.openSession();
//	session.beginTransaction();
//
//	Vehicle vehicle = session.get(Vehicle.class, 1L);
//	System.out.println(vehicle.getMake());
//
//	session.getTransaction().commit();
//	session.close();

}
	
}
