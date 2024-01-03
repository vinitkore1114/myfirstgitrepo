package core_java_topics.inheritance.aggregation;

public class ProfileDetails {

	
	public static void main(String[] args) {
		
		ContactDetails contactDetails1 = new ContactDetails("Mohammed Kamran","12-12-86/2b, Arab Mohalla, Haji Colony",
				"DTR7845RC", "kamranmohammed2005@gmail.com","08-10-1983",7207513883l, "Raichur", 584101l);
		SavingAccount savingAccount1 = new SavingAccount(5768976467l, "Raichur Branch", "Mohammed Kamran", 40000.0d, contactDetails1);
		
		ContactDetails contactDetails2 = new ContactDetails("Saba Naaz Siddiqui", "12-12-86/2b, Arab Mohalla, Haji Colony",
				"RSE3428RC", "Saba123@gmail.com","19-01-1990",8618224203l,"Raichur Branch", 584101);
		SavingAccount savingAccount2 = new SavingAccount(5687576676l, "Raichur Branch", "Saba Siddiqui", 80000.0d, contactDetails2);
		
		savingAccount1.displayProfileDetails();
		System.out.println();
		savingAccount2.displayProfileDetails();
	}

}
