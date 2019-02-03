package com.itprosteer.mailer;

import com.itprosteer.mailer.model.Client;
import com.itprosteer.mailer.repository.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class MailerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MailerApplication.class, args);
	}

	@Bean
	CommandLineRunner init(final ClientRepository clientRepository, PasswordEncoder passwordEncoder) {

		return new CommandLineRunner() {

			@Override
			public void run(String... arg0) throws Exception {
				if (clientRepository.findByUsername("admin") == null){
					Client newAdmin = new Client();
					newAdmin.setUsername("admin");
					newAdmin.setPassword(passwordEncoder.encode("admin"));
					clientRepository.save(newAdmin);
				}
			}

		};

	}
}

