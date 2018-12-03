package com.nf147_bookstore_ssm.service;

import com.nf147_bookstore_ssm.entity.Book;

import java.util.List;

public interface BookService {
    Book getBookById(int id);

    Book getBookByName(String name);

    int getBookCount();

    int getBookAvgCount();

    List<Book> getMaxCountTwo();

    int delete(int bookid);
}
