package com.codecool.firstjpaproject.entity;


import lombok.*;

import javax.persistence.*;
import java.util.List;

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
    private Series series;

    @Singular
    @ElementCollection
    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "season", cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
    private List<Episode> episodes;



}
