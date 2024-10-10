package com.intellekta.cinema;

class Cinema {
    private String title;
    private String genre;
    private double durationHours;

    public Cinema(String title, String genre, double durationHours) {
        this.title = title;
        this.genre = genre;
        this.durationHours = durationHours;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public double getDurationHours() {
        return durationHours;
    }
}
