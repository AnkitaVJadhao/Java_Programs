package String_Ex;

public class Example {

	public static void main(String[] args)
	{
		String s = "Pune";
		System.out.println(s.length());
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.indexOf('P'));
        System.out.println("============================");
		String s1=new String("Ankita");
		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.indexOf('k'));
		System.out.println(s1.equals(s));
		System.out.println("=================================");
		String s2="Ankita";
		String s3="Ankita";
		String s4="ankita";
		String s5=new String("Ankita");
		String s6=new String("ankita");
		String s7="";
		String s8=" ";
		//Equals
		System.out.println("=================================");
		System.out.println(s2.equals(s3));
		System.out.println(s2.equals(s4));
		System.out.println(s2.equals(s5));
		System.out.println(s2.equals(s6));
		System.out.println("=================================");
		//==
		System.out.println(s2==s3);
		System.out.println(s2==s4);
		System.out.println(s2==s5);
		System.out.println(s5==s6);
		System.out.println("=================================");
		//equalIgnoreCase()
		System.out.println(s2.equalsIgnoreCase(s4));  //it will ingnore the case 
		System.out.println("=================================");
		//Contain
		System.out.println(s5.contains("A"));
		System.out.println(s5.contains("ANK"));
		System.out.println(s5.contains("Ank"));
		System.out.println("=================================");
		//isEmpty()
		System.out.println(s2.isEmpty());
		System.out.println(s7.isEmpty());
		System.out.println(s8.isEmpty());
		System.out.println("=================================");
		//isBlank
		System.out.println(s7.isBlank());
		System.out.println(s8.isBlank());
		System.out.println("=================================");
		//charAt()
		System.out.println(s2.charAt(1));
		System.out.println(s4.charAt(0));
		//System.out.println(s4.charAt(45));   it will throw runtime error and it this is not 
		//solved then the method after this error it will not execute
		System.out.println("=================================");
		System.out.println(s6.substring(3, 6));
		
		
		String a="ankita";
		System.out.println(a.charAt(6));
		
		
		
  	}
}
