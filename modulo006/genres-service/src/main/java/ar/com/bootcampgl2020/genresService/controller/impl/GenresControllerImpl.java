package ar.com.bootcampgl2020.genresService.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.bootcampgl2020.genresService.controller.GenresController;
import ar.com.bootcampgl2020.genresService.dto.GenreDTO;
import ar.com.bootcampgl2020.genresService.service.GenresService;

@RestController
@RequestMapping("/genres")
public class GenresControllerImpl implements GenresController {

  @Autowired private GenresService service;

  @Override
  @GetMapping
  public ResponseEntity<List<GenreDTO>> getAll() {

    return new ResponseEntity<>(service.getGenres(), HttpStatus.OK);
  }

  @Override
  @GetMapping("/{id}")
  public ResponseEntity<GenreDTO> getGenreById(@PathVariable Long id) {

    return new ResponseEntity<>(service.getGenreById(id), HttpStatus.OK);
  }

  @Override
  @PostMapping(consumes = "application/json")
  public ResponseEntity<Void> createGenre(@RequestBody GenreDTO genreDTO) {
    service.createGenre(genreDTO);
    return new ResponseEntity<>(HttpStatus.CREATED);
  }

  @Override
  @PutMapping(consumes = "application/json")
  public ResponseEntity<Void> updateGenre(@RequestBody GenreDTO genreDTO) {
    service.updateGenre(genreDTO);
    return new ResponseEntity<>(HttpStatus.OK);
  }

  @Override
  @DeleteMapping("/{id}")
  public ResponseEntity<Void> deleteGenre(@PathVariable Long id) {
    service.deleteGenre(id);
    return new ResponseEntity<>(HttpStatus.OK);
  }
}
