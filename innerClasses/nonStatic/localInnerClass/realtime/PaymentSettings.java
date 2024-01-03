package core_java_topics.innerClasses.nonStatic.localInnerClass.realtime;

public class PaymentSettings {
	private long cell_number = 8600536126l;
	private String cust_name = "Vinit Kore";
	private String city = "Sangli City";
	
	public void airtelPaymentBank() {
		class AirtelPaymentSetting{
			void displayAirtelPaymentSettingInfo(){
				System.out.println("============================== This is Airtel Payment Setting ===================");
				System.out.println("Mobile Number : " + cell_number);
				System.out.println("Customer Name : " + cust_name);
				System.out.println("City : " + city);

			}
		}
		AirtelPaymentSetting airtel = new AirtelPaymentSetting();
		airtel.displayAirtelPaymentSettingInfo();
	}
	public void paytmWalletSetting() {
		class PaytmWallet{
			void displayPaytmSettingInfo() {
				System.out.println("===============================This is Paytm Wallet Setting=====================");
				System.out.println("Mobile Number : " + cell_number);
				System.out.println("Customer Name : " + cust_name);
				System.out.println("City : " + city);
			}
		}
		PaytmWallet payTm = new PaytmWallet();
		payTm.displayPaytmSettingInfo();
	}
	public void amazonWalletSetting() {
		class AmazonWallet{
			void displayAmazonSettingInfo() {
				System.out.println("================================ This is Amazon Wallet Setting =================");
				System.out.println("Mobile Number : " + cell_number);
				System.out.println("Customer Name : " + cust_name);
				System.out.println("City : " + city);
			}
		}
		AmazonWallet amazon = new AmazonWallet();
		amazon.displayAmazonSettingInfo();
	}

	public static void main(String[] args) {
		PaymentSettings payment = new PaymentSettings();
		payment.airtelPaymentBank();
		payment.paytmWalletSetting();
		payment.amazonWalletSetting();
	}

}
