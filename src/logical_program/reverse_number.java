package logical_program;

public class reverse_number {

	public static void main(String[] args) {
		  int a =123;
		  int reverse =0;
		  int b=a;
		  
		  while(a!=0)    //123
		  {
			  int c=a%10;    //3
			  reverse=reverse*10+c;   // 0+3
			  a=a/10;   //
			  
		  }
		  System.out.println(reverse);
		  if(reverse==b)
		  {
			  System.out.println("Number is palindrome");
		  }
		  else
		  {
			  System.out.println("Number is not palindrome");
		  }

	}

}
