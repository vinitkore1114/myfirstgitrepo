package core_java_topics.variables.staticVariable;

public class CheckingAccount {

	private long ca_acc_num;
	private String ca_holder_name;
	private String branch_name;
	private double ca_available_balance;
	
	// declare static variable
	public static String BANK_NAME = "HDFC Bank";

	public long getCa_acc_num() {
		return ca_acc_num;
	}
	public void setCa_acc_num(long ca_acc_num) {
		this.ca_acc_num = ca_acc_num;
	}
	public String getCa_holder_name() {
		return ca_holder_name;
	}
	public void setCa_holder_name(String ca_holder_name) {
		this.ca_holder_name = ca_holder_name;
	}
	public String getBranch_name() {
		return branch_name;
	}
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
	public double getCa_available_balance() {
		return ca_available_balance;
	}
	public void setCa_available_balance(double ca_available_balance) {
		this.ca_available_balance = ca_available_balance;
	}
}
