package com.siva;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
	@Autowired
	BookDao bd;

	public void addDetails(Book bm) {
		bd.addDetails(bm);

	}

	public void editbookDetails(Book bm, int bookId) {

		bd.editbookDetails(bm, bookId);
	}

	public Book findOneId(int bookId) {
		return bd.findOneId(bookId);
	}

	public List<Book> findAllbookDetails() {

		return bd.findAllbookDetails();

	}

	public void deleteBookDetails(int bookId) {

		bd.deletebookDetails(bookId);

	}


}
