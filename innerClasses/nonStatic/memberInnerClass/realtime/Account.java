package core_java_topics.innerClasses.nonStatic.memberInnerClass.realtime;

public class Account {
	
	private String bank_name = "Bank of America";
	
	class SavingAccount{
		
		private long sa_acc_number = 243453567l;
		private String sa_acc_holder_name = "Sagar Kanitkar";
		private String address = "Gaon bhag,Sangli";
		
		void displaySaInfo() {
			System.out.println("=================================Saving Account Details===========================");
			System.out.println("Account Number : " + sa_acc_number);
			System.out.println("Customer Name : " + sa_acc_holder_name);
			System.out.println("Address : " + address);
			System.out.println("Bank Name : " + bank_name);
		}
		
	}
	
	class CheckingAccount{
		private long sa_acc_number = 3523525l;
		private String sa_acc_holder_name = "Pinak Kale";
		private String address = "Vishnughat,Sangli";
		
		void displayCAInfo() {
			System.out.println("=================================Checking Account Details===========================");
			System.out.println("Account Number : " + sa_acc_number);
			System.out.println("Customer Name : " + sa_acc_holder_name);
			System.out.println("Address : " + address);
			System.out.println("Bank Name : " + bank_name);
		}
		
	}
	
	public void accountInfo() {
		System.out.println("==================================== This is outer class Account ======================");
		System.out.println("Bank Name : " + bank_name);
	}

	public static void main(String[] args) {
		
		Account account = new Account();
		Account.SavingAccount savingAccount = account.new SavingAccount();
		Account.CheckingAccount checkingAccount = account.new CheckingAccount();
		
		savingAccount.displaySaInfo();
		checkingAccount.displayCAInfo();
		account.accountInfo();

	}

}
