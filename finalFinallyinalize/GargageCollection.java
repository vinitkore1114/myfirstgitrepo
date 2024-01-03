package core_java_topics.finalFinallyinalize;

public class GargageCollection {
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
				GargageCollection gc = new GargageCollection();
				
				//peinting the hashcode of the object
				
				System.out.println("Hashcode of object : " + gc.hashCode());
				
				//Making the object null
				gc = null;
				
				//Calling the garbage collection to remove un-used object from the jvm(gc object)
				System.gc();
				System.out.println("End of the garbage collection...");
				
				gc.displayCCNum();		
			}

		}
	protected void finalize() {
		System.out.println("called the finalize method...");
	}
}
