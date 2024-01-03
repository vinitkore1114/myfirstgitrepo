package core_java_topics.keywords.staticKeyword.withMethod;

public class BOFAPremiumRewardsEliteCard {

	long cust_id;
	long card_number;
	String customer_name;
	String expiry_date;
	int cvv_number;
	double creditCard_limit;
	
	static String BANK_NAME = "HDFC Bank";

	public BOFAPremiumRewardsEliteCard(long cust_id, long card_number, String customer_name, String expiry_date,
			int cvv_number, double creditCard_limit) {
		super();
		this.cust_id = cust_id;
		this.card_number = card_number;
		this.customer_name = customer_name;
		this.expiry_date = expiry_date;
		this.cvv_number = cvv_number;
		this.creditCard_limit = creditCard_limit;
	}
	
	static void changeBankName() {
		BANK_NAME = "Bank Of America";
	}
	
	public void displayPremiumCardDetails() {
		
		System.out.println("=================== Premium Card Details =================");
		System.out.println("Cust Id : " + cust_id);
		System.out.println("Card Number : " + card_number);
		System.out.println("Customer Name : " + customer_name);
		System.out.println("Expiry Date : " + expiry_date);
		System.out.println("Cvv Number : " + cvv_number);
		System.out.println("Card Limit : " + creditCard_limit);
		System.out.println("Bank Name : " + BANK_NAME);
	}
	
	public static void main(String[] args) {
		
		BOFAPremiumRewardsEliteCard card1 = new BOFAPremiumRewardsEliteCard(67589709l, 5647890983452345l, "Praveen", "24-09-2036", 783, 100000.0d);
		BOFAPremiumRewardsEliteCard card2 = new BOFAPremiumRewardsEliteCard(56489076l, 7098564356789032l, "Anil", "29-09-2037", 908, 150000.0d);
		BOFAPremiumRewardsEliteCard card3 = new BOFAPremiumRewardsEliteCard(89765098l, 3456234560987567l, "Shushant", "30-09-2039", 453, 200000.0d);
		BOFAPremiumRewardsEliteCard card4 = new BOFAPremiumRewardsEliteCard(62309807l, 4563897690872345l, "Ajay", "07-09-2038", 453, 300000.0d);
		
		BOFAPremiumRewardsEliteCard.changeBankName();
		card1.displayPremiumCardDetails();
		card2.displayPremiumCardDetails();
		card3.displayPremiumCardDetails();
		card4.displayPremiumCardDetails();
	}
}
