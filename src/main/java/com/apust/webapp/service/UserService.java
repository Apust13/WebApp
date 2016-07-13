package com.apust.webapp.service;

import com.apust.webapp.model.User;
import com.apust.webapp.util.exception.NotFoundException;

import java.util.List;

/**
 * Created by GUN
 * on 13.07.2016.
 */
public interface UserService {

    User save(User user);

    public void delete(int id) throws NotFoundException;

    public User get(int id) throws NotFoundException;

    User getByEmail(String email) throws NotFoundException;

    List<User> getAll();

    void update(User user)throws NotFoundException;

}
