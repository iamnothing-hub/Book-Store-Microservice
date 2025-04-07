package com.amit.book_store.catalog.domain.helper;

import org.springframework.data.domain.Page;

public class PageHelper {

    public static <T> PageableResponse<T> getTPageableResponse(Page<T> page, Class<T> type) {

        PageableResponse<T> response = new PageableResponse<>();
        response.setContent(page.getContent());
        response.setPageNumber(page.getNumber());
        response.setPageSize(page.getSize());
        response.setTotalPages(page.getTotalPages());
        response.setTotalElements(page.getTotalElements());
        response.setLastPage(page.isLast());

        return response;
    }
}
