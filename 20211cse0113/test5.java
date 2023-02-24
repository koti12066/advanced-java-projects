//interface demo
package classobjectDEMO;
import java.util.Scanner;

interface shape2 {
	public void setradious(double d);
	public void area();
	public void volume();
}
class circle2 implements shape2 {
	double radious;
	public void setradious(double radious) {
		this.radious=radious;
	}
public void area() {
	System.out.println("area is "+3.141*radious*radious);
}
public void volume() {}
}
class sphere2 implements shape2 {
	double radious;
	public void setradious(double radious) {
		this.radious=radious;
	}
	public void area() {}
	public void volume() {
		System.out.println("volume is"+4.0/3*3.14*radious*radious*radious);
	}
}
public class test5 {

	public static void main(String[] args) {
		int dimension;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 2 or 3");
		dimension=sc.nextInt();
		shape2 s;
		if(dimension==2) {
			s=new circle2();
			s.setradious(3.5);;
			s.area();
		}
	
		// TODO Auto-generated method stub

	}

}