package com.practice.bookshop.controller;

import com.practice.bookshop.dto.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class bookController {

    List<Book> bookList = new ArrayList<>();
    private int ID = 0;

    @GetMapping("/books")
    public List<Book> bookList (){
        return bookList;
    }

    @PostMapping("/add-book")
    public Book addBook(@RequestBody Book book){

        book.setID(++ID);
        bookList.add(book);
        return book;
    }

    @GetMapping("/first-book")
    public Book addBook(){
        Book book = new Book("name", ++ID, "author", 1, 0, 10);
        bookList.add(book);
        return book;
    }

    @DeleteMapping("/delete/{ID}")
    public void deleteBook(@PathVariable int ID){
        for (int i= 0; i < bookList.size();i++){
            if (bookList.get(i).getID()==ID){
                bookList.remove(i);
                break;
            }
        }
    }

    @PutMapping("/update/{ID}")
    public Book updateBook(@PathVariable int ID, @RequestBody Book bookUpdate){
        for (int i= 0; i < bookList.size();i++){
            if (bookList.get(i).getID()==ID){
                bookUpdate.setID(ID);
                bookList.set(i,bookUpdate);
                break;
            }
        }
        return bookUpdate;
    }
}
