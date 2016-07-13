package com.apust.webapp.service;

import com.apust.webapp.model.User;
import com.apust.webapp.repository.UserRepository;
import com.apust.webapp.util.exception.NotFoundException;

import java.util.List;

/**
 * Created by GUN
 * on 13.07.2016.
 */
public class UserServiceImpl implements UserService {

    private UserRepository repository;

    @Override
    public User save(User user) {
        return null;
    }

    @Override
    public void delete(int id) throws NotFoundException {

    }

    @Override
    public User get(int id) throws NotFoundException {
        return null;
    }

    @Override
    public User getByEmail(String email) throws NotFoundException {
        return null;
    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public void update(User user) throws NotFoundException {

    }
}
