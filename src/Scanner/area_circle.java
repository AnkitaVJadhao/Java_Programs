package Scanner;

import java.util.*;

public class area_circle {
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		double radius=sc.nextDouble();
		
		double area= 3.14d*(radius*radius);
		System.out.println("radiuse of circle is "+radius);
		System.out.println("Area of circle is "+area);
		
		
	}

}
