package arrayStudy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class multiDimensionArray {

	public static void main(String[] args) {
		
		
		int [][] myNumber= {{1,2,3,4},{4,5,6,7}};
		
		int[][]number2=new int[2][3];
		
		number2[0][0]=1;
		number2[0][1]=2;
		number2[0][2]=3;
		number2[1][0]=4;
		number2[1][1]=5;
		number2[1][2]=6;
		
		
		System.out.println(myNumber.length);  //number of rows  point to := 0th row 
		System.out.println(myNumber[0].length); //dynamically coln :- 1 represent which row
		//it will point to 1 st row and check how many comma in this bracket.
		
		
		for(int i=0; i<=number2.length-1; i++)  //row
		{
			for(int j=0; j<=number2[0].length-1;j++)  //dynamically coln 
			{
				System.out.print(number2[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("=====================");
		int[]a1= {56,34,109,43,55,10};
		
		Arrays.sort(a1); //Arrays :- class 

       for(int i=0; i<=a1.length-1; i++)
       {
    	   System.out.println(a1[i]);
       }
       
       System.out.println("=======================");
       
       String name="Ankita,Amol,Subhash";  //split array 
       String[] name2=name.split(",");   //return array
       
      
       
       for(int i=0; i<=name2.length-1;i++ )
       {
    	   System.out.println(name2[i]+" ");
       }
       

	}

}
