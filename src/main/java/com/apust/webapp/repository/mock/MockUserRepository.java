package com.apust.webapp.repository.mock;

import com.apust.webapp.LoggerWrapper;
import com.apust.webapp.model.User;
import com.apust.webapp.repository.UserRepository;

import java.util.List;

/**
 * Created by GUN
 * on 13.07.2016.
 */
public class MockUserRepository implements UserRepository {

    private static final LoggerWrapper LOG = LoggerWrapper.get(MockUserRepository.class);

    @Override
    public User save(User user) {
        LOG.info("Save " + user);
        return null;
    }

    @Override
    public boolean delete(int id) {
        LOG.info("Delete " + id);
        return true;
    }

    @Override
    public User get(int id) {
        return null;
    }

    @Override
    public User getByEmail(String email) {
        return null;
    }

    @Override
    public List<User> getAll() {
        return null;
    }
}
