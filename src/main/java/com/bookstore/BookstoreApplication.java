package com.bookstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.bookstore.domain.Book;
import com.bookstore.domain.BookRepository;

@SpringBootApplication
public class BookstoreApplication {

	@Bean
	public CommandLineRunner demo(BookRepository repository){
		
	return(args)->{
		
		Book book1 = new Book((long) 1, "Kalevala", "Elias Lönnrot", 2014, "978-1505723847", 12.99);
		repository.save(book1);
		Book book2 = new Book((long) 2, "Moby Dick", "Herman Melville", 1977, "978-3401036397", 24.99);
		repository.save(book2);
		Book book3 = new Book((long) 3, "Odyssey", "Homer", 1999, "978-0140268867", 9.99);
		repository.save(book3);

	};
	}
	
	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}
	
	
}

