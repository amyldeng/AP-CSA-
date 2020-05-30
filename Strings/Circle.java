import java.math.*;
public class Circle {

	private double radius;
	
	public Circle() {
		
	}
	
	public Circle(double r) {
		radius = r;
	}
	
	public void changeRadius(double r) {
		radius = r;
	}
	
	public double computeArea() {
		return Math.PI*radius*radius;
		
	}
	public double computeCircumference() {
		return Math.PI*2*radius;
	}
	public double computeDiameter() {
		return 2*radius;
	}
	@Override
	public String toString() {
		return "Circle \n Radius: " + radius + " units\n " + "Area: " + computeArea() + 
				" square units\n Diameter: " + computeDiameter() + " units\n Circumference: " + 
				computeCircumference() + " units";
	}
}
