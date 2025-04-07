package com.amit.book_store.catalog.web.controller;


import com.amit.book_store.catalog.domain.exception.ProductNotFoundException;
import com.amit.book_store.catalog.domain.helper.PageableResponse;
import com.amit.book_store.catalog.domain.product.Product;
import com.amit.book_store.catalog.domain.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @Value("${catalog.page-size}")
    private String page_size;

    @GetMapping
    public ResponseEntity<PageableResponse<Product>> getProducts(
            @RequestParam(name = "page", defaultValue = "1") int pageNumber,
            @RequestParam(name = "pageSize", defaultValue = "10") int pageSize
            ){

        PageableResponse<Product> allProducts = productService.getAllProducts(pageNumber, pageSize);
        return new ResponseEntity<>(allProducts, HttpStatus.OK);
    }

    @GetMapping("/{code}")
    public ResponseEntity<Product> getProductByCode(@PathVariable String code) throws ProductNotFoundException {
        Product product = productService.getProductByCode(code);
        return new ResponseEntity<>(product, HttpStatus.OK);

    }

}
