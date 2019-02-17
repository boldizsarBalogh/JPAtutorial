package com.codecool.firstjpaproject.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Episode {
    @Id
    @GeneratedValue
    long id;

    @ManyToOne
    Season season;

    String title;

    LocalDate releaseDate;

}
