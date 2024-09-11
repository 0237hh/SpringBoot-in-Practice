package com.manning.sbip.ch03.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity (name = "AUTHOR_COURSE")
@Table (name = "AUTHOR_COURSES")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AuthorCourse {
    @Id
    @Column (name = "author_id")
    private long authorId;

    @Column (name = "course_id")
    private long courseId;
}
