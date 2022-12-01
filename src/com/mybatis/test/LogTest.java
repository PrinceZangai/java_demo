package com.mybatis.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogTest {
    private static final Logger logger= LoggerFactory.getLogger(LogTest.class);
    public static void main(String[] args) {
        logger.debug("调试信息");
        logger.info("提示信息");
        logger.warn("警告信息");
        logger.error("错误信息");
    }
}
