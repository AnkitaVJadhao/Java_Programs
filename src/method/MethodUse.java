package method;
public class MethodUse {
	public static void main(String[] args) 
	{
	    MethodUse m1=new MethodUse();
	    m1.datatype();                // calling Non static without parameter method
	    primitivedatatype();         //calling static without parameter method
	    m1.primitivetype(20, 55.4543434d, 250012l, true, 'F'); //calling non-static with parameter method
	    nonprimitivetype("Ankita");   //calling static with parameter method
	    MethodUse2.employee(12, 4.456f, "Tester");//Static with parameter method from another class
	    MethodUse2 m2=new MethodUse2();
	    m2.client("Healthcare-OTR", 25); //Non-Static with parameter method from another class   
	}
	public void datatype()
	{
		System.out.println("*  Non static without parameter method*   ");
		System.out.println("1.In java, data type is classified into two type ");
		System.out.println("    a.Primitive data type");
		System.out.println("    b.Non-Primitive data type");
		System.out.println("========================================================================");
	}
	public static void primitivedatatype()
	{
		System.out.println("   *Static without parameter method*  ");
		System.out.println("1.There are 8 type of primitive data type");
		System.out.println("2.All these primitive data type are Keywords");
		System.out.println("3.Memory size of primitive data type are fixed");
		System.out.println("========================================================================");
	}
	public void primitivetype(int marks1, double avg,long total,boolean pass,char gender)
	{
		System.out.println("   *Non static with parameter method*   ");
		System.out.println("1.Marks3 has int data type which stores the values  "+marks1); 
		System.out.println("2.Avg has double data type which store the value "+avg );
		System.out.println("3.Total has long data type which store the value "+total);
		System.out.println("4.Pass has boolean data type which store value true and false "+pass);
		System.out.println("5.Gender has char data type which store value "+gender);
		System.out.println("========================================================================");	
	}
	public static void nonprimitivetype(String name)
	{
		System.out.println("  *Static with parameter method*  ");
		System.out.println("1.Name has string data type which store the value "+name);
		System.out.println("2.Class is also type of non-primitive data type");
		System.out.println("========================================================================");	
	}

}
