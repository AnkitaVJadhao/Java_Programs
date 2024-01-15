package collectionstudyExample;

import java.util.ArrayList;

public class Arraylist_method {

	public static void main(String[] args)
	{
		ArrayList<Object> a1=new ArrayList<>();
		a1.add("India");
		System.out.println(a1.add("United States"));
		a1.add("Austrailia");
		System.out.println(a1);
		a1.add(1, "Canada");
		a1.add("India");
		System.out.println(a1);
		System.out.println("==========================================");
		Object a2 = a1.clone();
		System.out.println("Clone by array list"+a2);
		System.out.println("===========================================");
		System.out.println(a1.contains("India"));
		System.out.println(a1.contains("Ind"));
		System.out.println("===========================================");
		a1.ensureCapacity(5);
		a1.add("Argentina");
		a1.add("Belgium");
		System.out.println(a1);
		System.out.println("==========================================");
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a1.equals(a2));
		System.out.println("===========================================");
		System.out.println(a1.get(1));
		//System.out.println(a1.get(10));  :-  IndexOutOfBoundsException
		//System.out.println(a1.get(7));  :- IndexOutOfBoundsException
		System.out.println("===========================================");
		System.out.println(a1.indexOf("India"));
		System.out.println(a1.indexOf("Canada"));
		//System.out.println(a1.indexOf("Ind")); :- -1 (Garbage values)
		System.out.println("==========================================");
		System.out.println(a1.isEmpty());
		System.out.println("=========================================");
		System.out.println(a1.lastIndexOf("India"));
		System.out.println("=============================================");
		System.out.println(a1.remove(4));
		System.out.println(a1);
		System.out.println("=============================================");
		System.out.println(a1);
		System.out.println(a1.set(2, "US"));
		System.out.println(a1);
		System.out.println("=============================================");
		System.out.println(a1.size());
		System.out.println("=============================================");
		a1.clear();
		System.out.println(a1);

	}

}
