package demos;

import java.util.Scanner;

class EmployeeInfo{
	
	int empID;
	String name="";
	double salary;
	Scanner s1 = new Scanner(System.in);
	
	public void readData(){
		System.out.println("Enter the Employee Id: ");
		empID = s1.nextInt();
		
		System.out.println("Enter the Emp Name: ");
		name = s1.nextLine();
		name = name+s1.nextLine();
		
		System.out.println("Enter the Emp Salary: ");
		salary = s1.nextDouble();
		
		s1.close();
	}
	
	public void displayData(){
		System.out.println("Emp ID entered is: "+empID);
		System.out.println("Name of the emp is: "+name);
		System.out.println("Salary of the emp is: "+salary);
	}
	
}

public class FirstExample {

	public static void main(String[] args) {
		EmployeeInfo emp1 = new EmployeeInfo();
		emp1.readData();
		emp1.displayData();
		
		EmployeeInfo emp2 = new EmployeeInfo();
		emp2.readData();
		emp2.displayData();
	}

}
