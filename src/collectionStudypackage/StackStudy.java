package collectionStudypackage;

import java.util.Stack;

public class StackStudy {

	public static void main(String[] args)
	{
		//First in last out
		Stack<String> s1=new Stack<String>();
		s1.add("Ankita");
		s1.add("Vasantrao");
		s1.add("Jadhao");
		s1.push("Velocity");
		s1.push("Training");
		System.out.println(s1);
		//to check or out the values
		System.out.println(s1.peek());
		System.out.println(s1);
		//last element get remove
		System.out.println(s1.pop());
		System.out.println(s1);
		

	}

}
