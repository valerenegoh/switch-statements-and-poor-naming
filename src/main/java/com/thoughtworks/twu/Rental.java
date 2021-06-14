package com.thoughtworks.twu;

public class Rental {

    private Movie movie;

    private int days;
    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.days = daysRented;
    }

    int getFrequentRenterPoints() {
        return isEligibleForBonus() ? 2 : 1;
    }

    boolean isEligibleForBonus() {
        return (movie.getType() == MovieType.NEW_RELEASE) && days > 1;
    }

    double getRentalCost() {
        return movie.getType().getRentalCost(days);
    }

    public String getMovieTitle() {
        return movie.getTitle();
    }
}