package core_java_topics.exceptionHandling.nestedTryBlockExm;

public class NestedTryBlockExm {

	public static void main(String[] args) {
		System.out.println("Important code1...");
		//outer try block
		try {
			//inner try block
			try {
				System.out.println("Want to divide a number");
				int number = 40/0;
				System.out.println("Number : " + number);
			}catch(ArithmeticException ae) {
				ae.printStackTrace();
			}
			//another inner nested try block
			try {
				System.out.println("Get the element of specific index");
				int arr[]= {10,20,30,40,50};
				System.out.println("The element ata specific index : " + arr[9]);
			}catch(ArrayIndexOutOfBoundsException aie){
				aie.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Important code2...");
	}

}
