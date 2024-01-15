package method;

public class MethodUse2

{
	public static void employee(int empid,float salary, String designation)
	{
		System.out.println(" *Static with parameter method from another class* ");
		System.out.println("1.The empid is "+empid);
		System.out.println("2. The salary is "+salary);
		System.out.println("3.The designation is "+designation);
		System.out.println("========================================================================");
	}
	public void client(String name, int clientid)
	{
		System.out.println(" *Non-Static with parameter method from another class* ");
		System.out.println("1.The client is "+name);
		System.out.println("2. The clientid is "+clientid);
	}
}
