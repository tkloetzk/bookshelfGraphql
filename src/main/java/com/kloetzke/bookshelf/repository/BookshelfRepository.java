package com.kloetzke.bookshelf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.kloetzke.bookshelf.model.Book;

@Service
public interface BookshelfRepository extends JpaRepository<Book, Integer> {

}
