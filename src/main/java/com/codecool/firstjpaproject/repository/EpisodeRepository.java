package com.codecool.firstjpaproject.repository;

import com.codecool.firstjpaproject.entity.Episode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EpisodeRepository extends JpaRepository<Episode, Long> {

}
