package exceptionConcepts;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Sample {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		try (FileOutputStream fos = new FileOutputStream("d:\\File\\abc.txt");) {
			
			String value = "Hello World jjjjjjjjjjjjjjjjjjjjjjj";

			byte[] b = value.getBytes();

			fos.write(b);

			System.out.println("file created ");

		}

	}

}
