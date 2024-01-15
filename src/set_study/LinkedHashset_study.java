package set_study;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashset_study {

	public static void main(String[] args)
	
	{
		
		LinkedHashSet<String> hash=new LinkedHashSet<String>();
		hash.add("Ankita");
		hash.add("Vasantrao");
		hash.add("Jadhao");
		hash.add("Buldana");
		hash.add(null);
		hash.add("Ankita");
		System.out.println(hash);
		
		System.out.println("=============================");
		System.out.println(hash.contains("Ankita"));
		
		System.out.println("=============================");
		System.out.println(hash.isEmpty());
		
		System.out.println("==============================");
		System.out.println(hash.size());
		
		System.out.println("==============================");
		
		System.out.println("=======Travelsing==============");
		
		for(String ele:hash)
		{
			System.out.println(ele);
		}
		
		System.out.println("=======Iterator=================");
		
		 Iterator<String> h1 = hash.iterator();
		 
		 while(h1.hasNext())
		 {
			 System.out.println(h1.next());
		 }
		 
		 System.out.println("=================================");
		
		
		
		
		
	}

}
