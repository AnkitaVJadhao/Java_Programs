package Abstract_Class;

public class First_Concrete extends One_Abstract //One Abstract class may have multiple concrete class→

{

	public static void main(String[] args)
	{
		First_Concrete f1=new First_Concrete();
		f1.developer();
		f1.developer1();
		f1.developer2();

	}
	
	public void developer2()
	{
		System.out.println("Hii I am Python developer");
	}

	@Override
	public void developer() {
		System.out.println("Hii I am c++ developer from Abstract class");
		
	}
	
	

}
