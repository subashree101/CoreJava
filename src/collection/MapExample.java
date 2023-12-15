package collection;

import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,Integer>  map1 = new HashMap<String,Integer>();
		
		map1.put("Item1", 100);
		map1.put("Item2", 200);
		map1.put("Item3", 100);
		map1.put("Item4", 50);
		
		System.out.println(map1);
		
		map1.put("Item1", 700);
		System.out.println(map1);
		
		//Find the price of Item4 from the list
		System.out.println("The price of 4th item in the list is "+map1.get("Item3"));
	
	   //To Remove particular Item from the list
	  map1.remove("Item4");
	  System.out.println(map1);
	  
	  //To Iterate map values
	  for(int value:map1.values()) {
		  
		  System.out.println("Value is "+value);
	  }
	  
	  //To Iterate key values
	  for(String key:map1.keySet()) {
		  
		  System.out.println("The key is "+key);
	  }
	  
	  //Find the occurrence of each string
	  String str1="Clean World Green World Happy World";
	  
	  //Clean 1
	  //Green 1
	  //Happy 1
	  //World 3
	  
	  
	
	}
}
