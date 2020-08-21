package com.globallogic.bootcampgl.vehiculo.errors;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.globallogic.bootcampgl.vehiculo.exceptions.EmptyValueException;

@ControllerAdvice
public class VehiculoServiceErrorHandler {

	@ExceptionHandler(EmptyValueException.class)
    public ResponseEntity<Object> handleCityNotFoundException(
    		EmptyValueException exception, WebRequest request) {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", exception.getMessage());

        return new ResponseEntity<>(body, HttpStatus.BAD_REQUEST);
    }
}
