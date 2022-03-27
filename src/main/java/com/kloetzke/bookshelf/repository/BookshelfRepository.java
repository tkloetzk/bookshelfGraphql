package com.kloetzke.bookshelf.repository;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Service;

import com.kloetzke.bookshelf.model.Book;

@Service
public interface BookshelfRepository extends MongoRepository<Book, ObjectId> {

	@Query("{ 'unread': true }")
	List<Book> findByUnreadIsTrue();
	
	@Query("{ 'unread': false }")
	List<Book> findByUnreadIsFalse();
}
