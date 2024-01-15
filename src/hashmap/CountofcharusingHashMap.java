package hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class CountofcharusingHashMap {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array");
		int n = sc.nextInt();
		String a[] = new String[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Enter any string");
			a[i] = sc.next();
		}
		
		// String a="madagascar"; //m=1
		// String a[]= {"madagascar","ankita","akola"};

		for (int i = 0; i < a.length; i++) {
			countchar(a[i]);
		}

	}

	public static void countchar(String a)
	{
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < a.length(); i++) 
		{
			if (map.get(a.charAt(i)) == null)
			{
				map.put(a.charAt(i), 1); // m=1 //a=1 //d=1 //
			} else 
			{
				map.put(a.charAt(i), map.get(a.charAt(i)) + 1); // a=1+1 =2
			}

		}
		System.out.println(a + " " + map);

	}

}
