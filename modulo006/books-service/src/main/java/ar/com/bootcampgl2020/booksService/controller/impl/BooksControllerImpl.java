package ar.com.bootcampgl2020.booksService.controller.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.bootcampgl2020.booksService.client.AuthorsServiceProxy;
import ar.com.bootcampgl2020.booksService.client.GenresServiceProxy;
import ar.com.bootcampgl2020.booksService.controller.BooksController;
import ar.com.bootcampgl2020.booksService.dto.BookDTO;
import ar.com.bootcampgl2020.booksService.response.AuthorResponse;
import ar.com.bootcampgl2020.booksService.response.BookResponse;
import ar.com.bootcampgl2020.booksService.response.GenreResponse;
import ar.com.bootcampgl2020.booksService.service.BooksService;

@RestController
@RequestMapping("/books")
public class BooksControllerImpl implements BooksController {

  @Autowired private BooksService service;
  @Autowired private AuthorsServiceProxy authorsClient;
  @Autowired private GenresServiceProxy genresClient;

  @Override
  @GetMapping
  public ResponseEntity<List<BookResponse>> getAll() {
    List<BookDTO> dtos = service.getBooks();
    List<BookResponse> booksList = new ArrayList<>();

    for (BookDTO dto : dtos) {
      BookResponse book = BookResponse.createFromDTO(dto);
      book.setAuthor(authorsClient.getAuthorById(dto.getAuthorId()));
      book.setGenre(genresClient.getGenreById(dto.getGenreId()));

      booksList.add(book);
    }

    return new ResponseEntity<>(booksList, HttpStatus.OK);
  }

  @Override
  @GetMapping("/{id}")
  public ResponseEntity<BookResponse> getBookById(@PathVariable Long id) {
    BookDTO dto = service.getBookById(id);

    AuthorResponse author = authorsClient.getAuthorById(dto.getAuthorId());
    GenreResponse genre = genresClient.getGenreById(dto.getGenreId());

    BookResponse response = BookResponse.createFromDTO(dto);
    response.setAuthor(author);
    response.setGenre(genre);

    return new ResponseEntity<>(response, HttpStatus.OK);
  }

  @Override
  @PostMapping(consumes = "application/json")
  public ResponseEntity<Void> createBook(@RequestBody BookDTO bookDTO) {
    service.createBook(bookDTO);
    return new ResponseEntity<>(HttpStatus.CREATED);
  }

  @Override
  @PutMapping(consumes = "application/json")
  public ResponseEntity<Void> updateBook(@RequestBody BookDTO bookDTO) {
    service.updateBook(bookDTO);
    return new ResponseEntity<>(HttpStatus.OK);
  }

  @Override
  @DeleteMapping("/{id}")
  public ResponseEntity<Void> deleteBook(@PathVariable Long id) {
    service.deleteBook(id);
    return new ResponseEntity<>(HttpStatus.OK);
  }
}
