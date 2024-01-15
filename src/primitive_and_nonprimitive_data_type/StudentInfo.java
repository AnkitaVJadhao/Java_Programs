package primitive_and_nonprimitive_data_type;

public class StudentInfo 
{

	public static void main(String[] args) 
	{
		//name,gender,age,avg_result,marks,pass-fail status
		
		//variable declaration
		String name;
		char gender;
		int age;
		float avg_result;
		int marks;
		boolean result_Status;
		
		//variable initialize 
		name="Ankita";
		gender='F';
		age=17;
		avg_result=86.56f;
		marks=80;
		result_Status=true;
		
		//usage
		System.out.println("=======================================");
		System.out.println("My name is "+name+".");
		System.out.println("My gender is "+gender+".");
		System.out.println("My age is "+age+".");
		System.out.println("My avg result is "+avg_result);
		System.out.println("My marks is "+marks+"% .");
		System.out.println("My result status is "+result_Status+".");
		System.out.println("=======================================");

	}

}
