package core_java_topics.objectInJava.objectInitialization.usingReferenceVariable;

public class TaxSavingFDAccount {

	long tfd_acc_num;
	String tfd_cust_name;
	String ifsc_code;
	String branch_name;
	String city;
	String state;
	double tfd_amount;
	double roi;
	int tenor;
	
	public static void main(String[] args) {
		
		TaxSavingFDAccount account1 = new TaxSavingFDAccount();
		TaxSavingFDAccount account2 = new TaxSavingFDAccount();
		
		account1.tfd_acc_num = 345678965l;
		account1.tfd_cust_name = "Manoj";
		account1.ifsc_code = "TS7834HY";
		account1.branch_name = "Hyderabad Branch";
		account1.city = "Hyderabad City";
		account1.state = "Telangana";
		account1.tfd_amount = 500000.0d;
		account1.roi = 6.8d;
		account1.tenor = 5;
		
		account2.tfd_acc_num = 786589065l;
		account2.tfd_cust_name = "Praveen";
		account2.ifsc_code = "KA6345BG";
		account2.branch_name = "Bangalore Branch";
		account2.city = "Bangalore City";
		account2.state = "Karnataka";
		account2.tfd_amount = 400000.0d;
		account2.roi = 8.8d;
		account2.tenor = 3;
		
		System.out.println("===================== Account 1 Details ====================");
		System.out.println("Acc Number : " + account1.tfd_acc_num);
		System.out.println("Customer Name : " + account1.tfd_cust_name);
		System.out.println("Ifsc Code : " + account1.ifsc_code);
		System.out.println("Branch Name : " + account1.branch_name);
		System.out.println("State : " + account1.state);
		System.out.println("FD Amount : " + account1.tfd_amount);
		System.out.println("Rate Of Interest  : " + account1.roi);
		System.out.println("Tenor : " + account1.tenor);
		
		System.out.println("===================== Account 2 Details ====================");
		System.out.println("Acc Number : " + account2.tfd_acc_num);
		System.out.println("Customer Name : " + account2.tfd_cust_name);
		System.out.println("Ifsc Code : " + account2.ifsc_code);
		System.out.println("Branch Name : " + account2.branch_name);
		System.out.println("State : " + account2.state);
		System.out.println("FD Amount : " + account2.tfd_amount);
		System.out.println("Rate Of Interest  : " + account2.roi);
		System.out.println("Tenor : " + account2.tenor);
		
		
	}
}
