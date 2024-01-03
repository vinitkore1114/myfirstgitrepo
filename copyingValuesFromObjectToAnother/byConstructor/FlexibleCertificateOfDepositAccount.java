package core_java_topics.copyingValuesFromObjectToAnother.byConstructor;

public class FlexibleCertificateOfDepositAccount {

	long fcd_acc_num;
	String fcd_holder_name;
	double minimum_opening_deposit;
	double annual_percentage_yield;
	String branch;
	String city;
	int term;
	String fdic_insured;
	double fcd_amount;
	// this is a parameterized constructor to initialize the object
	public FlexibleCertificateOfDepositAccount(long fcd_acc_num, String fcd_holder_name, double minimum_opening_deposit,
			double annual_percentage_yield, String branch, String city, int term, String fdic_insured,
			double fcd_amount) {
		super();
		this.fcd_acc_num = fcd_acc_num;
		this.fcd_holder_name = fcd_holder_name;
		this.minimum_opening_deposit = minimum_opening_deposit;
		this.annual_percentage_yield = annual_percentage_yield;
		this.branch = branch;
		this.city = city;
		this.term = term;
		this.fdic_insured = fdic_insured;
		this.fcd_amount = fcd_amount;
	}
	
	public FlexibleCertificateOfDepositAccount(FlexibleCertificateOfDepositAccount account) {
		fcd_acc_num = account.fcd_acc_num;
		fcd_holder_name = account.fcd_holder_name;
		minimum_opening_deposit = account.minimum_opening_deposit;
		annual_percentage_yield = account.annual_percentage_yield;
		branch = account.branch;
		city = account.city;
		term = account.term;
		fdic_insured = account.fdic_insured;
		fcd_amount = account.fcd_amount;
	}
	
	public void displayFCDDetails() {
		System.out.println("Acc Num : " + fcd_acc_num + " Customer Name : " + fcd_holder_name + " Minimum Opening Deposit " + minimum_opening_deposit
				+ " Annual Percentage Yield : " + annual_percentage_yield + " Branch : " + branch + " City : " + city
				+ " Term : " + term + " Fdic Insured : " + fdic_insured + " Fcd Amount : " + fcd_amount);
	}
	public static void main(String[] args) {
		
		FlexibleCertificateOfDepositAccount account1 = new FlexibleCertificateOfDepositAccount(4537865434l, "Mohammed Kamran",
				1000.0d, 6.5d, "Raichur Branch", "Raichur City", 10, "Yes", 100000.0d);
		FlexibleCertificateOfDepositAccount account2 = new FlexibleCertificateOfDepositAccount(account1);
		account1.displayFCDDetails();
		account2.displayFCDDetails();
	}
}