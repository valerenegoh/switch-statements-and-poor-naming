package com.thoughtworks.twu;

public enum MovieType {
    REGULAR {
        @Override
        public double getRentalCost(int days) {
            double amount = 2;
            if (days > 2) {
                amount += (days - 2) * 1.5;
            }
            return amount;
        }
    },
    NEW_RELEASE {
        @Override
        public double getRentalCost(int days) {
            return days * 3;
        }
    },
    CHILDRENS {
        @Override
        public double getRentalCost(int days) {
            double amount = 1.5;
            if (days > 3)
                amount += (days - 3) * 1.5;
            return amount;
        }
    };

    public abstract double getRentalCost(int days);
}
