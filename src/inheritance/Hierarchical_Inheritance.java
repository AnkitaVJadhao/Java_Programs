package inheritance;

public class Hierarchical_Inheritance 
{
	public static void main(String[] args) 
	{
		Super_Class obj1=new Super_Class();
		Subclass1 obj2=new Subclass1();
		Sub_Class2 obj3=new Sub_Class2();
		
		System.out.println("superNum is :- "+obj1.superNum);
		System.out.println("superNum * subnum1 :- " +obj2.superNum*obj2.subnum1);  //20*50
		//20*50
		System.out.println("superNum* subnum2 :- " +obj3.superNum*obj3.subnum2);   //20*40
		//20*40
		
		
	}
}
