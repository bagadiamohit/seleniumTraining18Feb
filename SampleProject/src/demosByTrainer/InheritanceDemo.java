package demosByTrainer;

class Demo1{
	 
	public void Show() {
		System.out.println("Super class show method");
	}
}

class Demo2 extends Demo1{
	public void Show() {
		super.Show();
		System.out.println("Sub class show method");
	}
	public void Display() {
		System.out.println("Sub class");
	}
}

public class InheritanceDemo {

	public static void main(String[] args) {
		Demo2 d1=new Demo2();
		
		d1.Show();
		d1.Display();
	}

}
