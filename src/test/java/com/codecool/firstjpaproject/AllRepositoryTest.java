package com.codecool.firstjpaproject;


import com.codecool.firstjpaproject.entity.Series;
import com.codecool.firstjpaproject.repository.SeriesRepository;
import org.junit.ClassRule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
@DataJpaTest
@ActiveProfiles("test")
public class AllRepositoryTest {

    @Autowired
    private SeriesRepository seriesRepository;

    @Autowired
    private TestEntityManager entityManager;

    @Test
    public void createOneSeries(){
        Series temp = Series.builder()
                .releaseDate(LocalDate.of(1990,6,6))
                .title("temp")
                .build();
        seriesRepository.save(temp);
        List<Series> serieses = seriesRepository.findAll();
        assertThat(serieses).hasSize(1);
    }
}
