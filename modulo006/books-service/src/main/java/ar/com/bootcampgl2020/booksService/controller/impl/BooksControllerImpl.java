package ar.com.bootcampgl2020.booksService.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import ar.com.bootcampgl2020.booksService.controller.BooksController;
import ar.com.bootcampgl2020.booksService.dto.BookDTO;
import ar.com.bootcampgl2020.booksService.service.BooksService;

@RestController
public class BooksControllerImpl implements BooksController {

  @Autowired private BooksService service;

  @Override
  public ResponseEntity<List<BookDTO>> getAll() {
    return new ResponseEntity<>(service.getBooks(), HttpStatus.OK);
  }

  @Override
  public ResponseEntity<BookDTO> getBookById(Long id) {

    return new ResponseEntity<>(service.getBookById(id), HttpStatus.OK);
  }

  @Override
  public ResponseEntity<Void> createBook(BookDTO bookDTO) {
    service.createBook(bookDTO);
    return new ResponseEntity<>(HttpStatus.CREATED);
  }

  @Override
  public ResponseEntity<Void> updateBook(BookDTO bookDTO) {
    service.updateBook(bookDTO);
    return new ResponseEntity<>(HttpStatus.OK);
  }

  @Override
  public ResponseEntity<Void> deleteBook(Long id) {
    service.deleteBook(id);
    return new ResponseEntity<>(HttpStatus.OK);
  }
}
