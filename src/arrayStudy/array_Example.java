package arrayStudy;

public class array_Example {

	public static void main(String[] args)
	{
		String players[] = new String[10];
		players[0]= "Gill";
		players[1]="Virat";
		players[2]="Rohit";
		players[3]="Surya";
		players[4]="KL";
		//Usage 
		System.out.println("Name of player is "+players[0]);
		System.out.println("Name of player is "+players[1]);
		System.out.println("Name of player is "+players[2]);
		System.out.println("Name of player is "+players[3]);
		System.out.println("Name of player is "+players[4]);
		System.out.println("===============================");
		
		int rollno[]= new int[5];
		rollno[0]=1;
		rollno[1]=2;
		rollno[2]=3;
		rollno[4]=4;
		System.out.println(rollno[0]);
		System.out.println(rollno[1]);
		System.out.println(rollno[2]);
		System.out.println(rollno[3]);  //default value will print
		System.out.println(rollno[4]);
		System.out.println("======================");
		
		String name[]=new String[5];
		name[0]="Ankita";
		name[1]="Ankita1";
		name[2]="Ankita2";
		name[3]="Ankita3";
		name[4]="Ankita4";
		
		//Static for loop
		for(int i=0; i<=4; i++)   //Iterative to array and Travesing to array
		{
			System.out.println(name[i]);
		}
		// length is method in arrays , that give return values as a index value. 
		//As i have added 5 words then each word has one index value and then total 5 index 
		//But in string length method give output of number of charachter present in that string 
		
		System.out.println(name.length);
		System.out.println("=====================");
		//Dynamic for loop
		
		for(int i=0; i<=players.length-1;i++)
		{
			System.out.println(players[i]);
		}
		System.out.println("=====================");
		
		//static for loop
		
		boolean TorF[]=new boolean[5];
		TorF[0]=true;
		TorF[1]=false;
		
		//static for loop
		for(int i=0; i<=2; i++)
		{
			System.out.println(TorF[i]);
		}
		System.out.println("=========================");
		//dynamic for loop
		for(int i=0; i<=TorF.length-1; i++)
		{
			System.out.println(TorF[i]);
		}
		System.out.println("=========================");
		
		float percentage[]= new float[5];
		percentage[0]=65.34f;
		percentage[1]=75.89f;
		percentage[2]=80.90f;
		percentage[3]=85.65f;
		percentage[4]=95.45f;
		
		//static for loop
		for(int i=0; i<=4; i++)
		{
			System.out.println(percentage[i]);
		}
		System.out.println("============================");
		//Dynamic for loop
		for(int i=0; i<=percentage.length-1; i++)
		{
			System.out.println(percentage[i]);
		}
		System.out.println("===============================");

	}

}
