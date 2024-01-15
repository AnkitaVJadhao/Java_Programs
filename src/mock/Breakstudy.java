package mock;

public class Breakstudy {

	public static void main(String[] args)
	{
		
		
		//current loop end
//		for(int i=0;i<5;i++)
//		{
//			System.out.println(i);
//			if(i==3)
//			{
//				break;
//			}
//			
//		}
		
		//current iteration skip
		for(int i=0;i<5;i++)
		{
			
			if(i==3)
			{
				continue;  //skip i=3
			}
			System.out.println(i); //0,1,2,4
			
		}
		

	}

}
