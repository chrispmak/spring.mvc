package config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

/**
 * Created by ponyboy on 10/1/2016.
 */
@SpringBootApplication
@ComponentScan("controller")
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}
