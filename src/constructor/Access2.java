package constructor;

import Access_Specifiers.Access_Specifiers;

public class Access2 extends Access_Specifiers {

	public static void main(String[] args) 
	{
		         //calling method and variable from another package
				Access_Specifiers a1=new Access_Specifiers();
				//a1.a;        //private can be accessed only within same class not in another package
				//System.out.println("b values is "+a1.b);    //calling default variable from another package not possible
				//System.out.println("c values is "+a1.c);   calling protected variable from another package need to use inheritance
				System.out.println("d values is "+a1.d);    //calling public variable from another package
				
				//a1.test1();    //private can be accessed only within same class not in another package
				//a1.test2();      //calling default method from another class not in another package
				//a1.test3();     //calling protected method from another class , need to use inheritance
				a1.test4();    //calling public method from another class 
				System.out.println("=========================");
				Access2 a2=new Access2();
				System.out.println("To call protected variable from another package we need to use inheritance concept "+a2.c);
				System.out.println("Public variable we can call from another package also without inheritance or with inheritance" );
					

	}

}
