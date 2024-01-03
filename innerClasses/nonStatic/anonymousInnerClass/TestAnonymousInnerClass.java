package core_java_topics.innerClasses.nonStatic.anonymousInnerClass;

public class TestAnonymousInnerClass {

	public static void main(String[] args) {
		ITransferService service = new ITransferService() {
			
			@Override
			public void thirdPartyPayment() {
				System.out.println("This is third party payment method");
				
			}
			
			@Override
			public void impsTransfer() {
				System.out.println("This is IMPS transfer");
				
			}
		};
		service.thirdPartyPayment();
		service.impsTransfer();
	}

}
