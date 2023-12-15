package OOPS;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp1 = new Employee();
		emp1.Name="suba";
		emp1.EmpId=101;
		emp1.setSalary(100000);
		
		Employee emp2 = new Employee();
		emp2.Name="siva";
		emp2.EmpId=102;
		emp2.setSalary(200000);
		
		emp1.display();
		emp2.display();
		
	}

}
