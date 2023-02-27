//program on unchecked exception (not serious)
//ex (FileNotFound,InterruptedException,SQLException)
//for checked exception try-catch is mandatory
//throws is an alternate solution for try-catch
//ignoring exception
package classobjectDEMO;

public class test7 {

	public static void main(String[] args) throws Exception {
		System.out.println("program begins");
		//throw new ArithmeticException("Division by zero");
		throw new InterruptedException("Thread Interruption");
	

	}

}
