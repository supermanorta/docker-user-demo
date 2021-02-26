package com.tefnick.userservice.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class UserDTO {
    public Boolean success;
    public String[] errors;
    public List<User> users;
}
