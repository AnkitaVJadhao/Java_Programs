package method;

public class EmployeeInfo {
	
	//We are writing this program to understand how can we use/call static method from another class.

	public static void main(String[] args) 
	{
		
		//call static method in same class , we need to write method name in main method.
		employee1();   //calling static method from same class.
		employee2();   //calling static method from same class.
		System.out.println("#Calling static method from another class#");
		//call static method from another class 
		//syntax is :- className.methodName();
		ClientInfo.clientinfo1();
		ClientInfo.clientinfo2();

	}
	
	public static void employee1() //static -regular complete method in same class
	{
	System.out.println("#Calling static method from same class#");
	System.out.println("1.Name of Employee is Ankita and her designation is test engineer.");	
	}
	
	public static void employee2() //static -regular complete method in same class
	{
	System.out.println("2.Name of Employee is Alex and his designation is Frontend developer.");
	System.out.println("*******************************************************************");
	}

}
