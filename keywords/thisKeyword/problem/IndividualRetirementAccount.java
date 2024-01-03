package core_java_topics.keywords.thisKeyword.problem;

public class IndividualRetirementAccount {

	long ira_acc_num;
	String ira_holder_name;
	String branch_name;
	String city;
	double roi;
	double account_balance;
	public IndividualRetirementAccount(long acc_num,String holder_name,String branch,String ira_city,double rateofinterest,
					double balance) {
		
		ira_acc_num = acc_num;
		ira_holder_name = holder_name;
		branch_name = branch;
		city = ira_city;
		roi = rateofinterest;
		account_balance = balance;
	}
	
	public void displayAccInfo() {
		System.out.println("Acc No : " + ira_acc_num + " Customer Name : " + ira_holder_name + " Branch Name : " + branch_name
				+ " City : " + city + " Rate Of Interest : " + roi + " Balance : " + account_balance);
	}
	public static void main(String[] args) {
		IndividualRetirementAccount account1 = new IndividualRetirementAccount(456389706l, "Vinit","Sangli Branch","Sangli city", 8.9d, 300000.0d);
		IndividualRetirementAccount account2 = new IndividualRetirementAccount(783453789l, "Praveen","Hyderabad Branch","Hyderabad city", 9.9d, 400000.0d);
		IndividualRetirementAccount account3 = new IndividualRetirementAccount(634567234l, "Prashant","Mumbai Branch","Mumbai city", 7.9d, 450000.0d);
		IndividualRetirementAccount account4 = new IndividualRetirementAccount(908786509l, "Uzair","Pune Branch","Pune city", 6.9d, 350000.0d);
		account1.displayAccInfo();
		account2.displayAccInfo();
		account3.displayAccInfo();
		account4.displayAccInfo();
	}
}
