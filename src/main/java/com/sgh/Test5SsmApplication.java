package com.sgh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.sgh.dao")
@SpringBootApplication
public class Test5SsmApplication {

    public static void main(String[] args) {
        SpringApplication.run(Test5SsmApplication.class, args);
    }

}
