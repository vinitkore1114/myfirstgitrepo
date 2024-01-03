package core_java_topics.constructorInJava.defaultConstructor;

public class FeatureCDAccount {

	//no-arg/default constructor
	//constructor name must be same as the class name
	//constructor should not have any return type, not even void
	//constructor can not be declared as abstract, static or synchronized.
	
	public FeatureCDAccount() {
		System.out.println("Kamran");
	}
	public void displayInfo() {
		System.out.println("This is a method..............");
	}
	
	public static void main(String[] args) {
		FeatureCDAccount account = new FeatureCDAccount();
		account.displayInfo();
		//account.FeatureCDAccount();
	}
}
