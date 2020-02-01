package cinema;

import java.util.Arrays;

public class Movie {

    public enum Genre {
        ACTION, CRIME, DRAMA, THRILLER,
        COMEDY, ROMANCE, ADVENTURE,
        MUSIC, SCI_FI, MYSTERY, FANTASY
    }

    final private String name;
    private int year;
    private double rating;
    private Genre[] genres;

    public Movie(String name, int year, double rating, Genre... genres) {
        this.name = name;
        this.year = year;
        this.rating = rating;
        this.genres = Arrays.copyOf(genres, genres.length);
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public double getRating() {
        return rating;
    }

    public Genre[] getGenres() {
        return Arrays.copyOf(genres, genres.length);
    }

    // Alt + Ins
    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", rating=" + rating +
                ", genres=" + Arrays.toString(genres) +
                '}';
    }
}

