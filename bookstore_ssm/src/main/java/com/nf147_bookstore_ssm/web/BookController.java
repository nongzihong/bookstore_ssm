package com.nf147_bookstore_ssm.web;

import com.nf147_bookstore_ssm.dao.BookDAO;
import com.nf147_bookstore_ssm.dao.BookLogDAO;
import com.nf147_bookstore_ssm.entity.Book;
import com.nf147_bookstore_ssm.entity.BookLog;
import com.nf147_bookstore_ssm.service.BookService;
import com.nf147_bookstore_ssm.service.BookServicelmpl;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import java.util.List;

@Controller
public class BookController {

    Log logger = LogFactory.getLog("sss");

    @Autowired
    private BookDAO bookDAO;

    @Autowired
    private BookService bookService;

    @Autowired
    private BookLogDAO bookLogDAO;

    @Autowired
    private BookServicelmpl servicelmpl;

    @RequestMapping("/book")
    public String list(Model model) {
        List<Book> books = bookDAO.listAll();
        model.addAttribute("books", books);
        Log log = LogFactory.getLog("sfs");
        log.info("查询所有书籍信息");
        log.info(bookDAO.listAll());
        return "book_list";
    }

    @RequestMapping("/book/count")
    public String count(Model model) {
        int cnt = bookDAO.getBookCount();
        System.out.println(cnt);
        model.addAttribute("books", bookDAO.listAll());
        return "book_list";
    }

    @RequestMapping("/book/avg")
    public String avg(Model model) {
        System.out.println(bookService.getBookAvgCount());
        model.addAttribute("books", bookDAO.listAll());
        return "book_list";
    }

    @RequestMapping("/book/{id}")
    public ModelAndView getBook(@PathVariable("id") int bookid) {
        ModelAndView mv = new ModelAndView("book_detil");
        Book book = bookService.getBookById(bookid);
        mv.addObject("book", book);
        return mv;
    }

    @RequestMapping("/from")
    public ModelAndView bookadd(Model model) {
        ModelAndView mv = new ModelAndView("book_add");
        return mv;
    }

    @RequestMapping("/book/add")
    public String add(String name, int cnt, Model model) {
        /*获取书籍名称进行判断
        如果存在库存加一
        否则添加书籍
        */
        Book book = bookDAO.getByName(name);
        Book book1 = new Book(name, cnt);
        if (book != null) {
            bookDAO.update(book);
            bookLogDAO.insert_log(new BookLog("update t_book set cnt=cnt + " + cnt + "  where name=" + name));
            logger.info("库存修改成功");
        } else {
            bookDAO.insert(book1);
            bookLogDAO.insert_log(new BookLog("insert into t_book (name, cnt) values (" + name + "," + cnt + ")"));
            logger.info("书籍添加成功");
        }
        return list(model);
    }

    @RequestMapping("/book/del")
    public String remove(int bookid, Model model) {
        int count = servicelmpl.delete(bookid);
        System.out.println(count);
        return list(model);
    }

   /* @RequestMapping("/book/update")
    public String update(String name, int cnt, int bookid, Model model) {
        if(bookid>0){
            Book book=servicelmpl.getBookById(bookid);
            System.out.println(bookid);
            model.addAttribute("book",book);
            return "book_update";
        }else{
            Book book=new Book(name,cnt);
            bookDAO.update(book);
            System.out.println("数据修改成功");

        }
        return list(model);
    }
*/
}
