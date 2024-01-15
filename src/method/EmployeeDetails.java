package method;

public class EmployeeDetails 
{
 
	public static void main(String[] args)
	{
		EmployeeDetails e1= new EmployeeDetails();
		e1.employeeDetails();
		e1.employeeDetails("Alex", 23, 'M', 6.800f); //calling non-static with parameter.
		e1.employeeDetails("ABC", 45, 'F', 5.67f);  //calling non-static with parameter.
		
	}
	public void employeeDetails()
	
	{
		//name, empid, Gender,salary
		String name;
		int empid;
		char gender;
		float salary;
		name="Ankita";
		empid=30;
		gender='F';
		salary=7.500f;
		System.out.println("============================");
		System.out.println("My name is "+name);
		System.out.println("My emp id is "+empid);
		System.out.println("My gender is "+gender);
		System.out.println("My salary is "+salary+"lpa");
		System.out.println("============================");
	}
	
	public void employeeDetails(String name, int empid, char gender, float salary)
	{
		System.out.println("============================");
		System.out.println("My name is "+name);
		System.out.println("My emp id is "+empid);
		System.out.println("My gender is "+gender);
		System.out.println("My salary is "+salary+"lpa");
		System.out.println("============================");
	}

}
