package core_java_topics.exceptionHandling.finallyBlock;

public class FinallyExm1 {

	public static void main(String[] args) {
		try {
			int number = 50 /0;
			System.out.println("The number is : " + number);
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
		} finally {
			System.out.println("Finally block will always execute...");

		}

	}

}
