package com.manning.sbip.ch02.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Course {
    private int id;
    private String name;
    private String category;

    @Min(value = 1, message = "A course should have a minimum of 1 rating")
    @Max(value = 5, message = "A course should have a maximum of 5 rating")
    private int rating;
    private String description;
}
