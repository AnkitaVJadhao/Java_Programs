package collectionStudypackage;

import java.util.HashSet;
import java.util.Set;

public class setStudy {

	public static void main(String[] args) 
	{
		HashSet<String> h1=new HashSet<String>();
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
