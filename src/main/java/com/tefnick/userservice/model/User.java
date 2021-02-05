package com.tefnick.userservice.model;

import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
@ToString
public class User {
    public String firstName;
    public String lastName;
    public int age;

    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
}
