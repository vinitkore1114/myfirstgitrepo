package core_java_topics.keywords.thisKeyword.currentClassMethod;

public class BOFAUnlimitedCashRewardsCard {

	long crc_num;
	String crc_holder_name;
	String expiry_date;
	int cvv_num;
	double crc_limit;
	
	public BOFAUnlimitedCashRewardsCard(long crc_num, String crc_holder_name, String expiry_date, int cvv_num,
			double crc_limit) {
		super();
		this.crc_num = crc_num;
		this.crc_holder_name = crc_holder_name;
		this.expiry_date = expiry_date;
		this.cvv_num = cvv_num;
		this.crc_limit = crc_limit;
	}

	public void method() {
		this.displayCRCDetails();
		System.out.println("======== This is the dummy method");
	}
	public void displayCRCDetails() {
		System.out.println("================ Credit Card Details ===================");
		System.out.println("Cc Number : " + crc_num);
		System.out.println("Holder Name : " + crc_holder_name);
		System.out.println("Expiry Date : " + expiry_date);
		System.out.println("Cvv Number : " + cvv_num);
		System.out.println("Credit Card Limit : " + crc_limit);
	}

	public static void main(String[] args) {
		BOFAUnlimitedCashRewardsCard card1 = new BOFAUnlimitedCashRewardsCard(567453456l, "Rakshit", "12-09-2035",645, 50000.0d);
		BOFAUnlimitedCashRewardsCard card2 = new BOFAUnlimitedCashRewardsCard(345789678l, "Ajay", "12-09-2036",509, 60000.0d);
		BOFAUnlimitedCashRewardsCard card3 = new BOFAUnlimitedCashRewardsCard(906754456l, "Vijay", "12-09-2037",954, 70000.0d);
		BOFAUnlimitedCashRewardsCard card4 = new BOFAUnlimitedCashRewardsCard(235679564l, "Shushant", "12-09-2038",545, 80000.0d);
		
		card1.method();
		card2.method();
		card3.method();
		card4.method();
	}

}
