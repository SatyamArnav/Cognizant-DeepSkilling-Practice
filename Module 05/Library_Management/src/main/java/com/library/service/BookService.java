package com.library.service;

import com.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private BookRepository bookRepository;

    // ✅ Constructor injection (optional, preferred)
    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        System.out.println("Constructor injection called");
    }

    // ✅ Setter injection (optional if constructor is used)
    @Autowired
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        System.out.println("Setter injection called");
    }

    public void addBook(String title) {
        System.out.println("Book added: " + title);
        bookRepository.save(title); // 💥 NullPointerException if not injected
    }
}
