//create 3 objects of a class room which is rectangular type.
//3 objects will be the size of 3 different class rooms
package classobjectDEMO;
import java.util.Scanner;
class Room {
	private int length,breadth;
	Room() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length and breadth");
		length=sc.nextInt();
		breadth=sc.nextInt();
	}
	public void print() {
		System.out.println("length="+length);
	    System.out.println("breadth="+breadth);
	}
}

public class test3 {

	public static void main(String[] args) {
		Room lf101 = new Room();
		Room lf102 = new Room();
		Room lf103 = new Room();
		System.out.println("First Room "); lf101.print();
		System.out.println("Second Room "); lf102.print();
		System.out.println("Third Room "); lf103.print();
	

	}

}
