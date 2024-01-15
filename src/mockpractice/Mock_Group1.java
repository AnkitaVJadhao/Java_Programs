package mockpractice;

public class Mock_Group1 {

	public static void main(String[] args)
	{
		String s1="Ankita Jadhao";
		String s2=new String("Ankita Jadhao");
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.length());
		System.out.println(s1.indexOf('k')); 
		System.out.println(s1.equals(s2));
		System.out.println(s1.charAt(0));
		
		System.out.println("=======================");
		
		String s3="";  //declare blank string for storing the reverse program
	
		for(int i=s1.length()-1; i>=0;i--)   //13-1; condition check
		{    
		    // s3=s1.charAt(i);  display error as data type is not same so i have take the 
			// + , to concat the two string
			// charAt method is used to find the at provided index value
			s3+=s1.charAt(i);	//s3=s3+s2 , if i =12 , s3=s3+0 = s3=0 
			
			//this loop execute till condition false
			//System.out.println(s3);  if I add println here then output is like 
			//like patteSrn  
			
		}
		//here output will in one line
		System.out.println(s3);
		
	}

}
