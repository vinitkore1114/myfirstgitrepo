package core_java_topics.objectInJava.objectCreation.usingCloneMethod;

public class BusinessAdvantageRelationshipAccountDetails {

	public static void main(String[] args) {

		try {
			BusinessAdvantageRelationshipAccount account1 = new BusinessAdvantageRelationshipAccount();
			account1.setBara_acc_num(475478954l);
			account1.setBara_cust_name("Rakshit");
			account1.setBusiness_loan_amount(400000.0d);
			account1.setDisbursal_date("06-09-2023");
			account1.setEmi_amount(14000.0d);
			account1.setRate_of_interest(10.75d);
			account1.setTenor(3);
			
			System.out.println("==================== Before cloning the object ====================");
			System.out.println("Account Number : " + account1.getBara_acc_num());
			System.out.println("Customer Name : " + account1.getBara_cust_name());
			System.out.println("Loan Amount : " + account1.getBusiness_loan_amount());
			System.out.println("Rate Of Interest : " + account1.getRate_of_interest());
			System.out.println("Emi Amount : " + account1.getEmi_amount());
			System.out.println("Disbursal Date : " + account1.getDisbursal_date());
			System.out.println("Tenor: " + account1.getTenor());
			
			BusinessAdvantageRelationshipAccount account2 =(BusinessAdvantageRelationshipAccount) account1.clone();
			account2.setBara_acc_num(645389765);
			account2.setBara_cust_name("Uzair");
			account2.setBusiness_loan_amount(500000.0d);
			account2.setDisbursal_date("15-08-2023");
			account2.setEmi_amount(10000.0d);
			account2.setRate_of_interest(10.75d);
			account2.setTenor(5);
			
			System.out.println("==================== after cloning the object ====================");
			System.out.println("Account Number : " + account2.getBara_acc_num());
			System.out.println("Customer Name : " + account2.getBara_cust_name());
			System.out.println("Loan Amount : " + account2.getBusiness_loan_amount());
			System.out.println("Rate Of Interest : " + account2.getRate_of_interest());
			System.out.println("Emi Amount : " + account2.getEmi_amount());
			System.out.println("Disbursal Date : " + account2.getDisbursal_date());
			System.out.println("Tenor: " + account2.getTenor());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
