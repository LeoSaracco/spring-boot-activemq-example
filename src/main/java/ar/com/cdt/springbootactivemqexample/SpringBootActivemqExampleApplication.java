package ar.com.cdt.springbootactivemqexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "ar.com.cdt.*")
public class SpringBootActivemqExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootActivemqExampleApplication.class, args);
	}
}