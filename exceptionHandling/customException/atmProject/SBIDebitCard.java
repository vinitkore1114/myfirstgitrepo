package core_java_topics.exceptionHandling.customException.atmProject;

public class SBIDebitCard implements IATMService {
	//This card belongs to Rakshit
	private double balance;{
		this.balance = 22000.0d;
	}
	
	
	@Override
	public void depositAmount(double dptAmt) throws InvalidAmountException {
		if (dptAmt<=0) {
			throw new InvalidAmountException("Invalid Amount : you cant deposit invalid anmount(zero) into your account");
		}else {
			balance = balance + dptAmt;
		}	
	}

	@Override
	public double withdrawAmount(double wthAmt) throws InvalidAmountException, InsufficientAmountException {
		if(wthAmt<=0) {
			throw new InvalidAmountException("Invalid Amount : you cant withdraw invalid anmount(zero) from your account");
		}else if(balance<wthAmt) {
			throw new InsufficientAmountException ("Insufficient blalnce : please check your account balance");
		}
		return balance;
	}

	@Override
	public double checkBalance() {
		
		return balance;
	}

}
