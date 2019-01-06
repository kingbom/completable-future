package com.kingbom.completablefuture.service;

import com.kingbom.completablefuture.model.User;

public class UserService {

    public void setFirstNameAndLastName(String firstName, String lastName) {
        User user = new User(firstName, lastName);
    }
}
