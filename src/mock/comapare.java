package mock;

import java.util.ArrayList;

public class comapare {

	public static void main(String[] args) 
	{
		ArrayList<Object> a1=new ArrayList<>();
		a1.add("Ankita");
		a1.add("Abc");
		a1.add("xyz");
		System.out.println(a1);
		ArrayList<Object> a2=new ArrayList<>();
		a2.add("ABC");
		a2.add("err");
		a2.add("sdf");
		System.out.println(a2);
		System.out.println(a1.equals(a2));
		a1.containsAll(a2);
		System.out.println(a1.containsAll(a2));

	}

}
