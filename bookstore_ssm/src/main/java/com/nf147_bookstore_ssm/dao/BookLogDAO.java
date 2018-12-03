package com.nf147_bookstore_ssm.dao;

import com.nf147_bookstore_ssm.entity.BookLog;
import org.springframework.stereotype.Repository;

@Repository
public interface BookLogDAO {
    int insert_log(BookLog bookLog);
}



