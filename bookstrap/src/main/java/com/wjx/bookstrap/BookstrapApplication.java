package com.wjx.bookstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.wjx")//
public class BookstrapApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookstrapApplication.class, args);
    }

}
