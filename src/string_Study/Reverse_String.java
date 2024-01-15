package string_Study;

public class Reverse_String {

	public static void main(String[] args)
	{
		
		String a="Ankita";
		String[] splitchar = a.split("");
		String b="";
		
		for(int i=a.length()-1;i>=0;i--)
		{
			b=b+splitchar[i];
		}
		System.out.println(b);
		System.out.println("===============================");
		StringBuffer s1=new StringBuffer(a);
		System.out.println(s1.reverse());
	}
	

}
