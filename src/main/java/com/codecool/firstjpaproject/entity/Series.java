package com.codecool.firstjpaproject.entity;


import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Series {

    @Id
    @GeneratedValue
    long id;

    String title;

    @ElementCollection
    @Singular
    List<Genre> genres = new ArrayList<>();

    @Transient
    int age;

    LocalDate releaseDate;


}
