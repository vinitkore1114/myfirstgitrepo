package core_java_topics.exceptionHandling;

public class ExceptionExm2 {

	public static void main(String[] args) {
		System.out.println("Important code1...");
		System.out.println("Important code2...");
		
		try {
			int arr[] = {30,80,60,70};
			System.out.println("Element value : " + arr[5]);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		System.out.println("Important code3...");
		System.out.println("Important code4...");
	}

}
