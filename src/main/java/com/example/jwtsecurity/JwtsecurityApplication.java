package com.example.jwtsecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.example.jwtsecurity.entities.Role;
import com.example.jwtsecurity.entities.User;
import com.example.jwtsecurity.repositories.UserRepository;

@SpringBootApplication
public class JwtsecurityApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(JwtsecurityApplication.class, args);
	}

	public void run(String... args) {
		User adminAccount = userRepository.findByRole(Role.ADMIN);
		if (adminAccount == null) {
			User user = new User();

			user.setEmail("admin@mail.com");
			user.setFirstName("admin");
			user.setLastName("admin");
			user.setRole(Role.ADMIN);
			user.setPassword(new BCryptPasswordEncoder().encode("admin"));
			userRepository.save(user);
		}
	}

}
