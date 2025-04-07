package com.amit.book_store.catalog.domain.product;

import com.amit.book_store.catalog.domain.exception.ProductNotFoundException;
import com.amit.book_store.catalog.domain.helper.PageableResponse;

public interface ProductService {

    PageableResponse<Product> getAllProducts(int pageNumber, int pageSize);

    Product getProductByCode(String code) throws ProductNotFoundException;
}
