package com.laurakovacic.spring6demowebapp.repositories;

import com.laurakovacic.spring6demowebapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {

    // implementation generated at runtime by Spring Data JPA
}
