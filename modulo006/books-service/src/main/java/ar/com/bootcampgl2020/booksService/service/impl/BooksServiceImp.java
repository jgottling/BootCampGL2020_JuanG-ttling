package ar.com.bootcampgl2020.booksService.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.bootcampgl2020.booksService.dto.BookDTO;
import ar.com.bootcampgl2020.booksService.model.Book;
import ar.com.bootcampgl2020.booksService.repository.BookRepository;
import ar.com.bootcampgl2020.booksService.service.BooksService;

@Service
public class BooksServiceImp implements BooksService {

  @Autowired BookRepository repository;

  @Override
  public BookDTO getBookById(long id) {

    // TODO fetch author name and genre name
    return BookDTO.createFromEntity(repository.getOne(id));
  }

  @Override
  public List<BookDTO> getBooks() {
    List<BookDTO> dtos = new ArrayList<>();
    List<Book> books = repository.findAll();

    for (Book oneBook : books) {
      dtos.add(BookDTO.createFromEntity(oneBook));
    }

    return dtos;
  }

  @Override
  public void createBook(BookDTO bookDTO) {
    repository.save(Book.createFromDTO(bookDTO));
  }

  @Override
  public void updateBook(BookDTO bookDTO) {
    repository.save(Book.createFromDTO(bookDTO));
  }

  @Override
  public void deleteBook(long id) {
    repository.deleteById(id);
  }
}
