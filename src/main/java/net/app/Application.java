package net.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//https://github.com/dragerot/cv
//$ gradle build && java -jar build/libs/cv-1.0.jar
//Dette er en test
@SpringBootApplication(scanBasePackages = "net")
//@Configuration @EnableAutoConfiguration @ComponentScan
public class Application {

  public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
