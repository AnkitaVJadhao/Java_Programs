package string_Study;

public class String_3
{

	public static void main(String[] args) 
	{
//		String s1="Dynamic";
//		
//		for(int i=1;i<=s1.length()-1;i=i+2)
//		{
//			System.out.println(s1.charAt(i));
//		}
	System.out.println("==============");
	convertstringcapital_to_lowercase("ABCD");
	printAtoZ();
	convertstringlower_to_uppercase("abcde");
	
	
	}
	public static void convertlowercase_to_capital()
	{
		char a='A';  //Ascii =65  
		a='A'+32;
		System.out.println(a);
	}
	public static void convertstringcapital_to_lowercase(String capital)
	{
		for(int i=0;i<capital.length();i++)
		{
			char a=capital.charAt(i);  //Ascii =65  
			int a1=a+32;
			System.out.print((char)a1);  //type caste int to char 
		}
		
	}
	public static void printatoz()
	{
		for(int i=(65+32);i<=(90+32);i++)
		{
			System.out.println((char)i);
		}
		
	}
	
	public static void printAtoZ()
	{
		for(int i=65;i<=90;i++)
		{
			System.out.println((char)i);
		}
		
	}

	public static void convertstringlower_to_uppercase(String capital)
	{
		for(int i=0;i<capital.length();i++)
		{
			char a=capital.charAt(i);  //Ascii =65  
			int a1=a-32;
			System.out.print((char)a1);  //type caste int to char 
		}
		
	}

}
