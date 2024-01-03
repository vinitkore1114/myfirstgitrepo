package core_java_topics.iopackage;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class ByteArrayOutputStreamExm {

	public static void main(String[] args) {
		try {
		
		File file1 = new File("E:\\iopackage\\file1.txt");
		File file2 = new File("E:\\iopackage\\file2.txt");
		
		FileOutputStream fout1 = new FileOutputStream(file1);
		FileOutputStream fout2 = new FileOutputStream(file2);
		
		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		bout.write(76);
		
		bout.writeTo(fout1);
		bout.writeTo(fout2);
		
		
		bout.flush();
		bout.close();
		fout1.close();
		fout2.close();
		System.out.println("Common data written to multiple file");
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
