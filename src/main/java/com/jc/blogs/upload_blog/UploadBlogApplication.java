package com.jc.blogs.upload_blog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("src/main/java/com/jc/blogs/upload_blog/mapper")
public class UploadBlogApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(UploadBlogApplication.class, args);
    }
    
}
