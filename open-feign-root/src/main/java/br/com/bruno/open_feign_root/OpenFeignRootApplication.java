package br.com.bruno.open_feign_root;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class OpenFeignRootApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenFeignRootApplication.class, args);
	}

}
