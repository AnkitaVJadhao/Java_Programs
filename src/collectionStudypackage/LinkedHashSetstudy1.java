package collectionStudypackage;

import java.util.LinkedHashSet;

public class LinkedHashSetstudy1 {

	public static void main(String[] args) {
		
		LinkedHashSet<String> h1=new LinkedHashSet<String>();
		h1.add("Test");
		h1.add("Ankita");
		h1.add("Vasant");
		h1.add("Jadhao");
		h1.add("Velocity");
		h1.add(null);//Duplicate not allow 
		System.out.println(h1);
		h1.remove("Velocity");
		System.out.println(h1);

	}

}
