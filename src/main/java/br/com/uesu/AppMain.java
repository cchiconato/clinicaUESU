package br.com.uesu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import br.com.uesu.utils.AppContext;

@SpringBootApplication
public class AppMain {

	public static void main(String[] args) {
		SpringApplication.run(AppContext.class, args);
	}
}
