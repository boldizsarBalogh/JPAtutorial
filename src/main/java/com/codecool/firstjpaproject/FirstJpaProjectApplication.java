package com.codecool.firstjpaproject;

import com.codecool.firstjpaproject.entity.Genre;
import com.codecool.firstjpaproject.entity.GenreName;
import com.codecool.firstjpaproject.entity.Series;
import com.codecool.firstjpaproject.repository.GenreRepository;
import com.codecool.firstjpaproject.repository.SeriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import java.time.LocalDate;
import java.util.Arrays;

@SpringBootApplication
public class FirstJpaProjectApplication {

    @Autowired
    private SeriesRepository seriesRepository;

    @Autowired
    private GenreRepository genreRepository;

    public static void main(String[] args) {
        SpringApplication.run(FirstJpaProjectApplication.class, args);
    }

    @Bean
    public CommandLineRunner init() {
        return args -> {

            Genre genre1 = Genre.builder()
                    .name(GenreName.ACTION)
                    .build();
            genreRepository.save(genre1);
            Genre genre2 = Genre.builder()
                    .name(GenreName.DRAMA)
                    .build();
            genreRepository.save(genre2);
            Series gameOfThrones = Series.builder()
                    .releaseDate(LocalDate.of(2011, 4, 1))
                    .title("Game Of Thrones")
                    .genres(Arrays.asList(genre1,genre2))
                    .build();
            seriesRepository.save(gameOfThrones);

        };
    }

}
