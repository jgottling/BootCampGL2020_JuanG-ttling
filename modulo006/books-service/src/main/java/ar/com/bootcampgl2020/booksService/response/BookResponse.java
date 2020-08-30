package ar.com.bootcampgl2020.booksService.response;

import ar.com.bootcampgl2020.booksService.dto.BookDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookResponse {
  private long isbn;
  private String title;
  private AuthorResponse author;
  private GenreResponse genre;

  public static BookResponse createFromDTO(BookDTO bookDTO) {

    return BookResponse.builder().isbn(bookDTO.getIsbn()).title(bookDTO.getTitle()).build();
  }
}
