package primitive_and_nonprimitive_data_type;

public class StringUse 
{
	public static void main(String[] args)
	{
	   
		 /*  1.In this program , we are learning about data type character :- String
		     2.Solves the case where a char data type cannot store multiple characters.
	 		 3.String is a Non-primitive data type.
	 		 4.Size of String data type is not fixed.
	 	     5.String data type is used to store the sequence of characters or Multiple characters */
		
		//I want to store company name with designation and employee user_name.
		
		String company;                                 						//Variable declaration

		company="Tech Mahindra Information technology company , Pune";         //Variable initialization 
		
		String designation;                                                    //Variable declaration
		
		designation="Associate test engineer";                                 //Variable initialization 
		
		String username;                                                       //Variable declaration
		
		username="aj@562";                                                     //Variable initialization 
		
		//usage
		
		System.out.println("My company name is "+company+".");
		System.out.println("In this company , I am working as a "+designation+".");
		System.out.println("And my employee username is "+username+".");	
		
	}
	
}
