package com.intellekta.cinema;

import java.util.Arrays;
import java.util.List;

public class CinemaApplicationRun {
    public static void main(String[] args) {
        List<Viewer> viewers = Arrays.asList(
                new Viewer("User1", 20, 10),
                new Viewer("User2", 25, 15),
                new Viewer("User3", 30, 8),
                new Viewer("User4", 22, 12),
                new Viewer("User5", 27, 9)
        );

        double averageAge = ViewerStatistics.averageAge(viewers);
        System.out.println("Средний возраст пользователей: " + averageAge);
    }
}
