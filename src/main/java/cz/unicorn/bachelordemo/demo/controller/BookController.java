package cz.unicorn.bachelordemo.demo.controller;

import cz.unicorn.bachelordemo.demo.model.Book;
import cz.unicorn.bachelordemo.demo.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lib/books")
public class BookController {

    @Autowired
    private IBookService bookService;

//    @GetMapping("/test")
//    public String getTestMsg() {
//        return "It is working!";
//    }

    @PostMapping("/create")
    public boolean createBook(@RequestBody Book book) {
        System.out.println("\"create book\" called. Book created:" + book.toString());
        return bookService.addBook(book);
    }

    @GetMapping("/{id}")
    public Book getById(@PathVariable("id") Long id) {
        System.out.println("\"getById\" called. ID: " + id);
        return bookService.getBookById(id);
    }

//    @GetMapping("/{title}")
//    public Book getByTitle(@PathVariable("title") String title) {
//        return bookService.getBookByTitle(title);
//    }
//
//    @GetMapping("/{year}")
//    public List<Book> getByTitle(@PathVariable("year") int year) {
//        return bookService.getBooksByYear(year);
//    }

    @GetMapping("/all")
    public List<Book> getAll() {
        System.out.println("\"getAll\" called. All books got. ");
        return bookService.getAllBooks();
    }

    @PutMapping("/{id}")
    public boolean editById(@PathVariable("id") Long id,
                            @RequestBody Book book) {
        System.out.println("\"editBook\" called. Book #" + id + " updated.");
        return bookService.updateBookById(id, book);
    }

    @DeleteMapping("/{id}")
    public boolean deleteById(@PathVariable("id") Long id) {
        System.out.println("\"deleteById\" called. Book #" + id + " deleted.");
        return bookService.deleteBookById(id);
    }

    @DeleteMapping("/deleteAll")
    public boolean deleteAllBooks() {
        System.out.println("All books deleted.");
        return bookService.deleteAllBooks();
    }

}
