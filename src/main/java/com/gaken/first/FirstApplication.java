package com.gaken.first;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @description: 应用启动类
 * @author: dengguikun
 * @date: 2018-12-26
 */

@MapperScan(value = "com.gaken.first.mapper")
@SpringBootApplication
public class FirstApplication {

	public static void main(String[] args) {

		SpringApplication.run(FirstApplication.class, args);
	}

}

