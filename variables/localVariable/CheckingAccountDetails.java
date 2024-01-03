package core_java_topics.variables.localVariable;

public class CheckingAccountDetails {

	public static void main(String[] args) {
		// create the object of CheckingAccount
		// syntax to create the object
		// class_name object_name = new class_name();
		CheckingAccount account1 = new CheckingAccount();
		CheckingAccount account2 = new CheckingAccount();
		CheckingAccount account3 = new CheckingAccount();
		
		//setter method to set the object/variable
		account1.setCa_acc_num(876534789l);
		account1.setCa_cust_name("Shushant");
		account1.setBranch_name("Hyderabad Branch");
		account1.setCity("Hyderabad City");
		account1.setIfsc_code("TS5634HY");
		account1.setCa_acc_balance(45000.0d);
		
		account2.setCa_acc_num(345678685l);
		account2.setCa_cust_name("Kartiki");
		account2.setBranch_name("Pune Branch");
		account2.setCity("Pune City");
		account2.setIfsc_code("MH1298PU");
		account2.setCa_acc_balance(65000.0d);

		account3.setCa_acc_num(987634676l);
		account3.setCa_cust_name("Reshma");
		account3.setBranch_name("Bangalore Branch");
		account3.setCity("Bangalore City");
		account3.setIfsc_code("KA6945BG");
		account3.setCa_acc_balance(75000.0d);
		
		// using getter method to get the object/variable values
		System.out.println("================== Account 1 Customer Details ========================");
		System.out.println("Account Number : " + account1.getCa_acc_num());
		System.out.println("Customer Name : " + account1.getCa_cust_name());
		System.out.println("Branch Name : " + account1.getBranch_name());
		System.out.println("City : " + account1.getCity());
		System.out.println("Ifsc Code : " + account1.getIfsc_code());
		System.out.println("Account Balance : " + account1.getCa_acc_balance());
		//account1.depositAmount(5000.0d);
		
		System.out.println("================== Account 2 Customer Details ========================");
		System.out.println("Account Number : " + account2.getCa_acc_num());
		System.out.println("Customer Name : " + account2.getCa_cust_name());
		System.out.println("Branch Name : " + account2.getBranch_name());
		System.out.println("City : " + account2.getCity());
		System.out.println("Ifsc Code : " + account2.getIfsc_code());
		System.out.println("Account Balance : " + account2.getCa_acc_balance());
		//account2.withdrawAmount(2400.0d);
		
		System.out.println("================== Account 3 Customer Details ========================");
		System.out.println("Account Number : " + account3.getCa_acc_num());
		System.out.println("Customer Name : " + account3.getCa_cust_name());
		System.out.println("Branch Name : " + account3.getBranch_name());
		System.out.println("City : " + account3.getCity());
		System.out.println("Ifsc Code : " + account3.getIfsc_code());
		System.out.println("Account Balance : " + account3.getCa_acc_balance());
		account3.depositAmount(10000.0d);
	}

}