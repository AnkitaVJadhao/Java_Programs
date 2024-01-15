package hashmap;

import java.util.HashMap;
import java.util.Map.Entry;

public class Hashmap_Study {

	public static void main(String[] args)
	{
	
		//HashMap
		//Store data in pair format 
		//key and it's value
		//key : unique
		
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		//add value
		//create
		map.put(1, "Ankita");
		map.put(2, "Chaitali");
		map.put(3, "Amol");
		map.put(4, "Devashish");
		
		//Read
		System.out.println(map.get(1));
		System.out.println(map.get(2));
		System.out.println(map.get(3));
		System.out.println(map.get(5));   //null :- we don't have any data
		
		//update
		map.put(1, "Anki");  //update 
		map.put(5, "Karishma");  //if we don't have data present on this index then it will add 
		System.out.println(map);
		
		//delete
		map.remove(1);
		System.out.println(map); 
		
		//Traveling 
		//for each
		//iterator
		System.out.println("=============================");
		for( Entry<Integer, String> ele:map.entrySet())
		{
			System.out.print(ele.getKey()+" ");
			System.out.println(ele.getValue());
		}
		
		

	}

}
