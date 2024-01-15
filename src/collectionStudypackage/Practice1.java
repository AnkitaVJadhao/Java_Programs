package collectionStudypackage;

import java.util.ArrayList;
import java.util.Collections;

public class Practice1 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		//non static method
		al.add("Ankita");
		al.add("Vasantrao");
		al.add("Jadhao");
		al.add("Velocity");
		al.add("Trainig");
		System.out.println(al);
		//order of insertaion maintain
		//how to get data from arraylist 
		System.out.println(al.get(2));
		System.out.println(al.get(3));
		
		System.out.println(al.remove(0));
		System.out.println(al);
		
		//update the data 
		al.set(0,"Ankita");
		System.out.println(al);
		
		
		
		ArrayList<String> al2=new ArrayList<String>();
		//non static method
		al2.add("Ankita");
		al2.add("Vasantrao");
		al2.add("Jadhao");
		al2.add("Velocity");
		al2.add("Trainig");
		System.out.println(al2);
		
		al.addAll(4, al2);
		System.out.println(al);
		
		
		Collections.sort(al);
		System.out.println(al.size());
		
		
		
		//Iterator 
		
		
		
		
		

	}

}
