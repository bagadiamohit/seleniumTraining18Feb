package demosByTrainer;

abstract class Example1
{
	public abstract void Show(int num);
	
	public void Display() {
	System.out.println("Concrete Method");
	}
}
class Example2 extends Example1{
	public void Show(int num) {
		System.out.println("Abstract Method defined"+num);
	}
	
	public void Display1()
	{
		//super.Display();
		System.out.println("Own Method defined");
	}
}

public class AbstactClass {

	public static void main(String[] args) {
		Example1 e2=new Example2();
		e2.Display();
		e2.Show(98);
		//e2.Display2();
	}

}
