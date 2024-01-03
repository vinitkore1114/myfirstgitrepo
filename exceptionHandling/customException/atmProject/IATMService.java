package core_java_topics.exceptionHandling.customException.atmProject;

public interface IATMService {
	
	public void depositAmount(double dptAmt)
			throws InvalidAmountException;
	public double withdrawAmount(double wthAmt)
			throws InvalidAmountException,InsufficientAmountException;
	public double checkBalance();
}
