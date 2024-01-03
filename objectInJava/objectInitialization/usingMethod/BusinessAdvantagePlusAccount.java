package core_java_topics.objectInJava.objectInitialization.usingMethod;

public class BusinessAdvantagePlusAccount {

	long bapa_account_number;
	String bapa_account_holder_name;
	String branch_name;
	String city;
	String lane_1;
	String lane_2;
	String country;
	double bapa_account_balance;
	
	public void insertAccDetails(long bapa_account_number,String bapa_account_holder_name,String branch_name,String city,
					String lane_1,String lane_2,String country,double bapa_account_balance) {
		this.bapa_account_number = bapa_account_number;
		this.bapa_account_holder_name = bapa_account_holder_name;
		this.branch_name = branch_name;
		this.city = city;
		this.lane_1 = lane_1;
		this.lane_2 = lane_2;
		this.country = country;
		this.bapa_account_balance = bapa_account_balance;
	}
	public void displayAccDetailsInfo() {
		System.out.println("================= Account Details =====================");
		System.out.println("Acc Number : " + bapa_account_number);
		System.out.println("Acc Holder Name : " + bapa_account_holder_name);
		System.out.println("Branch Name : " + branch_name);
		System.out.println("City : " + city);
		System.out.println("Lane 1 : " + lane_1);
		System.out.println("Lane 2 :  "+ lane_2);
		System.out.println("Country : " + country);
		System.out.println("Available Balance : " + bapa_account_balance);
	}
}
