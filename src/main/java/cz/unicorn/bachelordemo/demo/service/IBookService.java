package cz.unicorn.bachelordemo.demo.service;

import cz.unicorn.bachelordemo.demo.model.Book;
import java.util.List;

public interface IBookService {

    boolean addBook(Book book);

    Book getBookById(Long id);
//    Book getBookByTitle(String title);
//    List<Book> getBooksByYear(int year);
    List<Book> getAllBooks();

    boolean updateBookById(Long id, Book book);

    boolean deleteBookById(Long id);
    boolean deleteAllBooks();

}
