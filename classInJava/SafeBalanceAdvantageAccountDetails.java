package core_java_topics.classInJava;

public class SafeBalanceAdvantageAccountDetails {

	public static void main(String[] args) {

		// create the object of SafeBalanceAdvantageAccount
		// syntax to create the object
		// class_name object_name = new class_name();
		SafeBalanceAdvantageAccount account1 = new SafeBalanceAdvantageAccount();
		SafeBalanceAdvantageAccount account2 = new SafeBalanceAdvantageAccount();
		SafeBalanceAdvantageAccount account3 = new SafeBalanceAdvantageAccount();
		
		//using setter method to set the values for object/variable
		account1.setSa_acc_num(234567876l);
		account1.setSa_acc_holder("Rakshit");
		account1.setSsn_num(546856745456l);
		account1.setCity("Raichur City");
		account1.setIfsc_code("KA4536RC");
		account1.setSa_acc_balance(50000.0d);
		
		account2.setCity("Pune City");
		account2.setIfsc_code("MH2341PU");
		account2.setSa_acc_balance(75000.0d);
		account2.setSa_acc_holder("Kartiki");
		account2.setSa_acc_num(453987650l);
		account2.setSsn_num(734987674856l);
		
		account3.setCity("Bangalore City");
		account3.setIfsc_code("KA7845BN");
		account3.setSa_acc_balance(80000.0d);
		account3.setSa_acc_holder("Bharat");
		account3.setSa_acc_num(574907652l);
		account3.setSsn_num(69876547632l);
		
		
		// using getter method to get the object/variable values
		System.out.println("================ Account 1 Details ========================");
		System.out.println("Acc Nunber : " + account1.getSa_acc_num());
		System.out.println("Holder Name : " + account1.getSa_acc_holder());
		System.out.println("City : " + account1.getCity());
		System.out.println("Ifsc Code : " + account1.getIfsc_code());
		System.out.println("SSN Number : " + account1.getSsn_num());
		System.out.println("Available Balance: " + account1.getSa_acc_balance());
		
		System.out.println("================ Account 2 Details ========================");
		System.out.println("Acc Nunber : " + account2.getSa_acc_num());
		System.out.println("Holder Name : " + account2.getSa_acc_holder());
		System.out.println("City : " + account2.getCity());
		System.out.println("Ifsc Code : " + account2.getIfsc_code());
		System.out.println("SSN Number : " + account2.getSsn_num());
		System.out.println("Available Balance: " + account2.getSa_acc_balance());
		
		System.out.println("================ Account 3 Details ========================");
		System.out.println("Acc Nunber : " + account3.getSa_acc_num());
		System.out.println("Holder Name : " + account3.getSa_acc_holder());
		System.out.println("City : " + account3.getCity());
		System.out.println("Ifsc Code : " + account3.getIfsc_code());
		System.out.println("SSN Number : " + account3.getSsn_num());
		System.out.println("Available Balance: " + account3.getSa_acc_balance());
		
	}
}