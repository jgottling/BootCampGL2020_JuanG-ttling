package ar.com.bootcampgl2020.genresService.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import ar.com.bootcampgl2020.genresService.dto.GenreDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Genres")
public class Genre {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  @Column(name = "genre_id", unique = true)
  private long genreId;

  @Column(name = "genre_name")
  private String name;

  public static Genre createFromDTO(GenreDTO dto) {

    return Genre.builder().name(dto.getName()).build();
  }
}
