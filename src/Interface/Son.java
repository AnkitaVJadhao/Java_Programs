package Interface;

public class Son implements Father,Mother {

	public static void main(String[] args) 
	{
		
		Son s = new Son();
		s.hardwork();
		s.honesty();
		s.look();
		s.nature();
		s.bike();
		s.love();    // in this method we have provide the super keyword ,so using this we can call which method we want
		Father.test();  //As this is static method from another class then we can not override this method. 
		Mother.test();  //As we know , to calling static method from another class we can follow following syntax.
	    //ClassName.methodname();
		
	}

	@Override
	public void look() {
		System.out.println("Mother look completed in son class");
		
	}

	@Override
	public void nature() {
		System.out.println("Mother nature completed in son class");
		
	}

	@Override
	public void hardwork() {
		System.out.println("Fathers hardwork completed in son class");
		
	}

	@Override
	public void honesty() {
		System.out.println("Fathers honesty completed in son class");
		
	}

	@Override
	public void love()   //love method is common  in Mother as well as father, 
	// to avoid this confusion we will break the rule of interface by making method as default or static
	//now check the father and mother class 
	{
		Father.super.love(); // to call default method from father and mother class then we need to follow 
		//above syntax :- classname.super(keyword).method name which is same in both class;
		Mother.super.love(); //classname.super(keyword).method name which is same in both class;
		
	}
	
	public void bike()
	{
		System.out.println("Sones own bike");
	}

}
