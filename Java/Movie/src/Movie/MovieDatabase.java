package Movie;

import static Movie.Movie.Genre.*;

public class MovieDatabase {
    private static Movie[] movies = {
            new Movie("The Gentlemen", 2019, 8.1, ACTION, CRIME),
            new Movie("Joker", 2019, 8.6, CRIME, DRAMA, THRILLER),
            new Movie("Last Christmas", 2019, 6.5, COMEDY, DRAMA, ROMANCE),
            new Movie("Avengers: Infinity War", 2018, 8.5, ACTION, ADVENTURE, SCI_FI),
            new Movie("A Start Is Born", 2018, 7.7, DRAMA, MUSIC, ROMANCE),
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

    public static void main(String... args) {

    }
}
