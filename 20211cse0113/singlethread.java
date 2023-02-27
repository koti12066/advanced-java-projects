//it creates single thread to print 1 to 5
//total 2 thread (main,one)
class Mythread extends Thread {
	String name;
	Mythread(String threadname) {
	name=threadname;
	System.out.println(name + " thread created");
		}
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
		}
	}

public class singlethread {
	public static void main(String[] args) throws Exception { 
		System.out.println("Main thread begins");
		System.out.println("hello");
		//context switch to thread one
		Mythread m1=new Mythread("one");
		m1.start();
		Thread.sleep(5000);
		System.out.println("bye");


	}

}
