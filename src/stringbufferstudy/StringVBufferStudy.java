package stringbufferstudy;

public class StringVBufferStudy {

	public static void main(String[] args)
	{
		
		String s="ankita";
		String s3 = s.concat(" ").concat("jadhao");
		System.out.println(s3);
		System.out.println(s);  //Output will be only Ankita
		System.out.println("=======================");
		//But what if I want Ankita jadhao
		
		StringBuffer s2=new StringBuffer("ankita");
		s2.append(" ").append("jadhao");
		System.out.println(s2);
		System.out.println("=======================");
	    System.out.println(s2.charAt(0));
	    System.out.println("=======================");
	    s2.delete(7, 13);
	    System.out.println(s2);
	    System.out.println("=======================");
	    s2.insert(7, "jadhao");
	    System.out.println(s2);
	    System.out.println("=======================");
	    System.out.println(s2.length());
	    System.out.println("=======================");
	    System.out.println(s2.indexOf("a"));
	    System.out.println("=======================");
	    System.out.println(s2.indexOf("a", 2));
	    System.out.println("=======================");
	    System.out.println(s2.lastIndexOf("a"));
	    System.out.println("=======================");
	    System.out.println(s2.replace(6, 7, "-"));
	    System.out.println("=======================");
	    System.out.println(s2.reverse());
	    System.out.println("=======================");
	    //System.out.println(s2.charAt(20)); Exception 
	    System.out.println("=======================");
	    System.out.println(s2.indexOf(s)); //Return -1 as a output
	    System.out.println("=======================");
		
	}

}
