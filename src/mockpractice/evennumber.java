package mockpractice;

public class evennumber 
{

	 public static void main(String[] args) 
	 {	

			isevennumber(34);
			isevennumber(-12);
			isevennumber(1.34);
	 }
public static void isevennumber(double n)
{
	if(n==0||n%1!=0||n<0)
	{
		System.out.println("Please enter valid number");
	}
	else
	{
		if(n%2==0)
		{
			System.out.println(n+" is Even");
		}
		else
		{
			System.out.println(n+" is odd");
		}
	}
}
}


	


