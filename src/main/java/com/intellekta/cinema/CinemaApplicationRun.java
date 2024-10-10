package com.intellekta.cinema;

import java.util.Arrays;
import java.util.List;

public class CinemaApplicationRun {
    public static void main(String[] args) {
        Cinema movie1 = new Cinema("The Lord of the Rings", "Fantasy", 3.5);
        Cinema movie2 = new Cinema("Inception", "Science Fiction", 2.8);
        Cinema movie3 = new Cinema("The Matrix", "Action", 2.3);

        List<Cinema> user1Movies = Arrays.asList(movie1, movie2);
        List<Cinema> user2Movies = Arrays.asList(movie2, movie3);
        List<Cinema> user3Movies = Arrays.asList(movie1);
        List<Cinema> user4Movies = Arrays.asList(movie1, movie2, movie3);
        List<Cinema> user5Movies = Arrays.asList(movie3);

        List<Viewer> viewers = Arrays.asList(
                new Viewer("User1", 20, user1Movies),
                new Viewer("User2", 25, user2Movies),
                new Viewer("User3", 30, user3Movies),
                new Viewer("User4", 22, user4Movies),
                new Viewer("User5", 27, user5Movies)
        );

        double averageAge = ViewerStatistics.averageAge(viewers);
        System.out.println("Средний возраст пользователей: " + averageAge);

        // Пример вывода информации о фильмах пользователей
        for (Viewer viewer : viewers) {
            System.out.println(viewer.getNickname() + " просмотрел " + viewer.getMoviesWatchedCount() + " фильмов.");
        }
    }
}
