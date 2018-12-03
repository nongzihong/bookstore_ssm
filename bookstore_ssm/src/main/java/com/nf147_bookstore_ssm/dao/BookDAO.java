package com.nf147_bookstore_ssm.dao;

import com.nf147_bookstore_ssm.entity.Book;
import com.nf147_bookstore_ssm.entity.BookLog;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface BookDAO {

    //通过id查询图书
    Book getByID(int id);

    //通过书名查询图书
    Book getByName(String name);

    //获取书籍数目
    int countAll(int id);


    //获取所有图书
    List<Book> listAll();


    //新增图书
    int insert(Book book);


    //修改图书
    int update(Book book);

    //删除图书
    int delete(int id);

    int getBookCount();

    int getBookAvg();

    List<Book> getMaxCountTwo();

}
