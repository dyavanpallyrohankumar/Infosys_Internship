package exceptionhandling;

import java.io.BufferedReader;
import java.io.FileReader;

//compile time Exception
public class IOexception {
	public static void main(String[] args) {

		try {
			FileReader file = new FileReader("missing.txt");
			BufferedReader br = new BufferedReader(file);
			System.out.println(br.readLine());
			br.close();

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}