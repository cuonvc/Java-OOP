package lesson29.LyThuyet.Sort1;
/**
 * cách sắp xếp thứ nhất, không đa dạng như cách 2
 */

import java.util.ArrayList;
import java.util.Collections;

public class Run {
    public static void main(String[] args) {
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Thor", 2021, "ABC", 50, 4.2f));
        movies.add(new Movie("Iron man", 2013, "DEF", 79, 4.3f));
        movies.add(new Movie("Ant Man", 2015, "MNO", 75, 4.5f));
        movies.add(new Movie("Captain Marvel", 2019, "GHI", 59, 4.7f));
        movies.add(new Movie("AVG: Infinity War", 2018, "ONL", 50, 4.9f));
        movies.add(new Movie("AVG: End Game", 2019, "XYZ", 57, 4.7f));


        System.out.println("Trước khi sắp sếp: ");
        showMovie(movies);
        System.out.println("------------------------------------------------");
        System.out.println("Sau khi sắp xếp: ");
        Collections.sort(movies);
        showMovie(movies);
    }

    private static void showMovie(ArrayList<Movie> movies) {
        System.out.printf("%-25s%-10s%-10s%-10s%-10s\n",
                "Tên phim", "Năm SX", "Đạo diễn", "giá vé", "Số sao");
        for (var mv : movies) {
            System.out.printf("%-25s%-10d%-10s%-10.1f%-10.1f\n",
                    mv.getName(), mv.getYear(), mv.getDirector(),
                    mv.getPrice(), mv.getVote());
        }
    }
}
