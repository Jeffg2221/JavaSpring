package com.jeffgomez.bookclub.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jeffgomez.bookclub.models.Book;
import com.jeffgomez.bookclub.repositories.BookRepository;

@Service
public class BookService {
	
	@Autowired
	BookRepository bookRepo;
	
    // return all
	public List<Book> allBooks(){
		return bookRepo.findAll();
	}
//	public Book getOne(Long id) {
//		Optional<Book> book = bookRepo.
//	}

    // retrive one
	public Book getOne(Long id) {
		Optional<Book> optBook = bookRepo.findById(id);
		if(optBook.isPresent()) {
			return optBook.get();
		} else return null;
	}

    // create
	public Book create(Book b) {
		return bookRepo.save(b);
	}

    // update one by ID
	public Book updateBook(Book b) {
		return bookRepo.save(b);
	}

    // delete one by ID
	public void deleteBook(Long id) {
		bookRepo.deleteById(id);
	}

}

