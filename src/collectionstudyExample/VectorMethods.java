package collectionstudyExample;

import java.util.Vector;

public class VectorMethods {

	public static void main(String[] args)
	{
		Vector<String> titles=new Vector<>();
		titles.add("Facebook.com");
		titles.add("Instagram");
		titles.add("HotStar");
		titles.add("Disney");
		titles.add("YouTube");
		System.out.println(titles);
		
		System.out.println("======add(index,element)=====");
		
		titles.add(3, "ChatGPT");
		System.out.println(titles);
		
		System.out.println("======capacity===============");
		System.out.println(titles.capacity());
		
		System.out.println("========size================");
		System.out.println(titles.size());
		
		System.out.println("==========double capacity=======");
		titles.add("Google");
		titles.add("W3school");
		titles.add("Gmail");
		titles.add("Google Drive");
		titles.add("Udemy");
		System.out.println(titles.capacity());
		
		System.out.println("======get and elementAt=========");
		System.out.println(titles.get(0));
		System.out.println(titles.elementAt(0));
		
		System.out.println("========firstElement and lastElement======");
		System.out.println(titles.firstElement());
		System.out.println(titles.lastElement());
		
		System.out.println("======inserAt() and add(index,element)======");
		titles.insertElementAt("Udemy", 2);
		System.out.println(titles);
	    
		System.out.println("=========remove============");
		System.out.println(titles.remove(2));
		System.out.println(titles);
		System.out.println(titles.remove("Google Drive"));
		System.out.println(titles);
		
		System.out.println("========setSize=========");
		titles.setSize(2);
		System.out.println(titles.size());
		
		
		Vector<Integer> it=new Vector<>();
		it.add(null);
		it.add(null);
		it.add(1);
		System.out.println(it);
		
		System.out.println(it.remove(0));
		

	}

}
