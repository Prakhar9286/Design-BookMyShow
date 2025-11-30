package com.example.bookMyShow;

import com.example.bookMyShow.controller.UserController;
import com.example.bookMyShow.dto.userDto.CreateUserRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookMyShowApplication implements CommandLineRunner {

	private UserController userController;

	@Autowired
	BookMyShowApplication(UserController userController) {
		this.userController = userController;
	}

	public static void main(String[] args) {
		SpringApplication.run(BookMyShowApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		CreateUserRequestDto requestDto = new CreateUserRequestDto();
		requestDto.setName("Dubeyji");
		requestDto.setEmail("dubeyji@google.com");

		this.userController.createUser(requestDto);

	}
}
