package com.amit.book_store.catalog.web.controller;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;

import com.amit.book_store.catalog.AbstarctIntegrationTest;
import com.amit.book_store.catalog.domain.product.Product;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.jdbc.Sql;

//@Sql("/test-data.sql")
public class ProductControllerTest extends AbstarctIntegrationTest {

    /**
     * @Autowired private JdbcTemplate jdbcTemplate;
     * @BeforeEach public void setup() {
     * List<Map<String, Object>> products = jdbcTemplate.queryForList("SELECT * FROM products");
     * System.out.println("Products in DB: " + products);
     * }
     **/


//    @Test
//    @Disabled
//    public void shouldReturnProducts() {

        /**
         * String response = given().contentType(ContentType.JSON)
         * .when()
         * .get("http://localhost:8081/api/products")
         * .then()
         * .statusCode(200)
         * .extract()
         * .asString();
         *
         * System.out.println("Response: " + response);
         **/
//        given().contentType(ContentType.JSON)
//                .when()
//                .get("/api/products")
//                .then()
//                .statusCode(200)
//                .body("content", hasSize(10))
//                .body("totalElements", is(15))
//                .body("pageNumber", is(0))
//                .body("totalPages", is(2))
//                //                .body("isFirst", is(true))
//                .body("lastPage", is(false))
//        //                .body("pageSize", is(10))
//        //                .body("hasNext", is(true))cf
//        //                .body("hasPrevious", is(false));
//        ;
//    }



//    @Test
//    @Disabled
//    void shouldGetProductByCode() {
//        Product product = given().contentType(ContentType.JSON)
//                .when()
//                .get("/api/products/{code}", "B001")
//                .then()
//                .statusCode(200)
//                .assertThat()
//                .extract()
//                .body()
//                .as(Product.class);
//
//        assertThat(product.getCode()).isEqualTo("B001");
//        assertThat(product.getName()).isEqualTo("Atomic Habits");
//        assertThat(product.getDescription()).isEqualTo("An easy & proven way to build good habits & break bad ones.");
//        assertThat(product.getPrice()).isEqualTo(499.0);
//    }

//    @Test
//    @Disabled
//    void shouldGetProductByInvalidCode() {
//
//        String code = "invalid_product_code";
//
//        given().contentType(ContentType.JSON)
//                .when()
//                .get("/api/products/{code}", code)
//                .then()
//                .statusCode(200)
//                .body("status", is(404))
//                .body("title", is("NOT_FOUND"))
//                .body("detail", is("Product is not found with code: " + code));
//    }
}

// given
//        String url = "/api/v1/products";
//        String expectedContentType = "application/json";
//
//        // when
//        var response = this.mockMvc.perform(get(url))
//                .andExpect(status().isOk())
//                .andExpect(content().contentType(expectedContentType))
//                .andReturn();
//
//        // then
//        var content = response.getResponse().getContentAsString();
//        System.out.println("Response content: " + content);
