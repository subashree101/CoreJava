package test;

public class LoopingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//While Loop
		int num1=1;
		while(num1<=10) {
			System.out.println(num1);
			num1=num1+1;
		}
		
		//To Print the numbers in descending order from 10 to 1
		
		int num2=10;
		while(num2>=0) {
			System.out.println(num2);
			num2=num2-1;
		}
		
		//For Loop
		for(int num3=1; num3<=10;num3++) {
			System.out.println(num3);
		}
		
		//Find even number between 1 to 50 using For loop
		
		for(int a=2; a<=50; a+=2) {
			System.out.println(a);
		}
		
		//For Each Loop
		int[] arr1= {50,54,12,23,43,90};
		int sum=0;
		for(int value:arr1) {
			System.out.println(value);
			sum+=value;
		}
	}
	
	

}
