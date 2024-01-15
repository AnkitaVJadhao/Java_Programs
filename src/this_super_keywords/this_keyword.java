package this_super_keywords;

public class this_keyword 
{ 
	
	int a;
	int b;
	
	public this_keyword()
	{
		a=20;
		b=10;
	}
	
	public static void main(String[] args)
	{
		this_keyword t1=new this_keyword();
		t1.multiplication();
		
	}
	
	public void multiplication()
	{
		int a=30;
		int b=20;
		System.out.println(a*b);  //now here output will be 30*20, becoze it's take local variable value first
		//but what if I want the value of global variable , in this we need to use the "this" keyword.
		System.out.println(this.a*this.b);//now here output will be 20*10 , it's take the global variable as we use this keyword.
	}

}
