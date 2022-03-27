package com.kloetzke.bookshelf.resolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.kloetzke.bookshelf.model.Book;
import com.kloetzke.bookshelf.repository.BookshelfRepository;

@Component
public class Query implements GraphQLQueryResolver {

	private BookshelfRepository bookshelfRepository;
	
	@Autowired
	public Query(BookshelfRepository bookshelfRepository) {
		this.bookshelfRepository = bookshelfRepository;
	}
	
	public Iterable<Book> getBookshelf() {
		return bookshelfRepository.findAll();
	}
	
//	public Book getBookByISBN(String isbn) {
//		
//	}
	
}
