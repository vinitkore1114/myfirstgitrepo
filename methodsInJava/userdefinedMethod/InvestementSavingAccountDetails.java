package core_java_topics.methodsInJava.userdefinedMethod;

public class InvestementSavingAccountDetails {

	public static void main(String[] args) {

		InvestementSavingAccount account1 = new InvestementSavingAccount();
		InvestementSavingAccount account2 = new InvestementSavingAccount();
		
		
		account1.setBranch_name("Bangalore Branch");
		account1.setIfsc_code("KA5345BG");
		account1.setInvestment_amount(1000000.0d);
		account1.setIsa_acc_balance(60000.0d);
		account1.setIsa_acc_num(675348976l);
		account1.setIsa_customer_name("Praveen");
		account1.setRate_of_interest(8.75d);
		account1.setTenor(5);
		
		account2.setBranch_name("Hyderabad Branch");
		account2.setIfsc_code("TS7098HY");
		account2.setInvestment_amount(800000.0d);
		account2.setIsa_acc_balance(160000.0d);
		account2.setIsa_acc_num(349087654l);
		account2.setIsa_customer_name("Chaitanya");
		account2.setRate_of_interest(7.75d);
		account2.setTenor(10);
		
		
		System.out.println("================= Account 1 Details ========================");
		System.out.println("Acc Num : " + account1.getIsa_acc_num());
		System.out.println("Customer Name : " + account1.getIsa_customer_name());
		System.out.println("Branch Name : " + account1.getBranch_name());
		System.out.println("Ifsc Code : " + account1.getIfsc_code());
		System.out.println("Investment Amount : " + account1.getInvestment_amount());
		System.out.println("Rate Of Interest : " + account1.getRate_of_interest());
		System.out.println("Tenor : " + account1.getTenor());
		System.out.println("Available Balance : " + account1.getIsa_acc_balance());
		System.out.println("======= statement generation ================");
		account1.generateLastTenTransactions(675348976l);
		System.out.println();
		System.out.println("================= Account 2 Details ========================");
		System.out.println("Acc Num : " + account2.getIsa_acc_num());
		System.out.println("Customer Name : " + account2.getIsa_customer_name());
		System.out.println("Branch Name : " + account2.getBranch_name());
		System.out.println("Ifsc Code : " + account2.getIfsc_code());
		System.out.println("Investment Amount : " + account2.getInvestment_amount());
		System.out.println("Rate Of Interest : " + account2.getRate_of_interest());
		System.out.println("Tenor : " + account2.getTenor());
		System.out.println("Available Balance : " + account2.getIsa_acc_balance());
		System.out.println("============ Change PIN Number =====================");
		account2.changePIN(1234);
	}

}
