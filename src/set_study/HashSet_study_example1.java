package set_study;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_study_example1 {

	public static void main(String[] args) 
	{
		
		HashSet<Object> h1=new HashSet<Object>();
		h1.add(1);
		h1.add(2);
		h1.add(3);
		h1.add(4);
		h1.add(null);
		h1.add(3);
		System.out.println(h1);
		
		System.out.println("=============================");
		System.out.println(h1.contains(2));
		
		System.out.println("=============================");
		System.out.println(h1.isEmpty());
		
		System.out.println("==============================");
		System.out.println(h1.size());
		
		System.out.println("===============================");
		System.out.println(h1.hashCode());
		
		System.out.println("================================");
		
		Object h2 = h1.clone();
		System.out.println(h2);
		
		System.out.println("=================================");
		System.out.println(h2.equals(h1));
		
		System.out.println("==================================");
		System.out.println("=====Travelsing===================");
		
		for(Object ele:h1)
		{
			System.out.println(ele);
		}
		
		System.out.println("======Iterator=====================");
		
		Iterator<Object> i1 = h1.iterator();
		
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
	}

}
