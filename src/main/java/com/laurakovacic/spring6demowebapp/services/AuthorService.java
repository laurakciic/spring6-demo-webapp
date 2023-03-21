package com.laurakovacic.spring6demowebapp.services;

import com.laurakovacic.spring6demowebapp.domain.Author;

public interface AuthorService {

    Iterable<Author> findAll();

}
