package collectionstudyExample;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Travelsing_Linkedlist {

	public static void main(String[] args)
	{
		LinkedList<String>  list=new LinkedList<String>();
		list.add("Ankita");
		list.add("Virat");
		list.add("Dhoni");
		list.add("Dravid");
		System.out.println(list);
		
		System.out.println("========Travelsing from linkedlist============");
		System.out.println("========For loop==============================");
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
		System.out.println("========For each===============================");
		for(String l1:list)
		{
			System.out.println(l1);
		}
		System.out.println("=======Iterator================================");
		
		Iterator<String> e1 = list.iterator();
		
		while(e1.hasNext())
		{
			System.out.println(e1.next());
		}
		
		System.out.println("======listIterator=============================");
		
		ListIterator<String> l1=list.listIterator();
		
		while(l1.hasNext())
		{
			System.out.println(l1.next());
		}
		System.out.println("=======Previous=================================");
		while(l1.hasPrevious())
		{
			System.out.println(l1.previous());
		}

	}

}
