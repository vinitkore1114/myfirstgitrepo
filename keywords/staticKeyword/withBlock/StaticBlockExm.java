package core_java_topics.keywords.staticKeyword.withBlock;

public class StaticBlockExm {

	static {
		System.out.println("This is static block 2.................");
	}
	public static void main(String[] args) {
		System.out.println("Main Method.................");
	}
	static {
		System.out.println("This is static block........");
	}

}
