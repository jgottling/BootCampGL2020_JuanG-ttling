package ar.com.bootcampgl2020.booksService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients()
@EnableJpaRepositories
@EntityScan
public class BooksServiceApplication {

  public static void main(final String[] args) {
    SpringApplication.run(BooksServiceApplication.class, args);
  }
}
