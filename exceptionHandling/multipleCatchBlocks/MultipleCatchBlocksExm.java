package core_java_topics.exceptionHandling.multipleCatchBlocks;

public class MultipleCatchBlocksExm {

	public static void main(String[] args) {
		try {
			System.out.println("Important code1...");
			String name = null;
			int arr[] = new int[5];
			arr[8] = 20/1;
			System.out.println("The number is : " + arr[2]);
			System.out.println("Length of the name : " + name.length());
		}catch(ArithmeticException ae) {
			ae.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException aie) {
			aie.printStackTrace();
		}catch(NullPointerException npe) {
			npe.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
			}
		System.out.println("Important code2...");

	}

}
