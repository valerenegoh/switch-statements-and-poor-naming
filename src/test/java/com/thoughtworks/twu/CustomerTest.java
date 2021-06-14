package com.thoughtworks.twu;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CustomerTest {
	private static final String GOLD_PATH = "data/";

    private Customer customer = new Customer("Dinsdale Pirhana");

    private Movie movie1 = new Movie("Monty Python and the Holy Grail", MovieType.REGULAR);
	private Movie movie2 = new Movie("Ran", MovieType.REGULAR);
	private Movie movie3 = new Movie("LA Confidential", MovieType.NEW_RELEASE);
	private Movie movie4 = new Movie("Star Trek 13.2", MovieType.NEW_RELEASE);
	private Movie movie5 = new Movie("Wallace and Gromit", MovieType.CHILDRENS);

    @BeforeEach
    public void setUpData(){
       customer.addRental(new Rental (movie1, 3));
       customer.addRental(new Rental (movie2, 1));
       customer.addRental(new Rental (movie3, 2));
       customer.addRental(new Rental (movie4, 1));
       customer.addRental(new Rental (movie5, 6));
   }

    @Test
    public void shouldOutputEmptyStatement() throws Exception {
        Customer customer = new Customer("Golden Shark");
        verifyOutput(customer.getRentalStatement(), "outputEmpty");
    }

    @Test
    public void shouldOutputStatement() throws Exception {
        verifyOutput(customer.getRentalStatement(), "output1");
    }

    @Test
    public void shouldOutputChangedStatement() throws Exception {
        movie3.setType(MovieType.REGULAR);
        verifyOutput(customer.getRentalStatement(), "outputChange");
    }

    protected void verifyOutput(String actualValue, String fileName) throws IOException{
        String filePath = getClass().getClassLoader().getResource(GOLD_PATH + fileName).getPath();
        BufferedReader file = new BufferedReader (new FileReader (filePath));
        BufferedReader actualStream = new BufferedReader (new StringReader (actualValue));
        String thisFileLine;
        while ((thisFileLine = file.readLine()) != null) {
            assertEquals(actualStream.readLine(), thisFileLine, "in file: " + fileName);
        }
    }
}