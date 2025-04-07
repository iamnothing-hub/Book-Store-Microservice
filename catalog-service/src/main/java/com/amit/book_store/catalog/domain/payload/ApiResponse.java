package com.amit.book_store.catalog.domain.payload;

import org.springframework.http.HttpStatus;

import java.net.URI;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class ApiResponse {

    private URI type;
    private HttpStatus title;
    private Integer status;
    private String detail;
    private String instance;
    private LocalDateTime timestamp;

    public ApiResponse() {
    }

    public URI getType() {
        return type;
    }

    public void setType(URI type) {
        this.type = type;
    }

    public HttpStatus getTitle() {
        return title;
    }

    public void setTitle(HttpStatus title) {
        this.title = title;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getInstance() {
        return instance;
    }

    public void setInstance(String instance) {
        this.instance = instance;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
