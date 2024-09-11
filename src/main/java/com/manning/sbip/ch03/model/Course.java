package com.manning.sbip.ch03.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity (name = "COURSES")
@Table(name = "COURSES")
@Getter
@Setter
@ToString
public class Course {
    @Id
    @Column
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "NAME")
    private String name;

    @Column (name = "CATEGORY")
    private String category;

    @Column (name = "RATING")
    private int rating;

    @Column (name = "DESCRIPTION")
    private String description;

    @ManyToMany (mappedBy = "courses")
    private Set<Author> authors = new HashSet<>();

    public Course() {}

    public Course(String name, String category, int rating, String description) {
        this.name = name;
        this.category = category;
        this.rating = rating;
        this.description = description;
    }
}
