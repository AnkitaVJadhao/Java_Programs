package controlStatements;

public class Switch_Case {

	public static void main(String[] args) 
	
	{
		String name="Ankita";
		
		switch (name) 
		{
		case "Test": System.out.println("Hii Test");
		break;
		case "Mukta":System.out.println("Hii mukta");
		break;
		case "Ankita":System.out.println("Hi Ankita");
		break;
		default:System.out.println("Please enter valid name");
		}
		System.out.println("======================================");
		
		String colour="Yellow";
		
		switch(colour)
		{
		case "Red": System.out.println("STOP");
		break;
		case"Green":System.out.println("Run");
		break;
		case"Yellow":System.out.println("SLOW :- Red signal is about to appear");
		break;
		default:System.out.println("Stuck Signals");
		}
		System.out.println("======================================");
	}

}
