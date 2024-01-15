package collectionstudyExample;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Travelsing_vector {

	public static void main(String[] args) 
	{
		Vector<String> names=new Vector<String>();
		names.add("ABC");
		names.add("PQR");
		names.add("XYZ");
		names.add("MNO");
		names.add("SDF");
		
		System.out.println(names);
		
		System.out.println("==========Travlesing in vector===============");
		System.out.println("==========for loop===========================");
		
		for(int i=0;i<names.size();i++)
		{
			System.out.println(names.get(i));
		}
		
		System.out.println("==========for each===========================");
		
		for(String v1:names)
		{
			System.out.println(v1);
		}
		System.out.println("========Iterator==============================");
		
		 Iterator<String> i1 = names.iterator();
		 
		 while(i1.hasNext())
		 {
			 System.out.println(i1.next());
		 }
		 System.out.println("========listIterator==========================");
		 
		ListIterator<String> l1 = names.listIterator();
		
		while(l1.hasNext())
		{
			System.out.println(l1.next());
		}
		System.out.println("=========Previous===============================");
		
		while(l1.hasPrevious())
		{
			System.out.println(l1.previous());
		}
		
		System.out.println("========Enumeration=============================");
		
	    Enumeration<String> e1 = names.elements();
	    
	    while(e1.hasMoreElements())
	    {
	    	System.out.println(e1.nextElement());
	    }

	}

}
