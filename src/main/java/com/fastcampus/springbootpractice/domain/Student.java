package com.fastcampus.springbootpractice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor(staticName = "of")
@Data
public class Student {
    private String name;
    private Integer age;
    private Grade grade;

    public enum Grade {
        A, B, C, D, F
    }
}