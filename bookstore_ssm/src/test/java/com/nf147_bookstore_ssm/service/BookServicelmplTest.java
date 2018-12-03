package com.nf147_bookstore_ssm.service;

import com.nf147_bookstore_ssm.service.BookService;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookServicelmplTest {
    static ClassPathXmlApplicationContext context;
    @BeforeClass
    public static void init() {
        System.out.println("开始初始化");
        // 初始化 spring，让其创建容器，实例化对象
        context = new ClassPathXmlApplicationContext("spring-root.xml");
    }

    @AfterClass
    public static void after() {
        System.out.println("结束了");
    }
    @Test
    public void getBookById() {
        // 从 spring 容器里，获取到被 spring 初始化好的对象
      BookService bookService = context.getBean(BookService.class);

        // 调用这个对象
        System.out.println(bookService.getBookById(12));
    }
}
