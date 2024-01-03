package core_java_topics.exceptionHandling;

public class ExceptionExm3 {

	public static void main(String[] args) {
		System.out.println("Important code1...");
		System.out.println("Important code2...");
		
		try {
			String name = null;
			System.out.println("Lenngth of name : " + name.length());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		System.out.println("Important code3...");
		System.out.println("Important code4...");

	}

}
