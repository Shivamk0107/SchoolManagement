package com.example.SchoolManagement;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;





/**
 * Hello world!
 *
 */
public class App 
{
	public static Configuration con=new Configuration().configure().addAnnotatedClass(Teacher.class);
	public static Configuration con1=new Configuration().configure().addAnnotatedClass(Courses.class);
    public static Configuration con2 = new Configuration().configure().addAnnotatedClass(Student.class);
    public static Configuration con3 = new Configuration().configure().addAnnotatedClass(Classes.class);
    public static SessionFactory sf=con.buildSessionFactory();
    
    public static void main( String[] args )
    {
    	
    	Session session=sf.openSession();
    	Transaction t=session.beginTransaction();
    	
        
        deleteStudent("rinshu","rinshu@gmail.com");
        
        getStudentbyId(1);
    	
    	
    	
    	
    	Teacher t1=new Teacher();
    	t1.setTid(101);
    	t1.setTname("Megha");
    	Teacher t2=new Teacher();
    	t2.setTid(102);
    	t2.setTname("Priyanka");
    	Teacher t3=new Teacher();
    	t3.setTid(103);
    	t3.setTname("Yuvraj");
    	
    	Courses c1=new Courses();
    	c1.setCid(1);
    	c1.setCname("Maths");
    	Courses c2=new Courses();
    	c2.setCid(2);
    	c2.setCname("English");
    	Courses c3=new Courses();
    	c3.setCid(3);
    	c3.setCname("Hindi");
    	Courses c4=new Courses();;
    	c4.setCid(4);
    	c4.setCname("Science");
    	
    	Classes cl1=new Classes();
    	cl1.setClid(1001);
    	cl1.setClname("first");
    	Classes cl2=new Classes();
    	cl2.setClid(1002);
    	cl2.setClname("second");
    	Classes cl3=new Classes();
    	cl3.setClid(1003);
    	cl3.setClname("third");
    	Classes cl4=new Classes();
    	cl4.setClid(1004);
    	cl4.setClname("fourth");
    	
    	Student s= new Student();
    	s.getSid();
    	s.getSName();
    	s.getSEmail();
        

    	t1.getCourses().add(c1);
    	t1.getCourses().add(c4);
    	t2.getCourses().add(c2);
    	t3.getCourses().add(c3);
    	
    	c1.getTeacher().add(t1);
    	c2.getTeacher().add(t2);
    	c3.getTeacher().add(t3);
    	c4.getTeacher().add(t1);
    	
    	
    	cl1.getStudent().add(s);
    	cl2.getStudent().add(s);
    	cl3.getStudent().add(s);
    	cl4.getStudent().add(s);
    	
    	
    	session.persist(t1);
    	session.persist(t2);
    	session.persist(t3);
    	
    	session.persist(c1);
    	session.persist(c2);
    	session.persist(c3);
    	
    	session.persist(cl1);
    	session.persist(cl2);
    	session.persist(cl3);
    	session.persist(cl4);
    	

    	
    	t.commit();
    }
    
        
    	

	private static void deleteStudent(String string, String string2) {
		// TODO Auto-generated method stub
		
	}




	public static void CreateStudent(String SName,String SEmail)
	{
		SessionFactory sf=con.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction t1=ss.beginTransaction();
		Student s1=new Student();
		s1.setSName(SName);
		s1.setSEmail(SEmail);
		ss.save(s1);
		t1.commit();
	}
	 public static void getStudentbyId(int id) {
	    	Session ss=sf.openSession();
	    	Transaction t1=ss.beginTransaction();
	    	Student s1=ss.get(Student.class, id);
	    	System.out.print(s1.getSid()+" ");
	    	System.out.print(s1.getSName()+" ");
	    	System.out.print(s1.getSEmail()+" ");
	    	System.out.println();
	    }
	 public static void deleteStudentbyId(int id) {
	    	Session ss=sf.openSession();
	    	Transaction t1=ss.beginTransaction();
	    	Student s1=ss.get(Student.class, id);
	    	ss.delete(s1);
	    	t1.commit();
	}
	 public static void updateStudentbyId(int id,String SName,String SEmail) {
	    	Session ss=sf.openSession();
	    	Transaction t1=ss.beginTransaction();
	    	Student s1=ss.get(Student.class, id);
	    	s1.setSName(SName);
	    	s1.setSEmail(SEmail);
	    	ss.save(s1);
	    	t1.commit();
	    }
}
