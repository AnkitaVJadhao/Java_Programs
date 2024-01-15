package Abstract_Class;

public class Second_Concrete extends One_Abstract  //One Abstract class may have multiple concrete class

{

	public static void main(String[] args) 
	{
		Second_Concrete s1=new Second_Concrete();
		s1.developer();
		s1.developer1();
		s1.developer4();

	}

	
	@Override
	public void developer() 
	{
		
		System.out.println("Hii I am c++ developer from Abstract class.");
		
	}
	
	public void developer4()
	{
		System.out.println("Hii I am learning java");
	}
	

}
