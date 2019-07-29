package com.averyday.demo.io;

import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;

/**
 * Description
 * Author ayt  on
 */
public class TestFile {
    public static Logger logger = LoggerFactory.getLogger(TestFile.class);


    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");
        logger.info("文件存在不？：{}",file.exists());
        file.createNewFile();
        logger.info("{}",file.getName());
        logger.info("{}",file.getAbsolutePath());
        logger.info("{}",file.getParent());
        logger.info("{}",file.isDirectory());

    }
}
