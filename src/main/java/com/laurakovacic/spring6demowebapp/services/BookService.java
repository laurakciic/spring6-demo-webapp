package com.laurakovacic.spring6demowebapp.services;

import com.laurakovacic.spring6demowebapp.domain.Book;

public interface BookService {

    Iterable<Book> findAll();

}
