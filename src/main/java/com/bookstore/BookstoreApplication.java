package com.bookstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.bookstore.domain.Book;
import com.bookstore.domain.BookRepository;
import com.bookstore.domain.User;
import com.bookstore.domain.UserRepository;


@SpringBootApplication
public class BookstoreApplication {

	@Bean
	public CommandLineRunner demo(BookRepository repository, UserRepository urepository){
		
	
	return(args)->{
		
		Book book1 = new Book("Kalevala", "Elias Lönnrot", 2014, "978-1505723847", 12.99);
		repository.save(book1);
		Book book2 = new Book("Moby Dick", "Herman Melville", 1977, "978-3401036397", 24.99);
		repository.save(book2);
		Book book3 = new Book("Odyssey", "Homer", 1999, "978-0140268867", 9.99);
		repository.save(book3);
		
		
		User user1 = new User("user", "$2a$04$/5O4.ewax.a9VVYdXuxIx.XlfN2M.geqUNkvOBgrlWH5xMORZ2WSa", "USER");
		urepository.save(user1);
		User user2 = new User("admin", "$2a$04$/n9gE0IP31lUabc.qeOyhOR4DJNPyxE070lPKSgS3IxicSmOrATDe", "ADMIN");
		urepository.save(user2);
		
		System.out.println(user2);
		
	};
	}
	
	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
		
		
	}
	
	
}

