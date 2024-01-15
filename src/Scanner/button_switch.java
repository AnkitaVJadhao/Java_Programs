package Scanner;
import java.util.*;

public class button_switch 
{

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		int button=sc.nextInt();
		
		switch(button)  //we use this cntrol stmt when we have more that one if else stmt and we want clear program
		{
		case 1:System.out.println("Hii");
		break;
		
		case 2:System.out.println("Namste");
		break;
		
		case 3:System.out.println("Namskar");
		break;
		
		default: System.out.println("Enter correct number");
		
		}

	}

}
