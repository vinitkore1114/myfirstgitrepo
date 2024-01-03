package core_java_topics.inheritance.multilevelIheritance;

public class AccountDetailsInfo {

	private SavingAccount savingAccount;
	private CheckingAccount checkingAccount;
	
	public static void main(String[] args) {
		
		AccountDetailsInfo details = new AccountDetailsInfo();
		details.createAsset();
		details.displayAsset();

	}
	private void createAsset() {
		savingAccount = new SavingAccount();
		savingAccount.setAsset_id(56463);
		savingAccount.setAsset_type("Account Type");
		savingAccount.setAcc_num(234512345l);
		savingAccount.setBank_name("Bank Of America");
		savingAccount.setBalance(50000.0d);
		savingAccount.setInterestRate(9.9d);
		
		checkingAccount = new CheckingAccount();
		checkingAccount.setAsset_id(78564);
		checkingAccount.setAsset_type("Account Type");
		checkingAccount.setAcc_num(684564789l);
		checkingAccount.setBank_name("Bank Of America");
		checkingAccount.setBalance(60000.0d);
		checkingAccount.setOverDraftLimit(30000.0d);
	}
	private void displayAsset() {
		savingAccount.displaySAccInfo();
		checkingAccount.displayCAccInfo();
	}
}
