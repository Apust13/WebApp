package com.apust.webapp.model;

/**
 * Created by GUN
 * on 13.07.2016.
 */
public class BaseEntity {

    protected Integer id;

    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getId() {
        return id;
    }


    public boolean isNew() {
        return (this.id == null);
    }
}
