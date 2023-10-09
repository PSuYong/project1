package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@SpringBootApplication
public class SimpleBoardApiApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(SimpleBoardApiApplication.class);
        application.addListeners(new ApplicationPidFileWriter());
        application.run(args);
    }
}

