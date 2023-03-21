package com.laurakovacic.spring6demowebapp.services;

import com.laurakovacic.spring6demowebapp.domain.Book;
import com.laurakovacic.spring6demowebapp.repositories.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }
}
