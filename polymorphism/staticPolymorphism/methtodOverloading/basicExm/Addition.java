package core_java_topics.polymorphism.staticPolymorphism.methtodOverloading.basicExm;

public class Addition {

	
		//by changing the parameters or by changing the data type
		
		static int add(int a , int b) {
			return a+b;
		}
		
		static double add(int a, double b) {
			return a+b;
		}
		static double add(int a , int b ,int c) {
			return a+b+c;
		}
		
		static int add(int a, int b,int c, int d) {
			return a+b+c+d;
		}
		
		
		public static void main(String[] args) {
			System.out.println("Addition of 2 numbers" + Addition.add(10, 20) );
			System.out.println("Addition of 2 numbers" + Addition.add(40, 47.0d));
			System.out.println("Addition of 3 numbers" +Addition.add(10, 20, 30));
			System.out.println("Addition of 4 numbers" + Addition.add(10, 20, 30, 40) );

	}

}
