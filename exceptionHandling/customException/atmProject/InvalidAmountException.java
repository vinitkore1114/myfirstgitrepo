package core_java_topics.exceptionHandling.customException.atmProject;

public class InvalidAmountException extends Exception{
	
	public InvalidAmountException(String errorMessage) {
		super(errorMessage);
	}
}
