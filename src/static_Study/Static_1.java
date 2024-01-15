package static_Study;

public class Static_1 {

	public static int a=10;
	int b=20;
	
	public static void main(String[] args) {
		
		System.out.println(a);
		//Error :- static method --> static variable
		Static_1 s=new Static_1();
		System.out.println(s.b);
		
	}
	public void nonStatic()
	{
		System.out.println(a);
		System.out.println(b);
	}

}
