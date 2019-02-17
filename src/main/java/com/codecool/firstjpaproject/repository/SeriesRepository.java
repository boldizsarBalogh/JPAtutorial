package com.codecool.firstjpaproject.repository;

import com.codecool.firstjpaproject.entity.Series;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeriesRepository extends JpaRepository<Series, Long> {

}
