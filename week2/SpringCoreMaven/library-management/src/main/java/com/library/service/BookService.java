// package com.library.service;

// public class BookService {

//     public BookService() {
//         System.out.println("BookService object created");
//     }

//     public void displayService() {
//         System.out.println("Book Service Working");
//     }
// }

package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    public BookService() {
        System.out.println("BookService object created");
    }

    // Setter Injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayService() {

        System.out.println("Book Service Working");

        bookRepository.displayRepository();
    }
}