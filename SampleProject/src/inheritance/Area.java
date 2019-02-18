package inheritance;

public class Area {
	
	double radius;
	double lenght, breadth;
	
	public double areaCircle(double radius){
		return radius;
		
	}
	public double areaRectangle(double lenght, double breadth){
		return breadth;
	}
	
	public void ownMethod(){
		System.out.println("Own Method");
	}

}
