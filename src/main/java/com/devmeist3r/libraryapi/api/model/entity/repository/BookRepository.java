package com.devmeist3r.libraryapi.api.model.entity.repository;

import com.devmeist3r.libraryapi.api.model.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}
