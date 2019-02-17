package com.codecool.firstjpaproject.repository;

import com.codecool.firstjpaproject.entity.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre, Long> {
}
