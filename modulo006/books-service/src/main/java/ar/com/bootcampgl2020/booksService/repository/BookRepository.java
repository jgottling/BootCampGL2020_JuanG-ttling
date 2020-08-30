package ar.com.bootcampgl2020.booksService.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.bootcampgl2020.booksService.model.Book;

@Repository
public interface BookRepository extends Serializable, JpaRepository<Book, Long> {}
