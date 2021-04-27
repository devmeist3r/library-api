package com.devmeist3r.libraryapi.service.impl;

import com.devmeist3r.libraryapi.api.model.entity.Book;
import com.devmeist3r.libraryapi.api.model.entity.repository.BookRepository;
import com.devmeist3r.libraryapi.service.BookService;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

  private BookRepository repository;

  public BookServiceImpl(BookRepository repository) {
    this.repository = repository;
  }

  @Override
  public Book save(Book book) {
    return repository.save(book);
  }

}
