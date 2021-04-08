package cz.unicorn.bachelordemo.demo.repository;

import cz.unicorn.bachelordemo.demo.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {

//    Book findBookByTitle(String title);
//    List<Book> findBooksByYear(int year);

}
