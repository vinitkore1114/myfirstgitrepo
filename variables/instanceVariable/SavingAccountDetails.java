package core_java_topics.variables.instanceVariable;

public class SavingAccountDetails {

	public static void main(String[] args) {
		// create object of class SavingAccount
		// syntax to create the object
		// class_name object_name = new class_name();
		
		SavingAccount account1 = new SavingAccount();
		SavingAccount account2 = new SavingAccount();
		SavingAccount account3 = new SavingAccount();
		
		// setting the object values using setter method
		account1.setAcc_balance(75600.0d);
		account1.setAcc_holder_name("Manjunath");
		account1.setAcc_number(234567894l);
		account1.setCity("Raichur City");
		account1.setIfsc_code("KA6875RC");
				
		account2.setAcc_balance(87000.0d);
		account2.setAcc_holder_name("Kartiki");
		account2.setAcc_number(983415679l);
		account2.setCity("Pune City");
		account2.setIfsc_code("MH7234PN");
		
		account3.setAcc_balance(65000.0d);
		account3.setAcc_holder_name("Shushant");
		account3.setAcc_number(759845321l);
		account3.setCity("Delhi City");
		account3.setIfsc_code("DL5128DL");
		
		//using getter method to get the values
		System.out.println("=============== Account 1 Details ========================");
		System.out.println("Acc Number : " + account1.getAcc_number());
		System.out.println("Customer Name : " + account1.getAcc_holder_name());
		System.out.println("Branch Name : " + account1.getCity());
		System.out.println("Ifsc Code : " + account1.getIfsc_code());
		System.out.println("Acc Balance : " + account1.getAcc_balance());
		
		System.out.println("=============== Account 2 Details ========================");
		System.out.println("Acc Number : " + account2.getAcc_number());
		System.out.println("Customer Name : " + account2.getAcc_holder_name());
		System.out.println("Branch Name : " + account2.getCity());
		System.out.println("Ifsc Code : " + account2.getIfsc_code());
		System.out.println("Acc Balance : " + account2.getAcc_balance());
		
		System.out.println("=============== Account 3 Details ========================");
		System.out.println("Acc Number : " + account3.getAcc_number());
		System.out.println("Customer Name : " + account3.getAcc_holder_name());
		System.out.println("Branch Name : " + account3.getCity());
		System.out.println("Ifsc Code : " + account3.getIfsc_code());
		System.out.println("Acc Balance : " + account3.getAcc_balance());
	}

}