package core_java_topics.abstraction.abstractClass.interfaceExm1;

public class HomeLoanInterestRates {

	public static void main(String[] args) {
		
		Banks allahbadBank = new AllahbadBank();
		Banks andhraBank = new AndhraBank();
		Banks bankOfIndia = new BankOfIndia();
		
		System.out.println("Home Loan Rate Of Interest of AllahBad Bank : " + allahbadBank.getRateOfInterest());
		System.out.println("Home Loan Rate Of Interest of Andhra Bank : "   + andhraBank.getRateOfInterest());
		System.out.println("Home Loan Rate Of Interest of Bank Of India : " + bankOfIndia.getRateOfInterest());

	}

}
