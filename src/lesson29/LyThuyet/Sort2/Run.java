package lesson29.LyThuyet.Sort2;

import lesson29.LyThuyet.Sort2.Movie;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Run {
    public static void main(String[] args) {
        ArrayList<lesson29.LyThuyet.Sort2.Movie> movies = new ArrayList<>();
        movies.add(new lesson29.LyThuyet.Sort2.Movie("Thor", 2021, "ABC", 50, 4.2f));
        movies.add(new lesson29.LyThuyet.Sort2.Movie("Iron man", 2013, "DEF", 79, 4.3f));
        movies.add(new lesson29.LyThuyet.Sort2.Movie("Ant Man", 2015, "MNO", 75, 4.5f));
        movies.add(new lesson29.LyThuyet.Sort2.Movie("Captain Marvel", 2019, "GHI", 59, 4.7f));
        movies.add(new lesson29.LyThuyet.Sort2.Movie("AVG: Infinity War", 2018, "ONL", 50, 4.9f));
        movies.add(new lesson29.LyThuyet.Sort2.Movie("AVG: End Game", 2019, "XYZ", 57, 4.7f));


        System.out.println("Trước khi sắp sếp: ");
        showMovie(movies);

        System.out.println("------------------------------------------------");
        System.out.println("Sau khi sắp xếp theo thứ tự tên từ A-z: ");
        Collections.sort(movies, new SortByNameA_Z());
        showMovie(movies);

        System.out.println("-------------------------------------------------");
        System.out.println("Sau khi sắp xếp theo thứ tự tên từ Z-A");
        Collections.sort(movies, new SortByNameZ_A());
        showMovie(movies);

        System.out.println("-------------------------------------------------");
        System.out.println("Sau khi sắp xếp theo năm sản xuất từ cũ đến mới");
        Collections.sort(movies, new SortByYearUp());
        showMovie(movies);

        System.out.println("--------------------------------------------------");
        System.out.println("Sau khi sắp xếp theo năm sản xuất từ mới đến cũ");
        Collections.sort(movies, new SortByYearDown());
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

/**
 * sắp xếp tên từ a-z
 */
class SortByNameA_Z implements Comparator<Movie> {
    @Override
    public int compare(Movie o1, Movie o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

/**
 * sắp xếp tên từ z-a
 */
class SortByNameZ_A implements Comparator<Movie> {
    @Override
    public int compare(Movie o1, Movie o2) {
        return o2.getName().compareTo(o1.getName());
    }
}

/**
 * sắp xếp theo năm sản xuất từ cũ đến mới
 */
class SortByYearUp implements Comparator<Movie> {
    @Override
    public int compare(Movie o1, Movie o2) {
        return o1.getYear() - o2.getYear();
    }
}

/**
 * sắp xếp theo năm sản xuất từ mới đến cũ
 */
class SortByYearDown implements Comparator<Movie> {
    @Override
    public int compare(Movie o1, Movie o2) {
        return o2.getYear() - o1.getYear();
    }
}

//...tương tự với các kiểu sắp xếp với các tiêu chí khác