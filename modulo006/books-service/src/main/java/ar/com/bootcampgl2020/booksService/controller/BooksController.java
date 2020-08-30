package ar.com.bootcampgl2020.booksService.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;

import ar.com.bootcampgl2020.booksService.dto.BookDTO;

public interface BooksController {
  public ResponseEntity<List<BookDTO>> getAll();

  public ResponseEntity<BookDTO> getBookById(Long id);

  public ResponseEntity<Void> createBook(BookDTO bookDTO);

  public ResponseEntity<Void> updateBook(BookDTO bookDTO);

  public ResponseEntity<Void> deleteBook(Long id);
}
