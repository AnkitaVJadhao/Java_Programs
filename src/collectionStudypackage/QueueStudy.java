package collectionStudypackage;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueStudy {

	public static void main(String[] args)
	{
		
		Queue<String> q1=new LinkedList<String>();
		//q1.add("Ankita");
		
		//PriorityQueue<String>  a1=new PriorityQueue<String>();
		q1.add("Ankita");
		q1.offer("Vasantrao");
		q1.offer("Jadhao");
		System.out.println(q1);
		//First in First out
		System.out.println(q1.poll());
		System.out.println(q1);
		System.out.println(q1.peek());
		System.out.println(q1);
		
		

	}

}
