package org.tml.esb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude = { HibernateJpaAutoConfiguration.class, MongoAutoConfiguration.class })
public class SpringBootJwtTokenApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJwtTokenApplication.class, args);
	}
}
//Online password encode Bcrypt
//https://www.javainuse.com/onlineBcrypt