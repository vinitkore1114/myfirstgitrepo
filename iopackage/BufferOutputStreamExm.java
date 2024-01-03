package core_java_topics.iopackage;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class BufferOutputStreamExm {

	public static void main(String[] args) {
		try {
			File file = new File("E:\\iopackage\\test4.txt");
			FileOutputStream fout = new FileOutputStream(file);
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			String sentance = "I hope that you are loking the session";
			byte []b = sentance.getBytes();
			bout.write(b);
			bout.close();
			fout.close();
			System.out.println("This is a example of BufferedOutputStream class...");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
