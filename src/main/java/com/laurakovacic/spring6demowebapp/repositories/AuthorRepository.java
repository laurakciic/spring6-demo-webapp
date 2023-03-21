package com.laurakovacic.spring6demowebapp.repositories;

import com.laurakovacic.spring6demowebapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
