package core_java_topics.exceptionHandling;

public class ExceptionExm1 {

	public static void main(String[] args) {
		System.out.println("Important code1....");
		System.out.println("Important code2...");
		try {
			int number = 350/0;
			System.out.println("The value is : " + number);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Important code3....");
		System.out.println("Important code4...");
	}

}
