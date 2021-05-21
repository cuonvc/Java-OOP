package lesson29.LyThuyet.Sort1;

public class Movie implements Comparable<Movie> {
    private String name;
    private int year;
    private String director;
    private float price;
    private float vote;

    public Movie() {
    }

    public Movie(String name, int year,
                 String director, float price, float vote) {
        this.name = name;
        this.year = year;
        this.director = director;
        this.price = price;
        this.vote = vote;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getVote() {
        return vote;
    }

    public void setVote(float vote) {
        this.vote = vote;
    }


    @Override
    //sếp theo thứ tự tăng dần của tên phim từ a-z
    //nếu sắp xếp giảm dần từ z-a thì đổi chỗ this.name -> other.name
    public int compareTo(Movie other) {
        return this.name.compareTo(other.name);
    }
}
