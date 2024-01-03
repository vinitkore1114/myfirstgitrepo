package core_java_topics.keywords.thisKeyword.currentClassInstanceVariable;

public class BOFACustomizedCashRewardsCardDetails {

	public static void main(String[] args) {
		
		BOFACustomizedCashRewardsCard card1 = new BOFACustomizedCashRewardsCard(765498765672354l, "Ajay Singh", "12-09-2035", 545, 9087, 50000.0d, 25000.0d);
		BOFACustomizedCashRewardsCard card2 = new BOFACustomizedCashRewardsCard(345678976489768l, "Kartiki", "12-09-2037", 908, 4536, 75000.0d, 35000.0d);
		BOFACustomizedCashRewardsCard card3 = new BOFACustomizedCashRewardsCard(345789657890657l, "Reshma ", "12-09-2038", 523, 5612, 100000.0d, 75000.0d);
		BOFACustomizedCashRewardsCard card4 = new BOFACustomizedCashRewardsCard(890786564678923l, "Prashant", "12-09-2033", 675, 4598, 75000.0d, 33000.0d);

		card1.displayCCDetails();
		card2.displayCCDetails();
		card3.displayCCDetails();
		card4.displayCCDetails();
	}

}
