package core_java_topics.abstraction.abstractClass.abstractExm2;

public class InsuranceApp {

	public static void main(String[] args) {
		
		PolicyBazar icici = new ICICIPrudential();
		PolicyBazar hdfc = new HDFCLifeInsurance();
		PolicyBazar max = new MaxLifeInsurance();
		
		icici.getServiceProdviderDetails();
		System.out.println("======================================================================");
		hdfc.getServiceProdviderDetails();
		System.out.println("======================================================================");
		max.getServiceProdviderDetails();

	}

}
