//creating a thread by extending thread
class myth extends Thread {
	public void run() {
		System.out.println(Thread.currentThread() + "running");
		System.out.println("welcome");
	}
}
public class test9 {

	public static void main(String[] args) throws Exception {
		System.out.println("Hi");
		myth t1 = new myth();
		t1.setName("First");
		t1.start();
		Thread.sleep(5000);
		System.out.println("bye");
		
	}
		

	}
