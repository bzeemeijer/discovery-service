package nl.zeemeijer.tools.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Spring Boot application implementing a Netflix Eureka Discovery Server
 *
 * @author Bjorn Zeemeijer
 */
@SpringBootApplication
@EnableEurekaServer
public class Application {

    /**
     * Main entrypoint of the application.
     *
     * @param args arguments passed to the application
     */
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
