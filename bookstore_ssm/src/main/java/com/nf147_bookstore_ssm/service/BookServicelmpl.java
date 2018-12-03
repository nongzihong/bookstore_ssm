package com.nf147_bookstore_ssm.service;

import com.nf147_bookstore_ssm.dao.BookDAO;
import com.nf147_bookstore_ssm.dao.BookLogDAO;
import com.nf147_bookstore_ssm.entity.Book;
import com.nf147_bookstore_ssm.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
@Transactional
@Service
public class BookServicelmpl implements BookService {

    @Autowired
    private BookDAO bookDAO;

    @Autowired
    private BookLogDAO bookLogDAO;

    @Override
    public Book getBookById(int bookid) {
        System.out.println("开始查询");
        return bookDAO.getByID(bookid);
    }

    @Override
    public Book getBookByName(String name) {
        return bookDAO.getByName(name);
    }

    @Override
    public int getBookCount() {
        return bookDAO.getBookCount();
    }

    @Override
    public int getBookAvgCount() {
        System.out.println("开始查询平均数目");
        return bookDAO.getBookAvg();
    }

    @Override
    public List<Book> getMaxCountTwo() {
        return bookDAO.getMaxCountTwo();
    }

    @Override
    public int delete(int bookid) {
        return bookDAO.delete(bookid);
    }

}
