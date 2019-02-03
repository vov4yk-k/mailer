package com.itprosteer.mailer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MailerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MailerApplication.class, args);
	}

	/*@Bean
	CommandLineRunner init(final ClientRepository clientRepository, PasswordEncoder passwordEncoder) {

		return new CommandLineRunner() {

			@Override
			public void run(String... arg0) throws Exception {

				Client cl = new Client();
				cl.setUsername("1eska");
				cl.setPassword(passwordEncoder.encode("123456789"));

				clientRepository.save(cl);

			}

		};

	}*/
}

