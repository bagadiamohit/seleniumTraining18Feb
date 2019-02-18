package inheritance;

public class AreaMain {

	public static void main(String[] args) {
		AreaOfCircle a = new AreaOfCircle();
		double circleArea = a.areaCircle(5);
		System.out.println(circleArea);
		
		//as we are exrtending both the class with the Area class and if we use the object of 1 class and access the method of another class
		//the default implementation of method will be pickedup from the super class
		double RectArea = a.areaRectangle(5, 5);
		System.out.println(RectArea);
		
		AreaRectangle b = new AreaRectangle();
		double RectArea1 = b.areaRectangle(5,5);
		System.out.println(RectArea1);
	}

}
