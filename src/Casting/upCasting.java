package Casting;

public class upCasting {

	public static void main(String[] args) 
	{
		Father f1=new Father();
		f1.bike();
		f1.car();
		
		System.out.println("===============");
		
		Son s1=new Son();
		s1.bike();
		s1.car();
		s1.laptop();
		
		System.out.println("=====================");
		
		//Assign subclass property to super class 
		//who's object that method called .
		//for example Son object then method of sons only will call
		//But in upcasting , we cannot call the sons unique method by using below 
		
		Father a1=new Son();  
		a1.bike();
		a1.car();
		//a1.laptop(); 
				

	}

}
