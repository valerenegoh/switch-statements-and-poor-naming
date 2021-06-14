package com.thoughtworks.twu;

import java.util.ArrayList;

public class Customer {

    private static final String RENTAL_STATEMENT_HEADER = "Rental Record for %s\n";
    private static final String RENTAL_STATEMENT_ITEM = "\t%s\t%s\n";
    private static final String RENTAL_STATEMENT_FOOTER = "Amount owed is %s\nYou earned %d frequent renter points";

    private String name;
    private ArrayList<Rental> list = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental rental) {
        list.add(rental);
    }

    public String getRentalStatement() {
        double totalCost = 0;
        int points = 0;
        StringBuilder result = new StringBuilder(String.format(RENTAL_STATEMENT_HEADER, name));

        for (Rental rental : list) {
            totalCost += rental.getRentalCost();
            points += rental.getFrequentRenterPoints();
            result.append(String.format(RENTAL_STATEMENT_ITEM, rental.getMovieTitle(), rental.getRentalCost()));
        }

        result.append(String.format(RENTAL_STATEMENT_FOOTER, totalCost, points));
        return result.toString();
    }
}