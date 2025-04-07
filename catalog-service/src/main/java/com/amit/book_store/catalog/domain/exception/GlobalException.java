package com.amit.book_store.catalog.domain.exception;


import com.amit.book_store.catalog.domain.payload.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.net.URI;
import java.time.LocalDate;
import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalException {

    private static final URI NOT_FOUND_TYPE = URI.create("https://api.bookstore.com/errors/not-found");
    private static final URI ISE_FOUND_TYPE = URI.create("https://api.bookstore.com/errors/not-found");
    private static final String SERVICE_NAME = "catalog-service";



    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<ApiResponse> handleProductNotFoundException( ProductNotFoundException ex){
        String message = ex.getMessage();

        ApiResponse apiResponse = new ApiResponse();

        apiResponse.setDetail(message);
        apiResponse.setInstance(SERVICE_NAME);
        apiResponse.setTimestamp(LocalDateTime.now());
        apiResponse.setStatus(404);
        apiResponse.setTitle(HttpStatus.NOT_FOUND);
        apiResponse.setType(NOT_FOUND_TYPE);



        return new ResponseEntity<>(apiResponse, HttpStatus.OK);
    }

}
