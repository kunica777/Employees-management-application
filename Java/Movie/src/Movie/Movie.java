package Movie;
import java.util.Arrays;

public class Movie {

    public enum Genre {
        ACTION, CRIME, DRAMA, THRILLER,
        COMEDY, ROMANCE, ADVENTURE,
        MUSIC, SCI_FI, MYSTERY, FANTASY
    }

    private String name;
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
}
