package com.vsu.by;

import com.vsu.by.generation.entities.category.CategoryGenerator;
import com.vsu.by.generation.entities.human.NameGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.io.IOException;

@SpringBootApplication
@EnableJpaRepositories
@EntityScan
public class App {
    public static void main(String[] args) throws IOException {
        NameGenerator gen = new NameGenerator();
        System.out.println(gen.generate());
        SpringApplication.run(App.class, args);
    }
}
