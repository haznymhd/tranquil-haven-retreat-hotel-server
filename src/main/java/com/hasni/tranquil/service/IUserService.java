package com.hasni.tranquil.service;

import com.hasni.tranquil.model.User;

import java.util.List;

/**
 * @author Hasni
 */

public interface IUserService {
    User registerUser(User user);
    User registerEditor(User user);
    User registerAdmin(User user);
    List<User> getUsers();
    void deleteUser(String email);
    User getUser(String email);
}
