package mock;

public interface Interface1
{
     public void display();
     
     public void show();
     
     public default void samementhod()
     {
    	 System.out.println("Hii");
	}
}
