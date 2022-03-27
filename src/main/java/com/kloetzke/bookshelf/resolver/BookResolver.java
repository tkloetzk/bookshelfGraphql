package com.kloetzke.bookshelf.resolver;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.kloetzke.bookshelf.model.Book;
import com.kloetzke.bookshelf.repository.BookshelfRepository;

@Component
public class BookResolver implements GraphQLQueryResolver {

	private BookshelfRepository bookshelfRepository;

	@Autowired
	public BookResolver(BookshelfRepository bookshelfRepository) {
		this.bookshelfRepository = bookshelfRepository;
	}

	public Iterable<Book> getBookshelf() {
		return bookshelfRepository.findAll();
	}

	public Iterable<String> getGenres() {
		List<String> categories = new ArrayList<>();

		List<Book> books = bookshelfRepository.findAll();
		for (Book book : books) {
			categories.addAll(book.getCategories());
		}
		return categories;
	}
	
	public List<Book> findByUnreadIsTrue() {
		return bookshelfRepository.findByUnreadIsTrue();
	}

	public List<Book> findByUnreadIsFalse() {
		return bookshelfRepository.findByUnreadIsFalse();
	}
}
