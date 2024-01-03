package core_java_topics.exceptionHandling.throwsKeyword;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsKeywordDemo {

	public static void main(String[] args) {
		System.out.println("important code 1");
		try {
			getFile();

		} catch (FileNotFoundException fne) {
			fne.printStackTrace();
			System.out.println("Rest of the code...");

		}

	}

	public static void getFile() throws FileNotFoundException {
		FileReader reader = new FileReader("E:\\iopackage\\test4.txt");
		BufferedReader buff = new BufferedReader(reader);
		System.out.println(buff);
		throw new FileNotFoundException();
	}

}
