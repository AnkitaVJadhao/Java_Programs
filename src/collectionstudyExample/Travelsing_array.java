package collectionstudyExample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Travelsing_array {

	public static void main(String[] args)
	{
		ArrayList<String> names=new ArrayList<String>();
		names.add("Ankita");
		names.add("Chaitali");
		names.add("Karishma");
		names.add("Neha");
		System.out.println(names);
		
		System.out.println("===========for loop===============");
		
		for(int i=0; i<names.size();i++)
		{
			System.out.println(names.get(i));
		}
		
		System.out.println("===========for each===============");
		
		for(String ele:names)
		{
			System.out.println(ele);
		}
		System.out.println("===========Iterator===============");
		System.out.println("===========cursor==================");
		
		
		Iterator<String> i1=names.iterator();
//		System.out.println(i1.next());
//		System.out.println(i1.next());
//		System.out.println(i1.next());
//		System.out.println(i1.next());
		
		System.out.println("==========while loop==============");
		
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		System.out.println("==========List Iterator============");
		
		ListIterator<String> list= names.listIterator();
//		System.out.println(list.next());
//		System.out.println(list.next());
//		System.out.println(list.next());
//		System.out.println(list.next());
		
		System.out.println("===============hasNext()=============");
		while(list.hasNext())
		{
			System.out.println(list.next());
		}
		System.out.println("=================hasPrevious()========");
		
		while(list.hasPrevious())
		{
			System.out.println(list.previous());
		}

	}

}
