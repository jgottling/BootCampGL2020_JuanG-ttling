package ar.com.bootcampgl2020.booksService.client;

import org.springframework.cloud.netflix.ribbon.RibbonClient;

// @FeignClient(name = "api-gateway-zuul")
@RibbonClient(name = "genres-service")
public class GenresServiceProxy {}
