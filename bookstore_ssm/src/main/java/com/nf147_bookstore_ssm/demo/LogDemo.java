package com.nf147_bookstore_ssm.demo;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class LogDemo {

    public static void main(String[] args) {
        Log logger= LogFactory.getLog("sss");
        logger.info("你好");
        logger.error("错务信息");
    }
}
