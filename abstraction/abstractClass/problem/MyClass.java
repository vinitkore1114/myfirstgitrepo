package core_java_topics.abstraction.abstractClass.problem;

public class MyClass {

	public void add(int a, int b) {
		int c = a+b;
		System.out.println("Addition of 2 numbers : " + c);
	}
	
	public void sub(int a, int b) {
		int c = a-b;
		System.out.println("Substraction of 2 numbers : " + c);
	}
	
	public void mul(int a, int b) {
		int c = a*b;
		System.out.println("Multiplication of 2 numbers : " + c);
	}
		
	public void div(int a, int b) {
		int c = a/b;
		System.out.println("Division of 2 numbers : " + c);
	}
	public static void main(String[] args) {
		
		MyClass obj1 = new MyClass();
		MyClass obj2 = new MyClass();
		MyClass obj3 = new MyClass();
		MyClass obj4 = new MyClass();
		
		obj1.add(20, 90);
		obj1.sub(80, 50);
		obj1.mul(40, 4);
		obj1.div(30, 5);
	}
}
