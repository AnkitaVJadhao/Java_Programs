package string_Study;

public class String_1 {

	public static void main(String[] args)
	{
		String s1="levelabc";  
		
//		String[] s3 = s1.split(""); 
//		
//		for(String ele:s3)
//		{
//			System.out.println(ele);
//		}
//		String s2="";
//		
//		for(int i=s1.length()-1;i>=0;i--)
//		{
//			s2=s2+s3[i]; 
//		}
//		if(s2.equals(s1))
//		{
//			System.out.println("String is palindrome");
//		}
//		else 
//		{
//			System.out.println("String is not palindrome");
//		}
		System.out.println("=====================================");
		
		int left=0;
		int right=s1.length()-1;
		boolean flag=true;
		
		while(left<=right)  //left is less than or equal to right
		{
			if(s1.charAt(left)==s1.charAt(right))
			{
				left++;
				right--;
			}
			else
			{
				flag=false;
				break; //current loop end
			}
		}
		if(flag) //flag=true or false
		{
			System.out.println("String is palindrome");
		}
		else if (flag==false) {
			System.out.println("String is not palindrome");
		}
		
		

	}

}
