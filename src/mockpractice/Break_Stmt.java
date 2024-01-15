package mockpractice;

public class Break_Stmt {

	public static void main(String[] args)
	{
		
		int weekday=3;
		switch(weekday)
		{
		case 1:System.out.println("Sunday");
		break;
		case 2:System.out.println("Monday");
		break;
		case 3:System.out.println("Tuesday");
		
		//here I did not provide break keyword so it will print another stmt also 	 
		//I have provided the 3 as variable value and then compiler will search 3 then execute this stmt.
		
		case 4: System.out.println("Wnsday");
		break;
		//As we provide break keyword here compiler will stop and comes out of loop.
		default:System.out.println("Please enter valid number");
		}

	}

}
