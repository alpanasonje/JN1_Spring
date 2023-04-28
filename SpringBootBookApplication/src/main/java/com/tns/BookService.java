package com.tns;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
	@Autowired
	private BookRepository repo;

	public List<Book> getBooks() {
		List<Book> b;
		b = repo.findAll();
		return b;
	}

	public Book get(int id) {
		return repo.findById(id).get();
	}

	public void save(Book b) {
		repo.save(b);
	}

	public void delete(Integer id) {
		repo.deleteById(id);
	}
}
