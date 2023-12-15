package test;

public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1="Clean India Green India";
		
		//To find the total number of characters in the string
		System.out.println("Total no of characters are "+str1.length());
		
		//To find the 1st character of the string
		System.out.println("First character is "+str1.charAt(0));
		
		//To find the last character of the string
		System.out.println("Last character is "+str1.charAt(str1.length()-1));
		
		//To change it to UpperCase
		
        System.out.println("The Upper Case is "+str1.toUpperCase());

	}

}
