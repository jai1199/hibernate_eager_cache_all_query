package com.jsp.in.EagerAndLazy;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Root;

//import javax.persistence.criteria.CriteriaBuilder;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

/**
 * Hello world!
 *
 */
public class App 

{   
//	@SuppressWarnings("deprecation")
	public static void main( String[] args )
	
    {
//		Configuration do it
		  
//    	Book b1=new Book();
//    	b1.setbId(101);
//    	b1.setbName("Java");
//  	
//    	Book b2=new Book();
//    	b2.setbId(102);
//    	b2.setbName("sql");
// 	
//    	Book b3=new Book();
//    	b3.setbId(103);
//    	b3.setbName("Python");
//   	
//    	Book b4=new Book();
//    	b4.setbId(104);
//    	b4.setbName("Js");
    	
//    	Student s1=new Student();
//    	s1.setsId(111);
//    	s1.setsName("Tom");
//   	
//    	Student s2=new Student();
//    	s2.setsId(222);
//    	s2.setsName("Dinga");
//    	
//    	Student s3=new Student();
//    	s3.setsId(333);
//    	s3.setsName("Herry");
//    	
//    	Student s4=new Student();
//    	s4.setsId(444);
//    	s4.setsName("Henry");
//   	
//    	s1.getbList().add(b4);
//    	s1.getbList().add(b3);
//    	s1.getbList().add(b2);
//    	b1.setS(s2);
//    	b2.setS(s2);
//    	b3.setS(s2);
    	
        
        
//        s.save(s1);
//        s.save(s2);
//        s.save(s3);
//        s.save(s4);
//        s.save(b4);
//        s.save(b3);
//        s.save(b2);
//        s.save(b1);
        
        
//      Student std=  s.get(Student.class, 222);
//      System.out.println(std.getsName());
//      System.out.println(std.getbList().get(0));
      
//      for(Book book:std.getbList())
//      {
//    	  System.out.println(book.getbName()+" "+book.getbId());  
//      }
//        
        
    	
    	
    	
    	
//        Query<Student> query=s.createQuery("select s from Student s where s.sId=222");
//        List<Student> students=query.list();
//        for(Student student:students) {
//        	System.out.println(student.getsId()+ " "+student.getsName());
//        } 

//        NativeQuery query=s.createNativeQuery("select * from Student");
//        List<Student> students=query.list();
        
        
        //if we want to get data with native sql query then we have to use this
        //1.way
        
        
//        NativeQuery query=s.createNativeQuery("select * from student", Student.class);
//        List<Student> students=query.list();
        
        
//        2.way
//        NativeQuery query=s.createNativeQuery("select * from student");
//        List<Object[]> students=query.list();
        
        
//        for(Student student:students) {
//        	System.out.println(student.getsId()+ " "+student.getsName());
////        }   
//        for(Object student:students) {
//        	System.out.println(Arrays.deepToString((Object[])student));
//        } 
        
//        Customer c1=new Customer();
//        c1.setCid(101);
//        c1.setcName("Ram");
//        c1.setcLocation("Dehradun");
//        
//        Customer c2=new Customer();
//        c2.setCid(102);
//        c2.setcName("Rama");
//        c2.setcLocation("Dehradun");
//        
//        Customer c3=new Customer();
//        c3.setCid(103);
//        c3.setcName("Ravana");
//        c3.setcLocation("Dehradun");
//        
//        Customer c4=new Customer();
//        c4.setCid(104);
//        c4.setcName("Rahul");
//        c4.setcLocation("Dehradun");
//        
//        Orders o1=new Orders();
//        o1.setoId(1001);
//        o1.setoName("Mobile");
//        o1.setoState("pending");
//        
//        Orders o2=new Orders();
//        o2.setoId(1002);
//        o2.setoName("Laptop");
//        o2.setoState("delivered");
//        
//        Orders o3=new Orders();
//        o3.setoId(1003);
//        o3.setoName("Tablet");
//        o3.setoState("pending");
//        
//        Orders o4=new Orders();
//        o4.setoId(1004);
//        o4.setoName("Watch");
//        o4.setoState("delivered");
//        
//        c1.getOlist().add(o4);
//        c1.getOlist().add(o3);
//        c3.getOlist().add(o2);
//        
//        o1.setCustomer(c4);
//        o1.setCustomer(c2);
//        o2.setCustomer(c1);
        
      
        
        
//        s.save(c1);
//        s.save(c2);
//        s.save(c3);
//        s.save(c4);
//        s.save(o1);
//        s.save(o2);
//        s.save(o3);
//        s.save(o4);

        
        
//        Query<Customer> query=s.createQuery("select c from Customer c ");
        
//      List<Customer> customers=query.list();
//        for(Customer c:customers) {
//        	System.out.println(c.getcName());
//      }
      
//        NativeQuery query=s.createNativeQuery("select * from eagerandlazy.customer where cid in (SELECT customer_cid FROM eagerandlazy.orders where oState='pending')");
//        List<Object[]> customers=query.list();
//        for(Object customer:customers) {
//        	System.out.println((Object[])customer);
//        }
        
//        Query<Customer> query=s.createQuery("select s from customer s where s.cId=101");
//      List<Customer> customers=query.list();
//        for(Customer c:customers) {
//        	System.out.println(c.getCid()+" "+c.getcLocation());
//        }
        
        
        
        
        
    
//        /*    ===>IMPORTANT DON'T FORGET
//        Here we are displaying the data in rows and column format which in 2D array thats why we are using object [] datas will be
//        treated as String 
        
//        NativeQuery query=s.createNativeQuery("select * from customer where cid in (SELECT customer_cid FROM orders where oState='pending')");
//        List<Object[]> customers=query.list();
//        for(Object customer[]:customers) {
//        	System.out.println(Arrays.deepToString(customer));      	
//        }
        
        
        
//        */
        
        
//        /* criteria eg. this is important
        
      
//		Criteria cri=s.createCriteria(Student.class);//select * from student 
//		cri.add(Restrictions.eq("sName", "Dinga"));//select * from student where sName='Dinga';
//         List<Student> list=cri.list();
//         for(Student ss:list) {
//        	 System.out.println(ss);
//         }
         
         
         
         
//         */
        
        
//        */ Criteria Builder
        
        
//        CriteriaBuilder builder =s.getCriteriaBuilder();
//        CriteriaQuery<Student> criteria=builder.createQuery(Student.class);
//        Root<Student> root=criteria.from(Student.class);
//        criteria.select(root);//select * from student
//        
//        Query<Student> query=s.createQuery(criteria);
//        
//        List<Student> list=query.list();
        
//        for(Student ss:list) {
//        	System.out.println(ss);
//        }
//        
//        list.forEach(System.out::println);
        
        
//        /*
        
//        where clause
    	
    	
//    	 CriteriaBuilder builder =s.getCriteriaBuilder();
//         CriteriaQuery<Student> criteriaQuery=builder.createQuery(Student.class);
//         Root<Student> root=criteriaQuery.from(Student.class);
//         criteriaQuery.select(root);//select * from student
//         criteriaQuery.where(builder.equal(root.get("sId"), 222));              
//         Query<Student> query=s.createQuery(criteriaQuery);         
//         List<Student> list=query.list();
//         list.forEach(System.out::println);
         

    	
    	//delete query yeh galat hai
    	
    	
//    	 CriteriaBuilder builder =s.getCriteriaBuilder();
//         CriteriaQuery<Student> criteriaQuery=builder.de(Student.class);
//         Root<Student> root=criteriaQuery.from(Student.class);
//         criteriaQuery.select(root);//select * from student
//         criteriaQuery.where(builder.equal(root.get("sId"), 222));              
//         Query<Student> query=s.createQuery(criteriaQuery);         
//         List<Student> list=query.list();
//         list.forEach(System.out::println);
         
         
        
//        
//        Customer c=(Customer)s.get(Customer.class, 111);
//        System.out.println(c.getcName());
//        for(Orders o:c.getOlist()) {
//        	System.out.println(o.getoState());
//        }
        
        
        
        
//        Query<Student> query=s.createQuery("select s from Student s where s.sId=222");
//      List<Student> students=query.list();
//        
//      for(Student student:students) {
//      	System.out.println(student.getsId()+ " "+student.getsName());
//      }  
    	
    	
    	
    	/*
    	 * Delete query
    	 * 
    	 * 
    	 */
    	
//    	CriteriaBuilder builder =s.getCriteriaBuilder();
//    	CriteriaDelete<Student>  criteriaDelete= builder.createCriteriaDelete(Student.class);
//    	Root<Student> root=criteriaDelete.from(Student.class);
//    	criteriaDelete.where(builder.equal(root.get("sId"), 222));              
//    	int result= s.createQuery(criteriaDelete).executeUpdate();
//    	System.out.println(result+" row affected:");
    	
       /*
   	 *  Update query
   	 * 
   	 * 
   	 */
//    	CriteriaBuilder builder =s.getCriteriaBuilder();
//    	CriteriaUpdate<Student> update=	builder.createCriteriaUpdate(Student.class);
//    	Root<Student> root=update.from(Student.class);
//    	update.set("sName", "Lion");
//    	update.where(builder.equal(root.get("sId"), 222)); 
//        int result= s.createQuery(update).executeUpdate();
//    	
//    	System.out.println(result+" row affected:");
    	
    	
    	
    	
//    	Configuration cfg=new Configuration().configure().addAnnotatedClass(Student.class);
//        SessionFactory sf=cfg.buildSessionFactory();
//        Session s=sf.openSession();
//        Transaction trans=s.beginTransaction();       
//        Student std=s.get(Student.class, 111);
//        System.out.println(std);
//        
//        Session s1=sf.openSession();
//        Transaction trans1=s1.beginTransaction();       
//        Student std1=s1.get(Student.class, 111);
//        System.out.println(std1);
//        
//        trans.commit();
    	
		
		Student s=new Student();
		s.setsId(129);
		s.setsName("Rohan");
    	EntityManagerFactory emf=Persistence.createEntityManagerFactory("rohit");
    	EntityManager em=emf.createEntityManager();
    	EntityTransaction  eTrans=em.getTransaction();
        eTrans.begin();
        
//        em.persist(s); to set the data
//        Student ss=em.find(Student.class,111);
       
        String jpql = " FROM Student";
//        List<Student> products = em.createQuery(jpql, Student.class);


        eTrans.commit();
        em.close();
    }
}
