package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class HandleFile {

	public static void main(String[] args) throws IOException {
		String file = "D:/sqa/myFile.txt";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter some word: ");
		String name = sc.nextLine();
		writeBytesIntoFile(file, name+"\n", true);

	}
	public static void writeBytesIntoFile(String file, String name, boolean append) throws IOException {
		FileOutputStream fout = new FileOutputStream(file, append);
		byte b[] = name.getBytes();
		try {
			fout.write(b);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			fout.close();
		}
	}

}
