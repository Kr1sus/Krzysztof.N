package pl.coderslab.projectgymzal2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Projectgymzal2Application extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Projectgymzal2Application.class);
    }
    public static void main(String[] args) {
        SpringApplication.run(Projectgymzal2Application.class, args);
    }

}
