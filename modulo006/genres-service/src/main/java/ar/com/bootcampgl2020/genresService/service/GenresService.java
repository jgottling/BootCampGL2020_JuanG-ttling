package ar.com.bootcampgl2020.genresService.service;

import java.util.List;

import ar.com.bootcampgl2020.genresService.dto.GenreDTO;

public interface GenresService {
  public GenreDTO getGenreById(long id);

  public List<GenreDTO> getGenres();

  public void createGenre(GenreDTO genreDTO);

  public void updateGenre(GenreDTO genreDTO);

  public void deleteGenre(long id);
}
