package edu.neu.zsy.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
@DubboComponentScan(basePackages = "edu.neu.zsy.demo.service")
public class SpringbootDubboApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDubboApplication.class, args);
	}
}
