package cv.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//https://github.com/dragerot/cv
//$ gradle build && java -jar build/libs/cv-1.0.jar
@SpringBootApplication
@RestController
public class Application {

    @RequestMapping("/")
    public String home() {
        return "Hello Docker World";
    }


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
