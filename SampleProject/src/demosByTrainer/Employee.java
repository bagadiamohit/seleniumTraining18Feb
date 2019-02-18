package demosByTrainer;

import java.util.Scanner;
class EmployeeInfo
{
	private int id;
	public String Name;
	public double Salary;
	Scanner s1=new Scanner(System.in);
	
	public void AcceptData()
	{
		System.out.println("Enter ID : ");
		id=s1.nextInt();
		System.out.println("Enter Name : ");
		Name=s1.next();
		System.out.println("Enter Salary : ");
		Salary=s1.nextDouble();
		
	}
	
	public void DisplayData()
	{
		System.out.println("Employee ID : "+id);
		System.out.println("Employee Name : "+Name);
		System.out.println("Employee Salary : "+Salary);
		
		
	}
	}
public class Employee {
	public static void main(String[] args) {
		EmployeeInfo Rohan=new EmployeeInfo();
		EmployeeInfo Shashank=new EmployeeInfo();
				
		Rohan.AcceptData();
		Shashank.AcceptData();
		
		Rohan.DisplayData();
		Shashank.DisplayData();

	}

}
