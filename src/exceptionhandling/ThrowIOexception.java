package exceptionhandling;

// throws is used in a method declaration

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ThrowIOexception {
	public static void readFile() throws IOException {
		FileReader file = new FileReader("missing.txt");
		BufferedReader br = new BufferedReader(file);
		System.out.println(br.readLine());
		br.close();
	}

	public static void main(String[] args) {
		try {
			readFile();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}