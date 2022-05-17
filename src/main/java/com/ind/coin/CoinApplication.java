package com.ind.coin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class CoinApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoinApplication.class, args);
	}

}
