package core_java_topics.iopackage;

import java.io.File;
import java.io.FileOutputStream;

public class FileOutputStreamExm1 {

	public static void main(String[] args) {
		try {
			File file = new File("E:\\iopackage\\test1.txt");
			FileOutputStream fout = new FileOutputStream(file);
			fout.write(71);
			fout.close();
			System.out.println("Data written successfuly");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
