package com.example.simbirsoft_test.service;

import com.example.simbirsoft_test.model.Word;

import javax.servlet.http.HttpServletResponse;

/**
 * @author Vadim
 * @version 1.0
 * Interface for working with {@link Word}
 */
public interface WordService {
    /**
     * Create words by link
     * @param link to read the page
     * @return true if created, false if not created
     */
    Boolean createWords(String link);

    /**
     * Download file with all records in the database
     * @param servletResponse from controller
     * @return true if downloaded, false if not downloaded
     */
    Boolean downloadFile(HttpServletResponse servletResponse);
}