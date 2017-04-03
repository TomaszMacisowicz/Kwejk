package com.example.controller;

/**
 * Created by Macu on 2017-03-31.
 */
public class Gif {
    public Gif(String name, String surname, boolean favorite) {
        this.name = name;
        this.surname = surname;
        this.favorite = favorite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    private String name;
    private String surname;
    private boolean favorite;
}
