package core_java_topics.objectInJava.objectCreation.usingNewInstanceOfClassClass;

public class BusinessAdvantgePlusAccount {

	long bapa_acc_num = 546764546787l;
	String bapa_cust_name = "Mohammed Kamran";
	String bapa_branch_name = "Raichur Branch";
	String city = "Raichur City";
	String ifsc_code = "KA5234RC";
	double bapa_acc_balance = 50000.0d;
	
	public static void main(String[] args) {
		try {
				BusinessAdvantgePlusAccount account1 = BusinessAdvantgePlusAccount.class.newInstance();
				
				System.out.println("Account Number : " + account1.bapa_acc_num);
				System.out.println("Customer Name : " + account1.bapa_cust_name);
				System.out.println("Branch Name : " + account1.bapa_branch_name);
				System.out.println("City : " + account1.city);
				System.out.println("Ifsc Code : " + account1.ifsc_code);
				System.out.println("Available Balance : " + account1.bapa_acc_balance);
				System.out.println();
		
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
