package core_java_topics.finalFinallyinalize;

//if we declare class as final it can't be inherited

public final class DummyExm {

	// final w.r.t variable is treated as a constant
	final long cc_number = 1267617638l;
	
	// if we declare method as final it can't be overridden
	
	final void displayCCNum () {
		System.out.println("CC Number is : " + cc_number);
	}
	
	// can not change the variable once declare as final
	//void changeCC() {
	//	cc_number = 465768868l;
	//}
	
	
	public static void main(String[] args) {
		try {
			System.out.println("This is try block...");
		} finally {
			System.out.println("This will always get executed...");
			DummyExm exm = new DummyExm();
			exm.displayCCNum();		
		}

	}

}
