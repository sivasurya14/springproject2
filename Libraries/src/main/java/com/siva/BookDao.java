package com.siva;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookDao {
	@Autowired
	JdbcTemplate temp;

	public void addDetails(Book bm) {
		temp.update("INSERT INTO lap(bookId,bookName,bookPrice)VALUES(?,?,?)", bm.getBookId(), bm.getBookName(),bm.getBookPrice());
	}

	public void editbookDetails(Book bm, int bookId) {
		temp.update("Update lap SET bookName=?,bookPrice=? WHERE bookId=?", bm.getBookName(), bm.getBookPrice(),bookId);
		System.out.println("successfully updated in Dao");
	}

	public Book findOneId(int bookId) {
		// @SuppressWarnings("deprecation")
		Book bm = (Book) temp.queryForObject("SELECT * FROM lap WHERE bookId=?", new Object[] { bookId },new BeanPropertyRowMapper<Book>(Book.class));
		return bm;
	}

	// @SuppressWarnings("unchecked")
	public List<Book> findAllbookDetails() {
		// @SuppressWarnings("rawtypes")
		List<Book> li = temp.query("SELECT * FROM lap ", new BeanPropertyRowMapper(Book.class));
		return li;
	}

	public void deletebookDetails(int bookId) {
		temp.update("DELETE FROM lap WHERE bookid=?", bookId);

		System.out.println("Deleted successfully");
	}

}
