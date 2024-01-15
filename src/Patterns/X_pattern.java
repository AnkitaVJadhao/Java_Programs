package Patterns;

public class X_pattern 
{
//    X_____X        //2 X and 5 space
//	   X___X        // 3 space
//	    X_X        //1 space
//	     X        // 0 space
//	    X_X      //1 
//	   X___X    //3 space 
//	  X_____X  //5 space
	 
	public static void main(String[] args) 
	{
      for(int i=1; i<=5; i++)    // ROW 
      {
    	  for(int j=1; j<=i-1; j++)    //print space
    	  {
    		  System.out.print(" ");
    	  }
    	  System.out.print("*");     // when this condition became false it will print *
    	  for(int k=1;k<=2*(5-i); k++)
    	  {
    		  System.out.print(" ");
    	  }
    	  System.out.println("*");
    	
    	  
      }
      for(int i=2; i<=5; i++)
      {
    	  for(int j=1;j<=5-i; j++)
    	  {
    		  System.out.print(" ");
    	  }
    	  System.out.print("*");
          for(int k=1; k<=2*(i-1); k++)
          {
        	  System.out.print(" ");  
          }
          System.out.println("*");
      }
	}
}


