package com.intellekta.cinema;

public class Viewer {
    private String nickname;
    private int age;
    private int watchedMoviesCount;

    public Viewer(String nickname, int age, int watchedMoviesCount) {
        this.nickname = nickname;
        this.age = age;
        this.watchedMoviesCount = watchedMoviesCount;
    }

    public String getNickname() {
        return nickname;
    }

    public int getAge() {
        return age;
    }

    public int getWatchedMoviesCount() {
        return this.watchedMoviesCount;
    }
}