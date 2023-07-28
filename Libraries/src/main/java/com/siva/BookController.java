package com.siva;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/siva")

public class BookController {
	@Autowired
	BookService bs; 
	@PostMapping("/save")
	public String addDetails(@RequestBody Book bm) {
		bs.addDetails(bm);
		return "Data saved successfully";

	}

	@PutMapping("/update/{bookId}")
	public String editbookDetails(@RequestBody Book bm, @PathVariable int bookId) {
		bs.editbookDetails(bm, bookId);
		return "Update Successfully";

	}
	@GetMapping("/findOne/{bookId}")
	public Book findOneId(@PathVariable int bookId) {
		return bs.findOneId(bookId);
	}
	@GetMapping("/findAll")
	public List<Book> findAllbookDeatails() {
		return bs.findAllbookDetails();
	}

	@DeleteMapping("/delete/{bookId}")
	public void deleteBookDeatails(@PathVariable int bookId) {
		bs.deleteBookDetails(bookId);   
		System.out.println("Data Deleted Successfully");

	}

}
