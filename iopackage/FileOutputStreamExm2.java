package core_java_topics.iopackage;

import java.io.File;
import java.io.FileOutputStream;

public class FileOutputStreamExm2 {

	public static void main(String[] args) {
		try {
			File file = new File("E:\\iopackage\\test2.txt");
			FileOutputStream fout = new FileOutputStream(file);
			String statment = "This is package Session";
			byte [] b = statment.getBytes();
			fout.write(b);
			fout.close();
			System.out.println("Statment written to the file");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
