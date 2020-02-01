package cinema;
import com.company.cinema.Movie.Genre;

import static com.company.cinema.Movie.Genre.*;

public class MovieDatabase {
    private static Movie[] movies = {
            new Movie("The Gentlemen", 2019, 8.1, ACTION, CRIME),
            new Movie("Joker", 2019, 8.6, CRIME, DRAMA, THRILLER),
            new Movie("Last Christmas", 2019, 6.5, COMEDY, DRAMA, ROMANCE),
            new Movie("Avengers: Infinity War", 2018, 8.5, ACTION, ADVENTURE, SCI_FI),
            new Movie("A Star Is Born", 2018, 7.7, DRAMA, MUSIC, ROMANCE),
            new Movie("Logan", 2017, 8.1, ACTION, DRAMA, SCI_FI),
            new Movie("Blade Runner 2049", 2017, 8.0, ACTION, DRAMA, MYSTERY),
            new Movie("The Martian", 2015, 8.0, ADVENTURE, DRAMA, SCI_FI),
            new Movie("Mad Max: Fury Road", 2015, 8.1, ACTION, ADVENTURE, SCI_FI),
            new Movie("Guardians of the Galaxy", 2014, 8.0, ACTION, ADVENTURE, COMEDY),
            new Movie("Star Trek Into Darkness", 2013, 7.7, ACTION, ADVENTURE, SCI_FI),
            new Movie("Inception", 2010, 8.8, ACTION, ADVENTURE, SCI_FI),
            new Movie("Harry Potter and the Deathly Hallows: Part 2", 2010, 8.1, ADVENTURE, DRAMA, FANTASY),
            new Movie("Star Trek", 2009, 7.9, ADVENTURE, DRAMA, SCI_FI),
            new Movie("Sherlock Holmes", 2009, 7.6, ACTION, ADVENTURE, CRIME)
    };

    public static void listAllMovies() {
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }

    public static void printOldestMovie() {
        int oldestYear = movies[0].getYear();
        Movie oldestMovie = movies[0];

        for (int i = 1; i < movies.length; i++) {
            int year = movies[i].getYear();

            if (year < oldestYear) {
                oldestYear = year;
                oldestMovie = movies[i];
            }
        }

        System.out.println(oldestMovie);
    }

    public static void printMoviesByGenre(Genre genre) {
        for (Movie movie : movies) {
            boolean hasGenre = false;
            for (Genre aGenre : movie.getGenres()) {
                if (aGenre == genre)
                    hasGenre = true;
            }

            if (hasGenre)
                System.out.println(movie);
        }
    }

    public static void printMovieWithTheHighestRating() {
        Movie result = movies[0];
        for (Movie movie : movies) {
            if (movie.getRating() > result.getRating()) {
                result = movie;
            }
        }
        System.out.println(result);
    }

    public static void printMoviesWithYearInRange(int start, int endInclusive) {
        Range range = new Range(start, endInclusive);

        for (Movie movie : movies) {
            int year = movie.getYear();
            if (range.containsInclusive(year)) {
                System.out.println(movie);
            }
        }
    }

    public static void printMoviesWithRatingInRange(int lower, int upper) {
        Range range = new Range(lower, upper - 1);
        for (Movie movie: movies) {
            int rating = (int) movie.getRating();
            if (range.containsInclusive(rating)) {
                System.out.println(movie);
            }
        }
    }

    public static void printMoviesWithSearch(String searchString) {

        searchString = searchString.toUpperCase();

        for (Movie movie: movies) {
            String name = movie.getName().toUpperCase();
            if (name.contains(searchString)) {
                System.out.println(movie);
            }
        }
    }

    public static void main(String... args) {
        //listAllMovies();
        //printOldestMovie();
        //printMoviesByGenre(FANTASY);
        //printMovieWithTheHighestRating();
        //printMoviesWithYearInRange(2015, 2016);
        //printMoviesWithRatingInRange(7, 8);
        printMoviesWithSearch("star trek");
    }
}

