//creating a single thread using runnable interface
//note Runnable creates a task,van be assigned to a thread
class Task implements Runnable {
	public void run() {
		System.out.println(Thread.currentThread() + "running");
		System.out.println("welcome");
	}
}
class Task2 implements Runnable{
	public void run() {
		System.out.println(Thread.currentThread() + "running");
		System.out.println("presidency");

	}
}
public class test8 {
	public static void main(String[] args) throws Exception {
		System.out.println("Hi");
		Task task1 = new Task();
		Thread t1 = new Thread(task1);
		Task2 task2 = new Task2();
		Thread t2= new Thread(task2);
		t1.setName("first child");
		t1.start();
		t2.start();
		t2.setName("second child");
		Thread.sleep(5000);
		System.out.println("bye");

	}

}
