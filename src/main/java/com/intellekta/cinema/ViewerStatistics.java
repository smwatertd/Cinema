package com.intellekta.cinema;

import java.util.List;

public class ViewerStatistics {
    public static double averageAge(List<Viewer> viewers) {
        return viewers.stream()
                .mapToInt(Viewer::getAge)
                .average()
                .orElse(0.0);
    }
}
