package com.example.CS4125.controller;

import com.example.CS4125.dto.BookRequest;
import com.example.CS4125.dto.BookResponse;
import com.example.CS4125.dto.RegisterRequest;
import com.example.CS4125.service.LibraryService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/library")
@AllArgsConstructor
public class LibraryController {
    private final LibraryService libraryService;
    @PostMapping("/add")
    public ResponseEntity<String> addBook(@RequestBody BookRequest bookRequest) {
        libraryService.addBook(bookRequest);
        return new ResponseEntity<>("Book has been Registered in the system", HttpStatus.CREATED);
    }
    /*
    @PostMapping("/genre")
    public ResponseEntity<List<BookResponse>> booksByGenre(@RequestBody String genre) {
        return ResponseEntity.ok(libraryService.getPostsByGenre(genre));
    }

     */
}
