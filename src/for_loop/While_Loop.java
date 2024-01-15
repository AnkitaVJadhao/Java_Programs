package for_loop;

public class While_Loop {

	public static void main(String[] args) 
	
	{
		int a=10;     //initialization
		while(a<=100)     //condition
		{
			System.out.println(a);
			a=a+10;       //updatation
		}  
		
		System.out.println("========================");
		
		
		int b=100;       //initialization
		while(b>=10)     //condition
		{
			System.out.println(b);
			b=b-10;       //updation
		}
		
		int s=1;
		while(s<=5)
		{
			System.out.println(s);
			s++;
		}
		
		System.out.println("================");
		int sum=0;
		int first=1;
		while(first<=50)
		{
			
			sum=sum+first; 
			first++;    
		}
		System.out.println(sum);
		System.out.println("================");
		
		
		
	}
}


