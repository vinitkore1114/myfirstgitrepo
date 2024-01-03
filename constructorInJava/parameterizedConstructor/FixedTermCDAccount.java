package core_java_topics.constructorInJava.parameterizedConstructor;

public class FixedTermCDAccount {

	private long fta_acc_number;
	private String fta_customer_name;
	private String branch_name;
	private long ssn_num;
	private String mailing_address;
	private String landmark;
	private String address_line1;
	private String address_line2;
	private String city;
	private String state;
	private int fta_tenor;
	private double roi;
	private double fta_amount;
	
	public FixedTermCDAccount() {}
	
	public FixedTermCDAccount(long fta_acc_number, String fta_customer_name, String branch_name, long ssn_num,
			String mailing_address, String landmark, String address_line1, String address_line2, String city,
			String state, int fta_tenor, double roi, double fta_amount) {
		super();
		this.fta_acc_number = fta_acc_number;
		this.fta_customer_name = fta_customer_name;
		this.branch_name = branch_name;
		this.ssn_num = ssn_num;
		this.mailing_address = mailing_address;
		this.landmark = landmark;
		this.address_line1 = address_line1;
		this.address_line2 = address_line2;
		this.city = city;
		this.state = state;
		this.fta_tenor = fta_tenor;
		this.roi = roi;
		this.fta_amount = fta_amount;
	}
	
	public void displayFTAInfo() {
		System.out.println("===================== Account Details =====================");
		System.out.println("Account Number : " + fta_acc_number);
		System.out.println("Cutomer Name : " + fta_customer_name);
		System.out.println("Branch Name : " + branch_name);
		System.out.println("SSN Number : " + ssn_num);
		System.out.println("Mailing Address : " + mailing_address);
		System.out.println("Land Mark : " + landmark);
		System.out.println("Address Line1 : " + address_line1);
		System.out.println("Addres Line 2 : " + address_line2);
		System.out.println("City : " + city);
		System.out.println("State : " + state);
		System.out.println("Tenor : " + fta_tenor);
		System.out.println("Rate Of Interest : " + roi);
		System.out.println("Fixed Term Amount : " + fta_amount);
	}
	
	public void getCreditCardDetails() {
		System.out.println("Credit Card Number : 56789087654");
		System.out.println("Credit Card Holder : Mohammed Kamran");
		System.out.println("Expiry Date : 20-09-2035");
		System.out.println("Credit Card Limit : 50000.0");
		System.out.println("Cvv Number : 623");
	}
}




