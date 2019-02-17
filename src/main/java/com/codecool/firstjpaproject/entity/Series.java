package com.codecool.firstjpaproject.entity;


import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
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
    long age;

    LocalDate startDate;

    @OneToMany
    @Singular
    @ElementCollection
    @EqualsAndHashCode.Exclude
    List<Season> seasons;

    public void calculateAge(){
        if(startDate != null) {
            age = ChronoUnit.YEARS.between(startDate,LocalDate.now());
        }
    }


}
