package com.apust.webapp.repository;

import com.apust.webapp.model.User;

import java.util.List;

/**
 * Created by GUN
 * on 13.07.2016.
 */
public interface UserRepository {
    User save(User user);

    //false if not
    boolean delete(int id);

    // null if not found
    User get(int id);

    //null if not found
    User getByEmail(String email);

    List<User> getAll();
}
