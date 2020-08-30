package ar.com.bootcampgl2020.booksService.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import ar.com.bootcampgl2020.booksService.response.AuthorResponse;

@FeignClient(name = "api-gateway-zuul")
public interface AuthorsServiceProxy {

  @GetMapping(value = "authors-service/v1/authors/{id}", consumes = "application/json")
  AuthorResponse getAuthorById(@PathVariable long id);
}
