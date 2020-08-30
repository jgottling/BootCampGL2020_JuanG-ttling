package ar.com.bootcampgl2020.genresService.dto;

import ar.com.bootcampgl2020.genresService.model.Genre;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GenreDTO {

  private String name;

  public static GenreDTO createFromEntity(Genre genre) {

    return GenreDTO.builder().name(genre.getName()).build();
  }
}
