package com.example.CS4125.service;

import com.example.CS4125.dto.BookRequest;
import com.example.CS4125.dto.BookResponse;
import com.example.CS4125.entity.Book;
//import com.example.CS4125.mapper.BookMapper;
import com.example.CS4125.repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

@Service
@AllArgsConstructor
public class LibraryService {
    private final BookRepository bookRepository;
   // private final BookMapper bookMapper;
    public void addBook(BookRequest bookRequest){
        Book book = new Book();
        book.setAuthor(bookRequest.getAuthor());
        book.setBookName(bookRequest.getName());
        book.setGenre(bookRequest.getGenre());
        bookRepository.save(book);
    }
    /*
    @Transactional(readOnly = true)
    public List<BookResponse> getPostsByGenre(String genre){
        List<Book> books = bookRepository.findAllByGenre(genre);
        return books.stream().map(bookMapper::mapToDto).collect(toList());
    }
     */
}
