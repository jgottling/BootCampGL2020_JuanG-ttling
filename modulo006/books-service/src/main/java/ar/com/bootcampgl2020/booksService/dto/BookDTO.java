package ar.com.bootcampgl2020.booksService.dto;

import ar.com.bootcampgl2020.booksService.model.Book;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookDTO {
  private long isbn;
  private String title;
  private long authorId;
  private long genreId;

  public static BookDTO createFromEntity(Book book) {

    return BookDTO.builder().isbn(book.getIsbn()).title(book.getTitle()).build();
  }
}
