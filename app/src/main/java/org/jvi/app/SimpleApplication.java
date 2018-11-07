package org.jvi.app;

import org.jvi.lib.aop.autoconfigure.EnableAspectLogging;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAspectLogging
public class SimpleApplication {

	public static void main(final String[] args) {

		SpringApplication.run(SimpleApplication.class, args);
	}
}
