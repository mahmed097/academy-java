package com.bptn.course._16_arrayList;

import java.util.*;

public class BookList {

	public static void main(String[] args) {
		ArrayList<String> myBooks = new ArrayList<>();

		myBooks.add("BOOK1".toLowerCase());
		myBooks.add("book2".toLowerCase());
		myBooks.add("book3".toLowerCase());

		for (String i : myBooks) {
			System.out.println(i);
		}

		System.out.println(myBooks.get(0));

		myBooks.remove(1);

		if (myBooks.contains("book1")) {
			System.out.println("Book found");
		} else {
			System.out.println("Book not Found");

		}
		
		System.out.println(myBooks.get(myBooks.size()-1));


	}

}
