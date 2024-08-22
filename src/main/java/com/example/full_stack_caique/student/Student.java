package com.example.full_stack_caique.student;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor

public class Student {

    private Long id;
    private String name;
    private String email;
    private Gender gender;
}
