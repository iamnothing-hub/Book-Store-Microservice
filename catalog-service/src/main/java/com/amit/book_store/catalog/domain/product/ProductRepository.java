package com.amit.book_store.catalog.domain.product;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {

    @Override
    Optional<Product> findById(String s);

    Optional<Product> findByCode(String code);
}
