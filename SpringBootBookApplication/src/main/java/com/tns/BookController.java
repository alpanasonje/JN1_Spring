package com.tns;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;

@RestController
public class BookController {
	@Autowired
	private BookService service;

	@GetMapping("/books")
	public List<Book> getAllBooks() {
		return service.getBooks();

	}

	@GetMapping("/books/{id}")
	public ResponseEntity<Book> get(@PathVariable Integer id) {
		try {
			Book b = service.get(id);
			return new ResponseEntity<Book>(b, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Book>(HttpStatus.NOT_FOUND);
		}
	}

	// RESTful API method for Create operation
	@PostMapping("/books")
	public void add(@RequestBody Book b) {
		service.save(b);
	}

	// RESTful API method for Update operation
	@PutMapping("/books/{id}")
	public ResponseEntity<?> update(@RequestBody Book newBook, @PathVariable Integer id) {
		try {
			Book existBook = service.get(id);
			service.save(newBook);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	// RESTful API method for Delete operation
	@DeleteMapping("/books/{id}")
	public void delete(@PathVariable Integer id) {
		service.delete(id);

	}
}
