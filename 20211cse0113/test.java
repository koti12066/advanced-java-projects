package classobjectDEMO;
class circle {
	public double x,y;
	public double r;
	public void circumference() {
		System.out.println("circumference is "+2*3.141*r);
	}
	public void area() {
		System.out.println("Area is "+3.141*r*r);
	}
}

public class test {

	public static void main(String[] args) {
		circle acircle=new circle();
		circle bcircle=new circle();
		acircle.circumference();
		bcircle.circumference();
		acircle.area();
		bcircle.area();

	}

}
