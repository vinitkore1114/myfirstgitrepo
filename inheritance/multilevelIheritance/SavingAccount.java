package core_java_topics.inheritance.multilevelIheritance;

public class SavingAccount extends BankAccount{

	private double interestRate;

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void displaySAccInfo() {
		super.displayBankInfo();
		System.out.println("Interest Rate : " + interestRate);
	}
}
