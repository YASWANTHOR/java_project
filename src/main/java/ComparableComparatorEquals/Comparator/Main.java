package ComparableComparatorEquals.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creating a list of movies
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie(2010, 8.5, 1000000, 5000000));
        movies.add(new Movie(2012, 9.0, 1500000, 7000000));
        movies.add(new Movie(2010, 7.5, 1200000, 3000000));
        movies.add(new Movie(2015, 8.0, 2000000, 8000000));
        movies.add(new Movie(2012, 8.5, 1800000, 6000000));

        // Sorting by rating and profit
        System.out.println("Movies sorted by rating and profit:");
        Collections.sort(movies, Movie.ratingAndProfitComparator);
        for (Movie movie : movies) {
            System.out.println(movie);
        }

        // Sorting by year released and rating
        System.out.println("\nMovies sorted by year released and rating:");
        Collections.sort(movies, Movie.yearAndRatingComparator);
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }
}

