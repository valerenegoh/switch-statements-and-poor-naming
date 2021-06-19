package com.thoughtworks.twu;

public enum MovieType {
    REGULAR {
        @Override
        public double getRentalCost(int days) {
            double rentalCost = BASE_RENTAL_COST_REGULAR;
            if (days > 2) rentalCost += (days - 2) * 1.5;
            return rentalCost;
        }
    },
    NEW_RELEASE {
        @Override
        public double getRentalCost(int days) {
            return BASE_RENTAL_COST_NEW_RELEASE + days * 3;
        }
    },
    CHILDRENS {
        @Override
        public double getRentalCost(int days) {
            double rentalCost = BASE_RENTAL_COST_CHILDREN;
            if (days > 3) rentalCost += (days - 3) * 1.5;
            return rentalCost;
        }
    };

    public static final int BASE_RENTAL_COST_REGULAR = 2;
    public static final double BASE_RENTAL_COST_NEW_RELEASE = 0;
    public static final double BASE_RENTAL_COST_CHILDREN = 1.5;

    public abstract double getRentalCost(int days);
}