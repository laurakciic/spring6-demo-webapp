package com.laurakovacic.spring6demowebapp.bootstrap;

import com.laurakovacic.spring6demowebapp.domain.Author;
import com.laurakovacic.spring6demowebapp.domain.Book;
import com.laurakovacic.spring6demowebapp.domain.Publisher;
import com.laurakovacic.spring6demowebapp.repositories.AuthorRepository;
import com.laurakovacic.spring6demowebapp.repositories.BookRepository;
import com.laurakovacic.spring6demowebapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author eric = new Author();
        eric.setFirstName("Eric");
        eric.setLastName("Evans");

        Book ddd = new Book();
        ddd.setTitle("Domain Driven Design");
        ddd.setIsbn("3218372");

        Author ericSaved = authorRepository.save(eric);
        Book dddSaved = bookRepository.save(ddd);

        Author rod = new Author();
        rod.setFirstName("Rod");
        rod.setLastName("Johnson");

        Book noEJB = new Book();
        noEJB.setTitle("J2EE Development without EJB");
        noEJB.setIsbn("5472182");

        Author rodSaved = authorRepository.save(rod);
        Book noEJBSaved = bookRepository.save(noEJB);

        ericSaved.getBooks().add(dddSaved);
        rodSaved.getBooks().add(noEJBSaved);

        // persisting
        authorRepository.save(ericSaved);
        authorRepository.save(rodSaved);

//        bookRepository.save(dddSaved);
//        bookRepository.save(noEJBSaved);

        System.out.println("In Bootstrap");
        System.out.println("Author Count: " + authorRepository.count());
        System.out.println("Book Count: " + bookRepository.count());

        Publisher publisher = new Publisher();
        publisher.setPublisherName("Nova");
        publisher.setState("Cro");
        publisher.setCity("Osijek");

        Publisher publisherSaved = publisherRepository.save(publisher);
        publisherRepository.save(publisherSaved);

        System.out.println("Publisher Count: " + publisherRepository.count());
    }
}
