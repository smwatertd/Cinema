package com.intellekta.cinema;

import java.util.List;

public class Viewer {
    private String nickname;
    private int age;
    private List<Cinema> watchedMovies;

    public Viewer(String nickname, int age, List<Cinema> watchedMovies) {
        this.nickname = nickname;
        this.age = age;
        this.watchedMovies = watchedMovies;
    }

    public int getAge() {
        return age;
    }

    public List<Cinema> getWatchedMovies() {
        return watchedMovies;
    }

    public int getMoviesWatchedCount() {
        return watchedMovies.size();
    }

    public String getNickname() {
        return this.nickname;
    }
}