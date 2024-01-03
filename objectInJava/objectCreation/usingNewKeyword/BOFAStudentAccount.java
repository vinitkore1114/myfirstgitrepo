package core_java_topics.objectInJava.objectCreation.usingNewKeyword;

public class BOFAStudentAccount {
	
	// declare instance variable
	private long std_acc_num;
	private String std_name;
	private String branch_name;
	private String city;
	private double std_acc_balance;
	private double std_min_acc_balance;
	
	//setter method is used to set the value of an object
	// getter method is to get the value of an object
	public long getStd_acc_num() {
		return std_acc_num;
	}
	public void setStd_acc_num(long std_acc_num) {
		this.std_acc_num = std_acc_num;
	}
	public String getStd_name() {
		return std_name;
	}
	public void setStd_name(String std_name) {
		this.std_name = std_name;
	}
	public String getBranch_name() {
		return branch_name;
	}
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getStd_acc_balance() {
		return std_acc_balance;
	}
	public void setStd_acc_balance(double std_acc_balance) {
		this.std_acc_balance = std_acc_balance;
	}
	public double getStd_min_acc_balance() {
		return std_min_acc_balance;
	}
	public void setStd_min_acc_balance(double std_min_acc_balance) {
		this.std_min_acc_balance = std_min_acc_balance;
	}
	
}
