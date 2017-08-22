package com.pl.boot.bookcatalogservice.repository;

import com.pl.boot.bookcatalogservice.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByTitle(String title);

    List<Book> findByAuthor(String author);

}
