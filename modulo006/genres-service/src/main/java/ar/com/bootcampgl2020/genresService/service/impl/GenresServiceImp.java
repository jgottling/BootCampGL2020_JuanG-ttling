package ar.com.bootcampgl2020.genresService.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.bootcampgl2020.genresService.dto.GenreDTO;
import ar.com.bootcampgl2020.genresService.model.Genre;
import ar.com.bootcampgl2020.genresService.repository.GenresRepository;
import ar.com.bootcampgl2020.genresService.service.GenresService;

@Service
public class GenresServiceImp implements GenresService {

  @Autowired GenresRepository repository;

  @Override
  public GenreDTO getGenreById(long id) {

    return GenreDTO.createFromEntity(repository.getOne(id));
  }

  @Override
  public List<GenreDTO> getGenres() {
    List<GenreDTO> dtos = new ArrayList<>();
    List<Genre> genres = repository.findAll();

    for (Genre oneGenre : genres) {
      dtos.add(GenreDTO.createFromEntity(oneGenre));
    }

    return dtos;
  }

  @Override
  public void createGenre(GenreDTO genreDTO) {
    repository.save(Genre.createFromDTO(genreDTO));
  }

  @Override
  public void updateGenre(GenreDTO genreDTO) {
    repository.save(Genre.createFromDTO(genreDTO));
  }

  @Override
  public void deleteGenre(long id) {
    repository.deleteById(id);
  }
}
