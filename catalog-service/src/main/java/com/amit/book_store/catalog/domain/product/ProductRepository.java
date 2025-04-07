package com.amit.book_store.catalog.domain.product;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, String> {

    @Override
    Optional<Product> findById(String s);

    Optional<Product> findByCode(String code);

}
