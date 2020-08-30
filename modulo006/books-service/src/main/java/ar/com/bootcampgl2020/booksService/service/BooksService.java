package ar.com.bootcampgl2020.booksService.service;

import java.util.List;

import ar.com.bootcampgl2020.booksService.dto.BookDTO;

public interface BooksService {
  public BookDTO getBookById(long id);

  public List<BookDTO> getBooks();

  public void createBook(BookDTO bookDTO);

  public void updateBook(BookDTO bookDTO);

  public void deleteBook(long id);
}
