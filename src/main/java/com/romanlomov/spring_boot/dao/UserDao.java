package com.romanlomov.spring_boot.dao;

import com.romanlomov.spring_boot.model.User;

import java.util.List;

public interface UserDao {
    void saveNewUser(User user);

    void saveExistingUser(User user);

    List<User> listUsers();

    User getUser(long id);

    void deleteUser(long id);
}
