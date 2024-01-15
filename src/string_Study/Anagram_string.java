package string_Study;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram_string {

	public static void main(String[] args) 
	{
		boolean flag=true;  //we have to decide that it's anagram string or not 
		System.out.println("Enter first string");
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		//String s1="silent"; //triangle //silent
		String[] split_s1 = s1.split(""); //split s1 = {t,r,i,...e}
		Arrays.sort(split_s1);    //alphabetical order:- e,i,l,n,s,t
		
		
		System.out.println("Enter second string");
		String s2=sc.next();
		//String s2="listen";  //listen
		String[] split_s2 = s2.split(""); //split s2={i,t,.....l}
		Arrays.sort(split_s2);   //alphabetical order:- e,i,l,n,s,t
		
		
		if(split_s1.length!=split_s2.length)
		{
			System.out.println("String is not anagram");
			return;
		}
		else
		{
			for(int i=0;i<split_s1.length;i++)
			{
				if(split_s1[i].equals(split_s2[i]))    //e=e
				{
					continue;
				}
				else
				{
					flag =false;
					break;
					
				}
			}
		}
		
		if(flag)
		{
			System.out.println("String is anagram");
		}
		else
		{
			System.out.println("String is not anagram");
		}

	}

}
