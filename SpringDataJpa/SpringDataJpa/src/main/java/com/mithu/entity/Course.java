package com.mithu.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Course {

    @Id
    private long id;
    private String title;
    private String description;



}
