package core_java_topics.variables.localVariable;

public class CheckingAccount {

	//declare instance variable
	//syntax to declare a variable
	//access_specifer data_type variable_name
	private long ca_acc_num;
	private String ca_cust_name;
	private String city;
	private String branch_name;
	private String ifsc_code;
	private double ca_acc_balance;
	
	public long getCa_acc_num() {
		return ca_acc_num;
	}
	public void setCa_acc_num(long ca_acc_num) {
		this.ca_acc_num = ca_acc_num;
	}
	public String getCa_cust_name() {
		return ca_cust_name;
	}
	public void setCa_cust_name(String ca_cust_name) {
		this.ca_cust_name = ca_cust_name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getBranch_name() {
		return branch_name;
	}
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
	public String getIfsc_code() {
		return ifsc_code;
	}
	public void setIfsc_code(String ifsc_code) {
		this.ifsc_code = ifsc_code;
	}
	public double getCa_acc_balance() {
		return ca_acc_balance;
	}
	public void setCa_acc_balance(double ca_acc_balance) {
		this.ca_acc_balance = ca_acc_balance;
	}
	// declaring deposit functionality/method
	
	public void depositAmount(double dptAmt) {
		double afterDeposit = ca_acc_balance + dptAmt;
		System.out.println("After depositing the " + dptAmt+ " Your updated Balance is : " + afterDeposit);
	}
	public void withdrawAmount(double witAmt) {
		double afterWithdraw = ca_acc_balance - witAmt;
		System.out.println("After Withdraw " + witAmt + " you current balance is  : " + afterWithdraw);
	}
}