package com.transcript;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.rest.RepositoryRestMvcAutoConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@Import(RepositoryRestMvcAutoConfiguration.class)
@EnableAutoConfiguration
@SpringBootApplication
public class TranscriptappApplication {

	public static void main(String[] args) {
		SpringApplication.run(TranscriptappApplication.class, args);
	}
}
