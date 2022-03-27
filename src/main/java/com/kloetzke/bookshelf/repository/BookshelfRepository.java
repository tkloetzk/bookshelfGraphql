package com.kloetzke.bookshelf.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

import com.kloetzke.bookshelf.model.Book;

@Service
public interface BookshelfRepository extends MongoRepository<Book, Integer> {

}
