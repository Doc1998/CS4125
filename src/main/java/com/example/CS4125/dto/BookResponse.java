package com.example.CS4125.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookResponse {
    private String name;
    private String author;
    private String genre;
    private Long id;
}
