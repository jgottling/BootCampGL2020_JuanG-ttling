package ar.com.bootcampgl2020.booksService.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import ar.com.bootcampgl2020.booksService.dto.BookDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Books")
public class Book {
  @Id
  @Column(name = "book_id", nullable = false, unique = true)
  private long isbn;

  @Column(name = "book_title")
  private String title;

  @Column(name = "book_author_id", nullable = false, unique = true)
  private long authorId;

  @Column(name = "book_genre_id", nullable = false, unique = true)
  private long genreId;

  public static Book createFromDTO(BookDTO dto) {

    return Book.builder().isbn(dto.getIsbn()).title(dto.getTitle()).build();
  }
}
