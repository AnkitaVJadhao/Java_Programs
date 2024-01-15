package this_super_keywords;

public class super_keyword extends this_keyword
{
	
	//super keyword is use to access global variable from super class.
	
	int a=200;
	
	
	public static void main(String[] args) 
	{
	     super_keyword s1=new super_keyword();	
	     s1.addition();

	}
	
	public void addition()
	{
		
		int b=a+super.a;  
		// int b = 200 +20( from another class using super keyword and we need to flow inheritance conpect here.
		System.out.println("Addition is "+b);
	}

}
