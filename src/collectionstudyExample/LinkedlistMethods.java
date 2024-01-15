package collectionstudyExample;

import java.util.LinkedList;

public class LinkedlistMethods {

	public static void main(String[] args)
	{
		LinkedList<Integer> id=new LinkedList<Integer>();
		System.out.println(id);
		System.out.println("==========================");
		id.add(2);
		id.add(4);
		id.add(6);
		id.add(8);
		id.add(10);
		id.add(12);
		id.add(14);
		System.out.println(id);
		System.out.println("==========addFirst and addLast===============");
		id.addFirst(10);
		id.addLast(20);
		System.out.println(id);
		System.out.println("=============add(index,element)==============");
		id.add(7, 16);
		System.out.println(id);
		System.out.println("==============clone==========================");
		Object idnew = id.clone();
		System.out.println(idnew);
		System.out.println("===============contains======================");
		System.out.println(id.contains(2));
		System.out.println("===============element=======================");
		System.out.println(id.element());
		System.out.println("==============poll===========================");
		System.out.println(id.poll());
		System.out.println(id);
		System.out.println("=============peek============================");
		System.out.println(id.peek());
		System.out.println("=============get =============================");
		System.out.println(id.get(4));
		System.out.println("============getFrist and getLast=============");
		System.out.println(id.getFirst());
		System.out.println(id.getLast());
		System.out.println("===========offer=============================");
		System.out.println(id.offer(22));
		System.out.println("============offerFirst and offerLast=========");
		System.out.println(id.offerFirst(1));
		System.out.println(id.offerLast(100));
		System.out.println("==========clear==============================");
		id.clear();
		System.out.println(id);
		System.out.println("========used peek() after removing all elements==");
		System.out.println(id.peek());		

	}

}
