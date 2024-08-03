package com.romanlomov.spring_boot.service;

import java.util.List;
import com.romanlomov.spring_boot.model.User;

public interface UserService {
    void saveNewUser(User user);

    void saveExistingUser(User user);

    List<User> listUsers();

    User getUser(long id);

    void deleteUser(long id);
}
