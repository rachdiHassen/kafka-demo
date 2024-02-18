package com.hassen.kafka.payload;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@ToString
public class Student {
    private int id;
    private String name;
    private String lastName;
}
