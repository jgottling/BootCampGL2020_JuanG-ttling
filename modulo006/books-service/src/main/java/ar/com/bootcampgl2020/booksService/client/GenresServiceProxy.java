package ar.com.bootcampgl2020.booksService.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import ar.com.bootcampgl2020.booksService.response.GenreResponse;

@FeignClient(name = "api-gateway-zuul")
public interface GenresServiceProxy {

  @GetMapping(value = "/genres-service/v1/genre/{id}", consumes = "application/json")
  GenreResponse getGenreById(@PathVariable long id);
}
