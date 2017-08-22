package com.pl.boot.edgeservice.controller;

import com.google.common.collect.ImmutableList;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.pl.boot.edgeservice.client.BookClient;
import com.pl.boot.edgeservice.dto.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.stream.Collectors;

@RestController
public class BookApiAdapterController {

    @Autowired
    private BookClient bookClient;

    public Collection<Book> fallback() {
        return ImmutableList.of(new Book("0000", "Author", "Book Name", 9999, "Type"));
    }

    @HystrixCommand(fallbackMethod = "fallback")
    @GetMapping("/fictions")
    public Collection<Book> getFictions() {

        return bookClient.findAll().stream()
                .filter(book -> "fiction".equals(book.getType()))
                .collect(Collectors.toList());

    }
}
