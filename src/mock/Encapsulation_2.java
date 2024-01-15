package mock;

public class Encapsulation_2 {

	public static void main(String[] args) 
	{
		
		Encapsulation e1=new Encapsulation();
		System.out.println(e1.getInt());  //default
		e1.setInt(2);
		System.out.println(e1.getInt()); 
		System.out.println(e1.getString()); //default
		e1.setString("Ankita");
		System.out.println(e1.getString());
		

	}

}
