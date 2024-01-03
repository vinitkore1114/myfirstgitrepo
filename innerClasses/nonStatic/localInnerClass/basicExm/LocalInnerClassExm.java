package core_java_topics.innerClasses.nonStatic.localInnerClass.basicExm;

public class LocalInnerClassExm {

	private int number = 1234;
	private String name = "Mohammed Farhan";
	
	// declaring the method
	public void displayInfo() {
		//declaring local inner class
		class LocalInnerClass{
			
			public void display() {
				System.out.println("The number is : " + number );
				System.out.println("Name : " + name);
			}
			
		}
		LocalInnerClass inner = new LocalInnerClass();
		inner.display();
	}
	
	public static void main(String[] args) {
		LocalInnerClassExm outer = new LocalInnerClassExm();
		outer.displayInfo();

	}

}
