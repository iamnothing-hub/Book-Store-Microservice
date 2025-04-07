package com.amit.book_store.catalog.domain.exception;

public class ProductNotFoundException extends Exception{

    public ProductNotFoundException(String message) {
        super(message);
    }

    public static ProductNotFoundException codeException(String code){
        return new ProductNotFoundException("Product is not found with code: "+ code);
    }
}
