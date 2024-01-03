package core_java_topics.variables.instanceVariable;

public class SavingAccount {

	// declare instance variable
	// syntax to declare a variable
	// access_specifier data_type variable_name;
	
	private long acc_number;
	private String acc_holder_name;
	private String city;
	private String ifsc_code;
	private double acc_balance;
	
	// setter methods to set the value for an object/variable
	// getter methods to get the value of an object/variable
	public long getAcc_number() {
		return acc_number;
	}
	public void setAcc_number(long acc_number) {
		this.acc_number = acc_number;
	}
	public String getAcc_holder_name() {
		return acc_holder_name;
	}
	public void setAcc_holder_name(String acc_holder_name) {
		this.acc_holder_name = acc_holder_name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getIfsc_code() {
		return ifsc_code;
	}
	public void setIfsc_code(String ifsc_code) {
		this.ifsc_code = ifsc_code;
	}
	public double getAcc_balance() {
		return acc_balance;
	}
	public void setAcc_balance(double acc_balance) {
		this.acc_balance = acc_balance;
	}
	
}
