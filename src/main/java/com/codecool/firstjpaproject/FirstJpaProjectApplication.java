package com.codecool.firstjpaproject;

import com.codecool.firstjpaproject.entity.Series;
import com.codecool.firstjpaproject.repository.SeriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class FirstJpaProjectApplication {

    @Autowired
    private SeriesRepository seriesRepository;

    public static void main(String[] args) {
        SpringApplication.run(FirstJpaProjectApplication.class, args);
    }

    @Bean
    public CommandLineRunner init() {
        return args -> {
            Series gameOfThrones = Series.builder()
                    .releaseDate(LocalDate.of(2011, 4, 1))
                    .title("Game Of Thrones")
                    .build();
            seriesRepository.save(gameOfThrones);

        };
    }

}
