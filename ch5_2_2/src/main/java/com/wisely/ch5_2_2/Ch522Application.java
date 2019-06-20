package com.wisely.ch5_2_2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication //1 使用@SpringBootApplication开启自动配置
public class Ch522Application {

    @Value("${book.author}")
    private String bookAuthor;
    @Value("${book.name}")
    private String bookName;

    @RequestMapping("/")
    String index() {
        return "book name is:" + bookName + " and book author is:" + bookAuthor;
    }

    public static void main(String[] args) { //2 main方法作为项目启动的入口
        SpringApplication.run(Ch522Application.class, args);
    }
}
