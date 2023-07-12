package com.springboot.app.msusuarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan({"com.springboot.app.msusuarioscommons.models.entity"})
@SpringBootApplication
public class SpringbootMsUsuariosApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMsUsuariosApplication.class, args);
	}

}
