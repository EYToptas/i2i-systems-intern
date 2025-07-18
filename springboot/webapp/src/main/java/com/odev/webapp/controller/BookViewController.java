package com.odev.webapp.controller;

import com.odev.webapp.model.Book;
import com.odev.webapp.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/books")
public class BookViewController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping
    public String listBooks(Model model) {
        model.addAttribute("books", bookRepository.findAll());
        return "book-list";
    }

    @GetMapping("/new")
    public String showCreateForm(Model model) {
        model.addAttribute("book", new Book());
        return "book-form";
    }

    @PostMapping
    public String saveBook(@ModelAttribute Book book) {
        bookRepository.save(book);
        return "redirect:/books";
    }

    @GetMapping("/delete/{id}")
    public String deleteBook(@PathVariable Long id) {
        bookRepository.deleteById(id);
        return "redirect:/books";
    }
}
