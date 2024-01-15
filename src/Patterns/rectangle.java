package Patterns;

public class rectangle {

	public static void main(String[] args) 
	{
		 for(int i=1; i<=4;i++)
		 {
			 for(int j=1;j<=5;j++)
			 {
				 if(i==1 || j ==1 || i==4 || j==5)
				 {
					System.out.print("*"); 
				 }
				 else
				 {
					 System.out.print(" ");
				 }
			 }
			 System.out.println();
		 }
     System.out.println("============================");
     
////       1
////       12
////       123
////       1234
////       12345
     
     for(int i=1; i<=5; i++)       //row 
     {
    	 for(int j=1; j<=i; j++)   //coln 
    	 {
    		 System.out.print("*");
    	 }
    	 System.out.println();
     }
     System.out.println("============================");
////       12345
////       1234 
////       123
////       12
////       1
//     
     for(int i=1; i<=5; i++)   //12345
     {
    	 for(int j=1; j<=5-i+1; j++)
    	 {
    		 System.out.print("*");
    	 }
    	 System.out.println();
     }
     System.out.println("============================");
////           1
////          12
////         123 
////        1234 
////       12345 
//            
     for(int i=1; i<=5; i++) 
     {
    	for(int j=1; j<=5-i; j++)
    	{
    		System.out.print(" ");
    	}
    	for(int k=1; k<=i; k++)
    	{
    		System.out.print("*");
    	}
    	System.out.println();
     }
     System.out.println("============================");
////      12345
////       1234
////        123
////         12
////          1
//     
     for(int i=1; i<=5; i++)
     {
    	 for(int j=1; j<=i-1; j++)
    	 {
    		 System.out.print(" ");
    	 }
    	 for(int k=1; k<=5-i+1; k++)
    	 {
    		 System.out.print("*");
    	 }
    	 System.out.println();
     }
     System.out.println("==========================");
//     
//            *   
//           ***
//          *****
//         ******* 
//          *****
//           ***
//            *
	
     
     for(int i=1; i<=5; i++)
     {
     	 for(int j=1; j<=5-i; j++)
    	 {
    		 System.out.print(" ");
    	 }
    	 for(int k=1; k<=2*i-1; k++)
    	 {
    		 System.out.print("*");
    	 }
    	 System.out.println();
     }
     for(int i=2; i<=5; i++)
     {
    	 for(int j=2; j<=i; j++)
    	 {
    		 System.out.print(" ");
    	 }
    	 for(int k=1; k<=2*(5-i+1)-1; k++)
    	 {
    		 System.out.print("*");
    	 }
    	 System.out.println();
     }
     
     
	
	}

}
