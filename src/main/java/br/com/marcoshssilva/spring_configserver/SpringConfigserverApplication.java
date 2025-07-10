package br.com.marcoshssilva.spring_configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringConfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringConfigserverApplication.class, args);
	}

}
