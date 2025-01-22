package org.example.springpropertiespropertysources;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import java.util.Arrays;

@SpringBootApplication
public class SpringPropertiesPropertysourcesApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringPropertiesPropertysourcesApplication.class, args);
    }
    @Bean
        public CommandLineRunner commandLineRunner(Environment environment, MyProps myProps) {
            return args -> {
                System.out.println("--------------------------------------");
                System.out.println(Arrays.toString(environment.getActiveProfiles()));
                System.out.println(environment.getProperty("my.props.foo"));
                System.out.println(myProps.getFoo());
                System.out.println(environment.getProperty("my.props.bar"));
                System.out.println(myProps.getBar());
                System.out.println(environment.getProperty("my.props.boo"));
                System.out.println(myProps.getBoo());
                System.out.println("--------------------------------------");
            };
        }
}
