package core_java_topics.objectInJava.objectInitialization.usingMethod;

public class BusinessAdvantagePlusAccountDetails {

	public static void main(String[] args) {

		BusinessAdvantagePlusAccount account1 = new BusinessAdvantagePlusAccount();
		BusinessAdvantagePlusAccount account2 = new BusinessAdvantagePlusAccount();
		
		// using method to initialize the objects
		account1.insertAccDetails(123456789l, "Mohammed Kamran","Gandhi Chowk Branch","Raichur City", "Opp Court","Haji Colony","India",5000.0d);
		account2.insertAccDetails(897645324l, "Rakshit","Station Road Branch","Raichur City", "LBS Nagar","Police Colony","India",7000.0d);
		
		account1.displayAccDetailsInfo();
		account2.displayAccDetailsInfo();
	}

}
