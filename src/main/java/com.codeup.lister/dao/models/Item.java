package com.codeup.lister.dao.models;

import java.io.Serializable;

public class Item implements Serializable {

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private long id;
    private String name;

    public Item() {};

    public Item(String name) {
        this.name = name;
    }

    public Item(long id, String name) {
        this.id = id;
        this.name = name;
    }

}
