package com.bptn.course._31_file_handling_basics;

import java.io.FileWriter;
import java.io.IOException;

public class FileUpdateDemo {

	public static void main(String[] args) {

		try (FileWriter writer = new FileWriter("student.txt", true);) {
			writer.write("This is a new file!");
			System.out.println("File created!");

		} catch (IOException e) {
			System.out.println("Something went wrong while creating the file: ");
			e.printStackTrace();
		}

	}

}
