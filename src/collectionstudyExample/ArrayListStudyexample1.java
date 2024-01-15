package collectionstudyExample;

import java.util.ArrayList;

public class ArrayListStudyexample1 {

	public static void main(String[] args)
	{
		//If we provide the object then we can add any types of data in below array list
				ArrayList<Object> a1=new ArrayList<>();
				a1.add(10);
				a1.add("Ankita");
				a1.add(true);
				a1.add(null);
				a1.add(0);
				a1.add(20.3f);
				a1.add(100);
				a1.add('A');
				a1.add(20.45454d);
				a1.add(15);
				System.out.println(a1);
				System.out.println("===========================");
				
				//Below arraylist will allow only the String data type variable 
				ArrayList<String> names=new ArrayList<String>();
				names.add("Hi");
				names.add("Hello");
				names.add("Bye");
				names.add("How are you?");
				names.add("No worries");
				names.add("See you later");
				names.add(null);
				System.out.println(names);

	}

}
