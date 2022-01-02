package com.team4.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
//@EnableEurekaClient
public class DemoApplication {

	@Bean
	//@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	//@Autowired
	//private JdbcTemplate jdbcTemplate;

	/*@Override
	public void run(String... args) throws Exception {
		String sql = "INSERT INTO students (name, email) VALUES ("
				+ "'Nam Ha Minh', 'nam@codejava.net')";

		int rows = jdbcTemplate.update(sql);
		if (rows > 0) {
			System.out.println("A new row has been inserted.");
		}
	}*/

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
