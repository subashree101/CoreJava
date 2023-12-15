package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list1=new ArrayList<String>();
		//Adding data to the list
		list1.add("suba");
		list1.add("siva");
		list1.add("lakshmi");
		System.out.println(list1);
		
		//To Access the data at 3rd position
		System.out.println("The data at 3rd position is "+list1.get(2));
		
		//To remove from the list
		list1.remove(0);
		
		System.out.println(list1);
		
		list1.add("aparna");
		list1.add("deepa");
		System.out.println(list1);
		
		//To print the last name into the array list
		System.out.println("Last Name is "+list1.get(list1.size()-1));
		
		//To change the value from a particular value
		list1.set(2, "Thara");
		System.out.println(list1);
		
		//Iterate through the list
		for(int i=0;i<list1.size();i++) {
			//System.out.println("Value at index is "+i+" "+list1.get(i));
			if(list1.get(i).equals("Thara")) {
				System.out.println("Value Thara is at index "+ i);
			}
			
			
			//Using For Each loop
			for(String name:list1) {
				System.out.println(list1);
			}
			
			//Sorting of data in ascending order
			Collections.sort(list1);
			System.out.println(list1);
			
			//Sorting of data in descending order
			Collections.sort(list1,Collections.reverseOrder());
			System.out.println(list1);
		}
		
	}

}
