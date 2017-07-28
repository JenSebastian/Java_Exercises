package com.siriuscom.librarygenerics;

import com.siriuscom.library.Book;

public class LibraryDriver {

	public static void main(String[] args) {
		Library<Book> library = new Library<>();
		library.addMedia(new Book("NewPublisher", 12, 12222, "WareWolf"));
		System.out.println(library.getMedias());
	}

}
