package com.javaproject.demo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

@ComponentScan("com.javaproject")
@SpringBootApplication
@MapperScan("com.javaproject.demo.mapper")
public class DemoApplication {
	private static final Logger LOG = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(DemoApplication.class);
		Environment env = SpringApplication.run(DemoApplication.class, args).getEnvironment();
		LOG.info("启动成功");
		LOG.info("地址：\thttp://127.0.0.1:{}",env.getProperty("server.port"));
	}

}
