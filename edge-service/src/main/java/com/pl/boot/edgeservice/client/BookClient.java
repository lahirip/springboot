package com.pl.boot.edgeservice.client;

import com.pl.boot.edgeservice.dto.Book;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient("book-catalog-service")
public interface BookClient {

        @GetMapping("/books")
        public List<Book> findAll();

}
