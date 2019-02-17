package com.codecool.firstjpaproject.entity;


import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Season {

    @Id
    @GeneratedValue
    long id;

    int seasonNumber;

    @ManyToOne
    @EqualsAndHashCode.Exclude
    private Series series;

}
