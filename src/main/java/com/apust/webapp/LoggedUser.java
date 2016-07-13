package com.apust.webapp;

import com.apust.webapp.model.Role;

import java.util.Set;

/**
 * Created by GUN
 * on 13.07.2016.
 */
public class LoggedUser {
    protected int id;
    protected Set<Role> roles;
    protected boolean enabled;

    public int getId() {
        return id;
    }
}
