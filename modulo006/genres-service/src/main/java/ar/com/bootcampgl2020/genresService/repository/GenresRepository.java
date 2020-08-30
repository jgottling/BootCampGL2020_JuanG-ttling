package ar.com.bootcampgl2020.genresService.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.bootcampgl2020.genresService.model.Genre;

@Repository
public interface GenresRepository extends Serializable, JpaRepository<Genre, Long> {}
