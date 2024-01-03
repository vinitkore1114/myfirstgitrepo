package core_java_topics.innerClasses.staticInnerClass.realtime;

public class OuterClass {
	private static int CUST_ID =6544;
	private static String DOMESTIC_CUSTOMER_BRANCH = "Raichur Branch";
	static long SECURITY_SOCIAL_NUMBER = 2425353l;
	static String VALUATION_DATE = "28-0902023";
	static String GURANTOR_BRANCH = "Gulburga Branch";
	
	static class WholesaleCollateralBasic{
		static void displayCollateral() {
			System.out.println("Cust Id : " + CUST_ID);
			System.out.println("Domestic Customer Branch : " + DOMESTIC_CUSTOMER_BRANCH);
			System.out.println("Security Social number : " + SECURITY_SOCIAL_NUMBER);
			System.out.println("Valuation Date : " + VALUATION_DATE);
			System.out.println("Gurantor Branch : " + GURANTOR_BRANCH);
		}
	}
	
	public static void main(String[] args) {
		// OuterClass.WholesaleCollateralBasic basic = new OuterClass.WholesaleCollateralBasic();
		// basic.displayCollateral();

		
		OuterClass.WholesaleCollateralBasic.displayCollateral();
	}

}
