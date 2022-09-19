package HibernetdemoLab.Emmploiee.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmploieeUtil 
{
private static SessionFactory sessionFactory;
	
	static
	{
		try 
		{
			
			sessionFactory = new Configuration().configure().buildSessionFactory();
			
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}
	public static SessionFactory getSessionFactory()
	{
		
		return sessionFactory;
		
	}
}
