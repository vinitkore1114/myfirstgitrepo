package core_java_topics.exceptionHandling.customException.atmProject;

public class ICICIDebitCard implements IATMService{
	// This card is belongs to Vinit
	private double balance;{
	this.balance = 15000; 
	}
	@Override
	public void depositAmount(double dptAmt) throws InvalidAmountException {
		if(dptAmt <= 0) {
			throw new InvalidAmountException("Invalid Amount : Please deposite valid amount - multiple of 100s");
			
		}else {
			balance = balance + dptAmt;
		}
		
	}

	@Override
	public double withdrawAmount(double wthAmt) throws InvalidAmountException, InsufficientAmountException {
		if(wthAmt<=0){
			throw new InvalidAmountException("Invalid amount : you can't withdraw zerp amount - Multiple of 100s");
		}else if(balance<wthAmt) {
			throw new InsufficientAmountException("Insufficient Amount : Please check your available balance");
		}
		balance = balance - wthAmt;
		return balance;
	}

	@Override
	public double checkBalance() {
		
		return balance;
	}

}
