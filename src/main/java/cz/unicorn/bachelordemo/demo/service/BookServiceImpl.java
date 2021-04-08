package cz.unicorn.bachelordemo.demo.service;

import cz.unicorn.bachelordemo.demo.model.Book;
import cz.unicorn.bachelordemo.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements IBookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public boolean addBook(Book book) {
        boolean isSuccessful = false;
        try {
            bookRepository.save(book);
            isSuccessful = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isSuccessful;
    }

    @Override
    public Book getBookById(Long id) {
        return bookRepository.findById(id).isPresent() ? bookRepository.findById(id).get() : null;
    }

//    @Override
//    public Book getBookByTitle(String title) {
//        return bookRepository.findBookByTitle(title);
//    }
//
//    @Override
//    public List<Book> getBooksByYear(int year) {
//        return bookRepository.findBooksByYear(year);
//    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public boolean updateBookById(Long id, Book book) {
        boolean isSuccessful = false;
        if(id.equals(book.getId())) {
            try {
                bookRepository.save(book);
                isSuccessful = true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return isSuccessful;
    }

    @Override
    public boolean deleteBookById(Long id) {
        boolean isSuccessful = false;
        try {
            bookRepository.deleteById(id);
            isSuccessful = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isSuccessful;
    }

    @Override
    public boolean deleteAllBooks() {
        boolean isSuccessful = false;
        try {
            bookRepository.deleteAll();
            isSuccessful = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isSuccessful;
    }
}
