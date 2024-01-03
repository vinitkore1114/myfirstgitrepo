package core_java_topics.exceptionHandling.customException.basicExm;

public class CheckingAgeToVote {

	public static void main(String[] args) {
		try {
			ageValidation(56);
		} catch (InvalidAgeException iae) {
			System.out.println("Handled invalid age exception...");
			System.out.println(iae);
		}

	}
	public static void ageValidation(int age) throws InvalidAgeException{
		if(age<18) {
			throw new InvalidAgeException("Age is not valid");
		} else {
			System.out.println("You are eligible to vote...");
		}
	}
}
