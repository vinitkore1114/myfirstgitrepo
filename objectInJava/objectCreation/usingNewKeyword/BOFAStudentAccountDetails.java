package core_java_topics.objectInJava.objectCreation.usingNewKeyword;

public class BOFAStudentAccountDetails {

	public static void main(String[] args) {
		// syntax to create object using new keyword
		// class_name object_name = new class_name();
		
		BOFAStudentAccount account1 = new BOFAStudentAccount();
		BOFAStudentAccount account2 = new BOFAStudentAccount();
		BOFAStudentAccount account3 = new BOFAStudentAccount();
		
		//using setter method to set the value of object/variable
		account1.setBranch_name("Raichur Branch");
		account1.setCity("Raichur City");
		account1.setStd_acc_balance(6000.0d);
		account1.setStd_acc_num(863457895l);
		account1.setStd_min_acc_balance(2000.0d);
		account1.setStd_name("Rakshit");
		
		account2.setBranch_name("Delhi Branch");
		account2.setCity("Delhi City");
		account2.setStd_acc_balance(8000.0d);
		account2.setStd_acc_num(675490876l);
		account2.setStd_min_acc_balance(5000.0d);
		account2.setStd_name("Shubham");
		
		account3.setBranch_name("Bangalore Branch");
		account3.setCity("Bangalore City");
		account3.setStd_acc_balance(7500.0d);
		account3.setStd_acc_num(563489764l);
		account3.setStd_min_acc_balance(1000.0d);
		account3.setStd_name("Uzair");
		
		System.out.println("============== Account 1 Details ==================");
		System.out.println("Acc Number : " + account1.getStd_acc_num());
		System.out.println("Student Name : " + account1.getStd_name());
		System.out.println("Branch Name : " + account1.getBranch_name());
		System.out.println("City  : " + account1.getCity());
		System.out.println("Minimum Balance :  "+ account1.getStd_min_acc_balance());
		System.out.println("Available Balance : " + account1.getStd_acc_balance());
		
		System.out.println("============== Account 2 Details ==================");
		System.out.println("Acc Number : " + account2.getStd_acc_num());
		System.out.println("Student Name : " + account2.getStd_name());
		System.out.println("Branch Name : " + account2.getBranch_name());
		System.out.println("City  : " + account2.getCity());
		System.out.println("Minimum Balance :  "+ account2.getStd_min_acc_balance());
		System.out.println("Available Balance : " + account2.getStd_acc_balance());
		
		System.out.println("============== Account 3 Details ==================");
		System.out.println("Acc Number : " + account3.getStd_acc_num());
		System.out.println("Student Name : " + account3.getStd_name());
		System.out.println("Branch Name : " + account3.getBranch_name());
		System.out.println("City  : " + account3.getCity());
		System.out.println("Minimum Balance :  "+ account3.getStd_min_acc_balance());
		System.out.println("Available Balance : " + account3.getStd_acc_balance());

	}

}
