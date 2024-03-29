package com.boljshoj.Logistic.domain;

import com.boljshoj.Logistic.util.EntityIdResolver;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@JsonIdentityInfo(
        property = "id",
        generator = ObjectIdGenerators.PropertyGenerator.class,
        scope = Model.class,
        resolver = EntityIdResolver.class
)
public class Model implements ComboListItem{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @ManyToOne
    @JsonIdentityReference(alwaysAsId = true)
    private Mark mark;
}
