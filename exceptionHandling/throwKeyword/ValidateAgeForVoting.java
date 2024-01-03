package core_java_topics.exceptionHandling.throwKeyword;

public class ValidateAgeForVoting {

	public static void main(String[] args) {
		System.out.println("important code1...");
		try {
			validateAge(11);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}finally {
			System.out.println("Rest of the important code...");
		}

	}

	public static void validateAge(int age) {
		if (age < 18) {
			throw new ArithmeticException("your age is less than 18. So you can't vote...");
		}else {
			System.out.println("You are matured enough to vote...");
		}
	}

}
