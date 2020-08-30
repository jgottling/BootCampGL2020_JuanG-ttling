package ar.com.bootcampgl2020.genresService.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;

import ar.com.bootcampgl2020.genresService.dto.GenreDTO;

public interface GenresController {
  public ResponseEntity<List<GenreDTO>> getAll();

  public ResponseEntity<GenreDTO> getGenreById(Long id);

  public ResponseEntity<Void> createGenre(GenreDTO genreDTO);

  public ResponseEntity<Void> updateGenre(GenreDTO genreDTO);

  public ResponseEntity<Void> deleteGenre(Long id);
}
