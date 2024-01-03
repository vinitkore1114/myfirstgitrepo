package core_java_topics.innerClasses.staticInnerClass.basicExm;

public class OuterClass {
	
	static long number = 8600536126l;
	
	static class InnerClass{
		static void displayNum() {
			System.out.println("The number is : " + number);
		}
	}
	public static void main(String[] args) {
		// OuterClass.InnerClass obj = new OuterClass.InnerClass();
		// obj.displayNum();
		
		OuterClass.InnerClass.displayNum();

	}

}
