package OOPS;

public class Employee {

	public String Name;
	public int EmpId;
	private int salary;
	
   public Employee() {
	   
	   System.out.println("Inside default constructor");
   }
	   
	   public Employee(String Name1, int EmpId1, int salary1) {
		   
		   this.Name=Name1;
		   this.EmpId=EmpId1;
		   this.salary=salary1;
		   
		   
   }
	
	   public void setSalary(int sal) {
		   salary=sal;
	   }

	public void display() {
		// TODO Auto-generated method stub
		
	}

	}

