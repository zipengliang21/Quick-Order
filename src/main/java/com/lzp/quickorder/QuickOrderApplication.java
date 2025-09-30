package com.lzp.quickorder;

import org.springframework.boot.SpringApplication;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@Slf4j
@SpringBootApplication
@ServletComponentScan
public class QuickOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuickOrderApplication.class,args);
        log.info("项目启动成功...");
    }
}
