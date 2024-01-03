package core_java_topics.exceptionHandling.customException.basicExm;

public class InvalidAgeException extends Exception{
	
	public InvalidAgeException(String errorMsg) {
		super(errorMsg);
	}

}
