package core_java_topics.keywords.thisKeyword.currentClassInstanceVariable;

public class BOFACustomizedCashRewardsCard {

	long cc_number;
	String cc_holder_name;
	String expiry_date;
	int cvv_number;
	int pin_number;
	double cc_limit;
	double cc_available_balance;
	
	public BOFACustomizedCashRewardsCard(long cc_number, String cc_holder_name, String expiry_date, int cvv_number,
			int pin_number, double cc_limit, double cc_available_balance) {
		super();
		this.cc_number = cc_number;
		this.cc_holder_name = cc_holder_name;
		this.expiry_date = expiry_date;
		this.cvv_number = cvv_number;
		this.pin_number = pin_number;
		this.cc_limit = cc_limit;
		this.cc_available_balance = cc_available_balance;
	}
	
	public void displayCCDetails() {
		System.out.println("================== Credit Card Details ====================");
		System.out.println("Credit Card Number : " + cc_number);
		System.out.println("Credit Card Holder Name : " + cc_holder_name);
		System.out.println("Expiry Date : " + expiry_date);
		System.out.println("Cvv Number : " + cvv_number);
		System.out.println("Pin Number : " + pin_number);
		System.out.println("Credit Card Limit :  " + cc_limit);
		System.out.println("Credit Card Balance : " + cc_available_balance);
	}
}
