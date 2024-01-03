package core_java_topics.variables.staticVariable;

public class CheckingAccountDetails {

	public static void main(String[] args) {
		// create the object of CheckingAccount
		// syntax to create the object
		// calss_name object_name = new class_name();
		
		CheckingAccount account1 = new CheckingAccount();
		CheckingAccount account2 = new CheckingAccount();
		CheckingAccount account3 = new CheckingAccount();
		
		account1.setBranch_name("Bangalore Branch");
		account1.setCa_acc_num(234567897l);
		account1.setCa_holder_name("Sanjeevi");
		account1.setCa_available_balance(86000.0d);
		
		account2.setBranch_name("Chennai Branch");
		account2.setCa_acc_num(789650985l);
		account2.setCa_holder_name("Praveen");
		account2.setCa_available_balance(90000.0d);
		
		account3.setBranch_name("Mumbai Branch");
		account3.setCa_acc_num(563489765l);
		account3.setCa_holder_name("Kartiki");
		account3.setCa_available_balance(100000.0d);
		
		System.out.println("================ Account 1 Details ================");
		System.out.println("Acc Number : " + account1.getCa_acc_num());
		System.out.println("Customer Name : " + account1.getCa_holder_name());
		System.out.println("Branch Name : " + account1.getBranch_name());
		System.out.println("Account Balance : " + account1.getCa_available_balance());
		System.out.println("Bank Name : " + CheckingAccount.BANK_NAME);
		
		System.out.println("================ Account 2 Details ================");
		System.out.println("Acc Number : " + account2.getCa_acc_num());
		System.out.println("Customer Name : " + account2.getCa_holder_name());
		System.out.println("Branch Name : " + account2.getBranch_name());
		System.out.println("Account Balance : " + account2.getCa_available_balance());
		System.out.println("Bank Name : " + CheckingAccount.BANK_NAME);
		
		System.out.println("================ Account 3 Details ================");
		System.out.println("Acc Number : " + account3.getCa_acc_num());
		System.out.println("Customer Name : " + account3.getCa_holder_name());
		System.out.println("Branch Name : " + account3.getBranch_name());
		System.out.println("Account Balance : " + account3.getCa_available_balance());
		System.out.println("Bank Name : " + CheckingAccount.BANK_NAME);
	}
}