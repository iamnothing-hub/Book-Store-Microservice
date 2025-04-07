package com.amit.book_store.catalog.domain.product;

import com.amit.book_store.catalog.domain.exception.ProductNotFoundException;
import com.amit.book_store.catalog.domain.helper.PageHelper;
import com.amit.book_store.catalog.domain.helper.PageableResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public PageableResponse<Product> getAllProducts(int pageNumber, int pageSize) {

        Sort sort  = Sort.by("name").ascending();
        pageNumber = pageNumber <=1 ? 0 : pageNumber-1;
        Pageable pageable = PageRequest.of(pageNumber, pageSize,sort);

        Page<Product> products = productRepository.findAll(pageable);
        return PageHelper.getTPageableResponse(products, Product.class);
    }

    @Override
    public Product getProductByCode(String code) throws ProductNotFoundException {
        Product product = productRepository.findByCode(code).orElseThrow(() -> ProductNotFoundException.codeException(code));

        return product;

    }

}
