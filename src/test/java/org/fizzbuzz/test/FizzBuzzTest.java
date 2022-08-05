package org.fizzbuzz.test;

import org.fizzbuzz.FizzBuzz;
import org.fizzbuzz.LineWriter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest implements LineWriter {

    private ArrayList<String> linesWritten;

    @BeforeEach
    void setUp() {
        linesWritten = new ArrayList<>();
    }

    @Test
    void writesContiguousNumbers() {
        new FizzBuzz(this).execute(1, 2);

        assertThat(linesWritten).contains("1", "2");
    }

    @Test
    void writesFizz() {
        new FizzBuzz(this).execute(1, 3);

        assertThat(linesWritten).contains("1", "2", "Fizz");
    }

    @Test
    void writesFizzAndBuzz() {
        new FizzBuzz(this).execute(1, 5);

        assertThat(linesWritten).contains("1", "2", "Fizz", "4", "Buzz");
    }

    @Override
    public void writeLine(Object line) {
        linesWritten.add(line.toString());
    }
}
