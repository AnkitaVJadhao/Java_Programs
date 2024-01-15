package mock;

public class Encapsulation {

	private int a1;
	private String name;
	
	public void setInt(int b)
	{
		this.a1=b;    //this . variable name 
		
	}
	public void setString(String c)
	{
		this.name=c;
	}
	
	public int getInt()
	{
		return a1;    //return type use :- it will return the int value
	}
	
	public String getString()
	{
		return name;
	}
	

}
