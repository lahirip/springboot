package com.pl.boot.bookcatalogservice;

import com.pl.boot.bookcatalogservice.entity.Book;
import com.pl.boot.bookcatalogservice.repository.BookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@EnableDiscoveryClient
@SpringBootApplication
public class BookCatalogServiceApplication {

	private static final Logger log = LoggerFactory.getLogger(BookCatalogServiceApplication.class);
	public static void main(String[] args)
	{
		SpringApplication.run(BookCatalogServiceApplication.class, args);
	}

	@Bean
	ApplicationRunner init(BookRepository repository) {
		return (args) -> {
			repository.save(new Book("AI123", "Pallab", "Polygot programming", 2016, "Tech"));
			repository.save(new Book("AI443", "Pallab", "PL/SQL programming", 2016, "Tech"));
			repository.save(new Book("AI153", "Pallab", "Not Again", 2016, "fiction"));
			repository.save(new Book("AI163", "Pallab", "Peer programming", 2016, "Tech"));
			repository.save(new Book("AI173", "Pallab", "Code Review", 2016, "Tech"));
			repository.save(new Book("AI173", "Pallab", "The Kite Boy", 2016, "fiction"));

			log.info("All Books");
			log.info("-------------------------------");
			for (Book book : repository.findAll()) {
				log.info(book.toString());
			}
		};
	}

}
