package demos;

import java.util.Scanner;

class Swapping{
	
	public void swappingNum(int a, int b){
		/*System.out.println("Numbers before swapping: "+a+" "+b);		
		int temp = b;
		b=a;
		a=temp;		
		System.out.println("Numbers after swapping: "+a+" "+b);*/
		
		//without using a third variable
		System.out.println("Numbers before swapping: "+a+" "+b);
		b=b-a;
		a=a+b;
		b=a-b;
		System.out.println("Numbers after swapping: "+a+" "+b);
		
	}
	
}
public class SwappingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter any 2 numbers which needs to be swapped: ");
		Scanner s1=new Scanner(System.in);
		int num1 = s1.nextInt();
		int num2 = s1.nextInt();
		Swapping obj1 = new Swapping();
		obj1.swappingNum(num1, num2);
	}

}
