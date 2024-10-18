package com.bptn.course._31_file_handling_basics;

import java.io.File;

public class FileDeleteDemo {

	public static void main(String[] args) {
		File file = new File("sample2.txt");
		if (file.exists()) {
			System.out.println("File deleting now..");
		}
		if (file.delete()) {
			System.out.println("File deleted!");
		} else {
			System.out.println("File not found");
		}

	}

}
