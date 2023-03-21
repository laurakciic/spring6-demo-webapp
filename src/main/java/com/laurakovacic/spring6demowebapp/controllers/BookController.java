package com.laurakovacic.spring6demowebapp.controllers;

import com.laurakovacic.spring6demowebapp.services.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;                 // Spring on runtime wires up BookServiceImpl as it is registered as a Service component
    }

    @RequestMapping("/books")
    public String getBooks(Model model) {

        model.addAttribute("books", bookService.findAll());     // kind of like a map and property key

        return "books";
    }
}
