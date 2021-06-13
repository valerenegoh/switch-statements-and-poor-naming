package com.thoughtworks.twu;

import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Rental> list = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental rental) {
        list.add(rental);
    }

    public String getRentalStatement() {
        double total = 0;
        int pts = 0;
        StringBuilder result = new StringBuilder("Rental Record for " + name + "\n");

        for (Rental r : list) {
            total += r.getRentalCost();
            pts += r.getFrequentRenterPoints();
            result.append(r.print());
        }

        result.append(footer(total, pts));
        return result.toString();
    }

    private String footer(double totalAmount, int pts) {
        return String.format("Amount owed is %s\nYou earned %d frequent renter points", totalAmount, pts);
    }
}
