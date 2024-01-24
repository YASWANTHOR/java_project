package ComparableComparatorEquals.Comparator;

import java.util.Comparator;

public class Movie {
    private int yearReleased;
    private double rating;
    private double budget;
    private double collectionAmount;

    // Constructor
    public Movie(int yearReleased, double rating, double budget, double collectionAmount) {
        this.yearReleased = yearReleased;
        this.rating = rating;
        this.budget = budget;
        this.collectionAmount = collectionAmount;
    }

    // Getter methods
    public int getYearReleased() {
        return yearReleased;
    }

    public double getRating() {
        return rating;
    }

    public double getBudget() {
        return budget;
    }

    public double getCollectionAmount() {
        return collectionAmount;
    }

    // Comparator for sorting by rating and profit
    public static Comparator<Movie> ratingAndProfitComparator = new Comparator<Movie>() {
        @Override
        public int compare(Movie m1, Movie m2) {
            // First compare by rating, then by profit
            int ratingCompare = Double.compare(m2.rating, m1.rating); // descending order for rating
            if (ratingCompare != 0) return ratingCompare;

            double profit1 = m1.collectionAmount - m1.budget;
            double profit2 = m2.collectionAmount - m2.budget;
            return Double.compare(profit2, profit1); // descending order for profit
        }
    };

    // Comparator for sorting by year released and rating
    public static Comparator<Movie> yearAndRatingComparator = new Comparator<Movie>() {
        @Override
        public int compare(Movie m1, Movie m2) {
            // First compare by year released, then by rating
            int yearCompare = Integer.compare(m1.yearReleased, m2.yearReleased); // ascending order for year
            if (yearCompare != 0) return yearCompare;

            return Double.compare(m1.rating, m2.rating); // ascending order for rating
        }
    };

    // Override toString for easier debugging
    @Override
    public String toString() {
        return "Movie{" +
               "yearReleased=" + yearReleased +
               ", rating=" + rating +
               ", budget=" + budget +
               ", collectionAmount=" + collectionAmount +
               '}';
    }
}

