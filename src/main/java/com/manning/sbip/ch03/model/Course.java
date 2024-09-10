package com.manning.sbip.ch03.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "COURSES")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
//@NamedQuery(name = "Course.finaAllByCategoryAndRating",
//            query = "select c from Course c where c.category=?1 and c.rating=?2")
@NamedQueries({
        @NamedQuery(name = "Course.finaAllByCategoryAndRating",
                    query = "select c from Course c where c.rating=?1"),
        @NamedQuery(name = "Course.finaAllByCategoryAndRating",
                    query = "select c from Course c where c.category=?1 and c.rating=?2")
})
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

}
