package Polymorphism;

public class Subclass_Runtime extends Runtime_Polymorphism {

	public static void main(String[] args) 
	{
		//Runtime_Polymorphism r1=new Subclass_Runtime();
		//r1.draw();
		
//		Runtime_Polymorphism p1=new Runtime_Polymorphism();
//		p1.draw();
		
		
		Subclass_Runtime r1 =new Subclass_Runtime();
		r1.draw();
//		Subclass_Runtime.add();
//		Runtime_Polymorphism.add();
	}
	@Override
	public void draw()
	{
		super.draw();   //to call super class method using sub class object , we have to use super. method name().
		System.out.println("This is squre shape");
	}
	public static void add()
	{
		System.out.println("Hii");
	}
	
}
