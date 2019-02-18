package demosByTrainer;

class PassByVDemo{
	int number;
	String str1;
	
	public void Data(int number,String str1)
	{
		this.number=number;
		this.number++;
		this.str1=str1;
		System.out.println("Number : "+this.number);
		System.out.println("String : "+this.str1);
	}
}

public class PassByValue {

	public static void main(String[] args) {
		int num=90;
		String str="Java";
		PassByVDemo obj1=new PassByVDemo();
		
		obj1.Data(num, str);
		
		System.out.println("Number : "+num);
	}

}
