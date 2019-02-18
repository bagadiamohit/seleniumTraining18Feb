package demosByTrainer;

class LoadingDemo{
	
	public void Data(String str) {
		System.out.println("Sting value :"+str);
	}
	
	public void Data(String str, double d1) {
		System.out.println("Sting value :"+str);
		System.out.println("dec value :"+d1);
	}
}

public class OverLoading {

	public static void main(String[] args) {
		LoadingDemo d1=new LoadingDemo();
		
		d1.Data("Java",2.1);
		d1.Data("Selenium");

	}

}
