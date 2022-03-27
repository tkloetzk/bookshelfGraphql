package com.kloetzke.bookshelf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.kloetzke.bookshelf.model.Book;
import com.kloetzke.bookshelf.repository.BookshelfRepository;

@Service
public class BookService implements GraphQLQueryResolver {

//	@Autowired
//	private BookshelfRepository bookshelf;
//	
//	public List<Book> getBookshelf() {
//		return bookshelf.findAll();
//	}
}
