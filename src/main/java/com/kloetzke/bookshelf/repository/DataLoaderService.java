package com.kloetzke.bookshelf.repository;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kloetzke.bookshelf.model.Book;

@Service
public class DataLoaderService {
	@Autowired
	private BookshelfRepository bookshelf;
	
	
	@PostConstruct
	public void loadData() {
	       Book book1 = new Book("1234", "book 1");
           bookshelf.save(book1);

	       Book book2 = new Book("6789", "book 2");
           bookshelf.save(book2);

           Book book3 = new Book(4.5, 1242, "Description here", 3.75, 1050, "2222", "Book 3", false, "$12.25", "Subtitle here 2", "https://www.google.com2", false);
           bookshelf.save(book3);
           
           Book book4 = new Book(3.5, 42, "Description here", 3.75, 50, "1111", "Book 4", true, "$2.25", "Subtitle here", "https://www.google.com", true);
           bookshelf.save(book4);
	}
}
