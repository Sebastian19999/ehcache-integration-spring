package com.example.ehcacheintegration.services;

import com.example.ehcacheintegration.entities.Book;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

public interface BookService {
    Book addBook(Book book);

    Book updateBook(Book book);

    Book getBook(long id);

    String deleteBook(long id);
}
