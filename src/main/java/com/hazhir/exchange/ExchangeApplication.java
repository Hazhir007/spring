package com.hazhir.exchange;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * the main method that calls several annotation before run and fires web server
 */
@SpringBootApplication
public class ExchangeApplication
{
	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}

	public static void main(String[] args)
	{

		SpringApplication.run(ExchangeApplication.class, args);
	}
}
