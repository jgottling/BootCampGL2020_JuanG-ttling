package com.globallogic.bootcampgl.vehiculo.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaRepositories("com.globallogic.bootcampgl.vehiculo.repository")
@ComponentScan(basePackages = {"com.globallogic.bootcampgl.vehiculo"})
@EntityScan(basePackages= {"com.globallogic.bootcampgl.vehiculo.model"})
public class VehiculoApplication {

	public static void main(String[] args) {
		SpringApplication.run(VehiculoApplication.class, args);
	}

}
