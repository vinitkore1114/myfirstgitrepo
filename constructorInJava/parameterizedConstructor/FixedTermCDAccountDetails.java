package core_java_topics.constructorInJava.parameterizedConstructor;

public class FixedTermCDAccountDetails {

	public static void main(String[] args) {
		
		FixedTermCDAccount account1 = new FixedTermCDAccount(897654890l, "Md Zeeshan","Hyderabad Branch",674876453l, 
				"Flat No : 1-256-Shama Theater","Shama Theater", "Nawab Sab Kunta", "Jahannuma", "Hyderabad City", 
				"Telangana", 5, 7.5d, 500000.0d);
		FixedTermCDAccount account2 = new FixedTermCDAccount(674590876l, "Md Kamran", "Raichur Branch", 745390875l, 
				"12-12-86/2b", "Opp court complex","Haji Colony", "Arab Mohalla", "Raichur City", "Karnataka", 10, 5.8d, 200000.0d);
		
		// displaying account details by calling user-defined method
		account1.displayFTAInfo();
		account2.displayFTAInfo();
		System.out.println("=========== Credit Card Details ===============");
		account2.getCreditCardDetails();
		
	}

}
