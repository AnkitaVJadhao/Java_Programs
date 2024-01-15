package Abstract_Class;

public abstract class Abstract_demo // if  i change incomplete method into abstract then in class "abstract" keyword will display.
{

	//	An Abstract class is nothing but an incomplete 
	//	class where programmer can declare complete as well as incomplete methods in it. 
	//method hide 
	
	

	public  void msg1()
	{
		System.out.println("Hi I am frist complete class");
	}
	
	public void msg2()
	{
		 System.out.println("Hi I am second complete class");
	}
	
	// If I declared method like incomplete then it will display error msg as:- "public void msg3();"
	//1.Add body , 2 change this method to abstract.
	public abstract void msg3();   // if we provide abstract keyword here then it will not display error msg.
}




