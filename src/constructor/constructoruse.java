package constructor;

public class constructoruse {
	
	public constructoruse()    //user defined without parameter constructor
	   {
		   System.out.println("Hii this is constructor");
	   }

	public static void main(String[] args) 
	{
	
		constructoruse c1=new constructoruse(); //created object of a class
		c1.demo();

	}
    public void demo()
    {
    	System.out.println("Hii Good morning");
    }
}
