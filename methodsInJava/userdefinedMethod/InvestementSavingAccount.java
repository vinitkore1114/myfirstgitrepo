package core_java_topics.methodsInJava.userdefinedMethod;

public class InvestementSavingAccount {

	private long isa_acc_num;
	private String isa_customer_name;
	private String branch_name;
	private String ifsc_code;
	private double isa_acc_balance;
	private double investment_amount;
	private int tenor;
	private double rate_of_interest;
	
	public long getIsa_acc_num() {
		return isa_acc_num;
	}
	public void setIsa_acc_num(long isa_acc_num) {
		this.isa_acc_num = isa_acc_num;
	}
	public String getIsa_customer_name() {
		return isa_customer_name;
	}
	public void setIsa_customer_name(String isa_customer_name) {
		this.isa_customer_name = isa_customer_name;
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
	public double getIsa_acc_balance() {
		return isa_acc_balance;
	}
	public void setIsa_acc_balance(double isa_acc_balance) {
		this.isa_acc_balance = isa_acc_balance;
	}
	public double getInvestment_amount() {
		return investment_amount;
	}
	public void setInvestment_amount(double investment_amount) {
		this.investment_amount = investment_amount;
	}
	public int getTenor() {
		return tenor;
	}
	public void setTenor(int tenor) {
		this.tenor = tenor;
	}
	public double getRate_of_interest() {
		return rate_of_interest;
	}
	public void setRate_of_interest(double rate_of_interest) {
		this.rate_of_interest = rate_of_interest;
	}
	
	// user-defined method to change PIN number
	public void changePIN(int pinNumber) {
		if(pinNumber == 1234) {
			System.out.println("You have set a new PIN number, which is : 9087");
		}else {
			System.out.println("You entered wrong pin number : " + pinNumber);
		}
	}
	// user-defined method to generate last 10 transaction
	public void generateLastTenTransactions(long isa_acc_num) {
		System.out.println("6000 credited on 01-09-2023");
		System.out.println("10000 debited on 01-09-2023");
		System.out.println("600 credited on 03-09-2023");
		System.out.println("60000 credited on 05-09-2023");
		System.out.println("530 debited on 07-09-2023");
	}
}
