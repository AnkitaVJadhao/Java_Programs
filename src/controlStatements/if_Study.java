package controlStatements;

public class if_Study {
	public static void main(String[] args) 
	
	{
		char gender;
		gender='M';
		
		//1.control Stmt to check gender is equal to Male or not.
		if(gender=='M')
		{
			System.out.println("a==b");
			System.out.println(gender=='F');  //false
			System.out.println("1.I am Male");
			System.out.println("==================");
		}
		
		String name;
		name="Ankita";
		
		//2.control statmt 
		if(name=="Ankita")
		{
			System.out.println("a==b");
			System.out.println(name=="Ankita");
			System.out.println("2.My name is Ankita");
			System.out.println("==================");
		}
		
		int a=30;
		int b=25;
		
		//3. a>b condition
		if(a>b)
		{
			System.out.println("a>b");
			System.out.println(a>b);
			System.out.println("3.A is greater");
			System.out.println("==================");
		}
	   
		 int x=20;
		 int y=30;
		
		//4. a<=b condition
		if(x<=y)
		{
			System.out.println("a<=b");
			System.out.println(x<=y);
			System.out.println("4.X is less than equal to Y");
			System.out.println("==================");
		}
		
		//5. not equal to 
		if(x!=y)
		{
			System.out.println("a!=b");
			System.out.println(x!=y);
			System.out.println("4.X is not equal to Y");
			System.out.println("==================");
		}
		
		
		int n=4;
        int m=8;
        if(n<m)
        {
            System.out.println("lesser");
        }
		
	}

}
