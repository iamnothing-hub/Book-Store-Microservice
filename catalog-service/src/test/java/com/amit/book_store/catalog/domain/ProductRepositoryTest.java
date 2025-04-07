package com.amit.book_store.catalog.domain;

import com.amit.book_store.catalog.domain.product.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;

@DataJpaTest(
        properties = {"spring.test.database.replace=none", "spring.datasource.url=jdbc:mysql://localhost:3307/catalogdb"
        })
@Sql("/test-data.sql")
public class ProductRepositoryTest {

    @Autowired
    private ProductRepository productRepository;

    /*   public ProductRepositoryTest(@Autowired ProductRepository productRepository) {
        this.productRepository = productRepository;
    }*/

    /**
     * @Test
     * void shouldGetAllProducts() {
     * List<Product> products = productRepository.findAll();
     * assertThat(products).hasSize(15);
     * }
     **/

    /**
     * @Test
     * void shouldGetProductByCode() {
     * Product product = productRepository.findByCode("B001").orElseThrow();
     * assertThat(product.getCode()).isEqualTo("B001");
     * assertThat(product.getName()).isEqualTo("Atomic Habits");
     * assertThat(product.getDescription()).isEqualTo("An easy & proven way to build good habits & break bad ones.");
     * assertThat(product.getPrice()).isEqualTo(499.0);
     * }
     *
     **/
    /**
     * @Test
     * void shouldReturnEmptyWhenProductCodeNotExist() {
     *
     * assertThat(productRepository.findByCode("invalid_product_code")).isEmpty();
     * }
     *
     **/
}
