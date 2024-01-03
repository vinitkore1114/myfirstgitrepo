package core_java_topics.polymorphism.staticPolymorphism.methtodOverloading.realtime;

public class BillPayment {

	long acc_number;
	String bank_name;
	long electicity_meter_number;
	String due_date;
	String locality_address;
	double elecricity_bill_amount;
	
	long dth_cust_id;
	String customer_name;
	double dth_monthly_payment;
	String dth_package;
	
	
	long gasNumber;
	double gas_amount;
	String service_provider;
	
	static void makePayment(long acc_number,String bank_name,long electicity_meter_number,String due_date,String locality_address,double elecricity_bill_amount) {
		System.out.println("==========================Electricity Payment=====================");
		System.out.println("Acc Number : " + acc_number );
		System.out.println("Bank name : " + bank_name);
		System.out.println("Meter number : " + electicity_meter_number );
		System.out.println("Due date : " + due_date );
		System.out.println("Locality Address : " + locality_address);
		System.out.println("Bill Amount : " + elecricity_bill_amount);
		
	}
	
	static void makePayment(long dth_cust_id,String customer_name,double dth_monthly_payment,String dth_package) {
		System.out.println("========================== DTH Payment==========================");
		System.out.println("Customer Id : " + dth_cust_id);
		System.out.println("Customer Name : " +customer_name );
		System.out.println("Monthly Payment :" + dth_monthly_payment );
		System.out.println("Dth Package : " + dth_package);
	}
	
	static void makePayment(long gasNumber,double gas_amount,String service_provider) {
		System.out.println("=============================== Gas Payment=========================");
		System.out.println("Gas Number : " + gasNumber);
		System.out.println("Amount : " + gas_amount);
		System.out.println("Service Provider : " + service_provider);
	}
	
	
	
	public static void main(String[] args) {
		BillPayment.makePayment(121342, "HDFC Bank", 5675688, "23-09-2023", "Gaon Bhag ", 40000.0d);
		BillPayment.makePayment(4566777, "Vinit Kore", 500.0d, "Family");
		BillPayment.makePayment(1331412l, 950.0d, "Bharat Gas");

	}

}
