package core_java_topics.keywords.thisKeyword.currentClassConstructor;

public class BOFAPremiumRewardsCard {

	long prc_num;
	String prc_holder_name;
	String expiry_date;
	int cvv_num;
	double prc_limit;
	
	public BOFAPremiumRewardsCard() {
		System.out.println("======= Constructor Chaining ================");
	}
	
	public BOFAPremiumRewardsCard(long prc_num, String prc_holder_name, String expiry_date, int cvv_num,
			double prc_limit) {
		this();
		this.prc_num = prc_num;
		this.prc_holder_name = prc_holder_name;
		this.expiry_date = expiry_date;
		this.cvv_num = cvv_num;
		this.prc_limit = prc_limit;
		
	}
	public static void main(String[] args) {
		BOFAPremiumRewardsCard card1 = new BOFAPremiumRewardsCard(5463456754l, "Mohammed Kamran","12-09-2035", 645, 50000.0d);
		BOFAPremiumRewardsCard card2 = new BOFAPremiumRewardsCard(8966754478l, "Mohammed Zeeshan","12-09-2038", 908, 750000.0d);
		BOFAPremiumRewardsCard card3 = new BOFAPremiumRewardsCard(7845632456l, "Mohammed Irfan","12-09-2039", 897, 850000.0d);
		System.out.println(card1);
		System.out.println(card2);
		System.out.println(card3);
	}

	@Override
	public String toString() {
		return "BOFAPremiumRewardsCard [prc_num=" + prc_num + ", prc_holder_name=" + prc_holder_name + ", expiry_date="
				+ expiry_date + ", cvv_num=" + cvv_num + ", prc_limit=" + prc_limit + "]";
	}
}
