package core_java_topics.data_type;

public class DataType_Exm {

	int intNum;
	short shortNum;
	char charA;
	long longNum;
	double doubleNum;
	float floatNum;
	byte byteNum;
	boolean flag;
	DataType_Exm dataType_Exm;
	
	public static void main(String[] args) {
		//create object to access the non-static variable
		DataType_Exm obj = new DataType_Exm();
		System.out.println("Int default value : " + obj.intNum);
		System.out.println("Short Default value : " + obj.shortNum);
		System.out.println("Char Default value: " + obj.charA);
		System.out.println("Double Default value : " + obj.doubleNum);
		System.out.println("Float Default value : " + obj.floatNum);
		System.out.println("Byte default value : " + obj.byteNum);
		System.out.println("Boolean Default value : " + obj.flag);
		System.out.println("Class Object default value : " + obj.dataType_Exm);

	}

}
