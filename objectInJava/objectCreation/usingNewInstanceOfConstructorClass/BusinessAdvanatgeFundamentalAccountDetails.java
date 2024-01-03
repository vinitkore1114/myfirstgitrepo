package core_java_topics.objectInJava.objectCreation.usingNewInstanceOfConstructorClass;

import java.lang.reflect.Constructor;

public class BusinessAdvanatgeFundamentalAccountDetails {

	public static void main(String[] args) {
		try {
				
				Constructor<BusinessAdvanatgeFundamentalAccount> object = BusinessAdvanatgeFundamentalAccount.class.getConstructor();
				
				BusinessAdvanatgeFundamentalAccount account1 = object.newInstance();
				BusinessAdvanatgeFundamentalAccount account2 = object.newInstance();
				
				account1.setBfa_acc_bal(50000.0d);
				account1.setBfa_acc_num(675489765l);
				account1.setBfa_customer_name("Manoj Kumar");
				account1.setBranch_name("Bihar Branch");
				account1.setCity("Patna City");
				account1.setSsn_number(8764345987658l);
				
				account2.setBfa_acc_bal(70000.0d);
				account2.setBfa_acc_num(908765674l);
				account2.setBfa_customer_name("Prashant");
				account2.setBranch_name("Mumbai Branch");
				account2.setCity("Mumbai City");
				account2.setSsn_number(7659874635485l);
				
				System.out.println("======================== Account 1 Details ===================");
				System.out.println("Account Number : " + account1.getBfa_acc_num());
				System.out.println("Customer Name : " + account1.getBfa_customer_name());
				System.out.println("Branch Name : " + account1.getBranch_name());
				System.out.println("City : " + account1.getCity());
				System.out.println("Adhar Number : " + account1.getSsn_number());
				System.out.println("Available Balance : " + account1.getBfa_acc_bal());
				
				System.out.println("======================== Account 2 Details ===================");
				System.out.println("Account Number : " + account2.getBfa_acc_num());
				System.out.println("Customer Name : " + account2.getBfa_customer_name());
				System.out.println("Branch Name : " + account2.getBranch_name());
				System.out.println("City : " + account2.getCity());
				System.out.println("Adhar Number : " + account2.getSsn_number());
				System.out.println("Available Balance : " + account2.getBfa_acc_bal());
				
				
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
