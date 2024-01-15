package set_study;

import java.util.Iterator;
import java.util.TreeSet;

public class Treesetstudy {

	public static void main(String[] args) 
	{
		TreeSet<Object> t1=new TreeSet<Object>();
		
		t1.add("Ankita");
		t1.add("Chaitali");
		t1.add("Krishma");
		//t1.add(123);   //ClasscasrException
		//t1.add(null);  //NullPointerException
		
		System.out.println(t1);
		

		System.out.println("==============ceiling========================");
		
		TreeSet<Integer> t2=new TreeSet<Integer>();
		t2.add(10);
		t2.add(12);
		t2.add(5);
		t2.add(4);
		t2.add(2);
		t2.add(1);
		
		System.out.println(t2);
		//Returns the least element in this set greater than or equal to the given element, 
		//or null if there is no such element
		System.out.println(t2.ceiling(11));
		
		System.out.println(t2.ceiling(7));
		
		System.out.println("===========floor=================");
		//Returns the greatest element in this set less than or equal 
		// to the given element, or null if there is no such element.
		
		System.out.println(t2.floor(11));
		System.out.println("==============first===================");
		System.out.println(t2.first());
		
		
		System.out.println("=============last====================");
		// Returns the last (highest) element currently in this set
		System.out.println(t2.last());
		
		System.out.println("========size===============");
		System.out.println(t2.size());
		
		System.out.println("=========remove=============");
		System.out.println(t2.remove(5));
		
		System.out.println("==========higher=========");
		//Returns the least element in this set strictly greater than the given element,
		// or null if there is no such element
		
		System.out.println(t2.higher(2));
		
		System.out.println("============lower=================");
		//Returns the greatest element in this set strictly less than thegiven element, 
		// or null if there is no such element
		
		System.out.println(t2.lower(2));
		
		System.out.println("=============traversing================");
		//we cant use for loop
		
		System.out.println("======for each loop=============");
		for(Integer t:t2)
		{
		System.out.println(t);
		}
		
		
		System.out.println("---------iterator----------");
		 Iterator<Integer> it = t2.iterator();
		 while(it.hasNext()) 
		 {
			System.out.println(it.next()); 
		 }
        System.out.println("--------descending Iterator------------");
		 
		 Iterator<Integer> it1 = t2.descendingIterator();
		 while(it1.hasNext()) 
		 {
			System.out.println(it1.next()); 
		 }

	}

}
