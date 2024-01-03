package core_java_topics.inheritance.singleLevelInheritance;

public class CreditCardApp {

	public static void main(String[] args) {
		AxisBankVistaraInfiniteCreditCard creditCard = new AxisBankVistaraInfiniteCreditCard();
		
		creditCard.setCc_num(4567456789787653l);
		creditCard.setCc_holder_name("Mohammed Kamran");
		creditCard.setCc_limit(500000.0d);
		creditCard.setCvv_num(675);
		creditCard.setPin_num(6345);
		creditCard.setExpiry_date("30-09-2035");
		creditCard.setClub_vistara_points("100 points");
		creditCard.setSpecial_service("No Service or Annual Charges");
		creditCard.setTop_features("You can use in lounge");
		
		System.out.println("================= Credit Card Details ===============");
		System.out.println("Credit Number : " + creditCard.getCc_num());
		System.out.println("Holder Name : " + creditCard.getCc_holder_name());
		System.out.println("Credit Card Limit : " + creditCard.getCc_limit());
		System.out.println("Cvv Number : " + creditCard.getCvv_num());
		System.out.println("Pin Number : " + creditCard.getPin_num());
		System.out.println("Expiry Date : " + creditCard.getExpiry_date());
		System.out.println("Club Vistara points : " + creditCard.getClub_vistara_points());
		System.out.println("Special Service : " + creditCard.getSpecial_service());
		System.out.println("Top Features : " + creditCard.getTop_features());
	}

}
