package org.fizzbuzz.test;

import org.fizzbuzz.FizzBuzz;
import org.fizzbuzz.LineWriter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest implements LineWriter {

    private FizzBuzz fizzBuzz;
    private ArrayList<String> linesWritten;

    @BeforeEach
    void setUp() {
        fizzBuzz = new FizzBuzz(this);

        linesWritten = new ArrayList<>();
    }

    @Test
    void writesContiguousNumbers() {
        fizzBuzz.execute(1, 2);

        assertThat(linesWritten).contains("1", "2");
    }

    @Test
    void writesFizz() {
        fizzBuzz.execute(1, 3);

        assertThat(linesWritten).contains("1", "2", "Fizz");
    }

    @Test
    void writesFizzAndBuzz() {
        fizzBuzz.execute(1, 5);

        assertThat(linesWritten).contains("1", "2", "Fizz", "4", "Buzz");
    }

    @Test
    void writesFizzBuzz() {
        fizzBuzz.execute(13, 16);

        assertThat(linesWritten).contains("13", "14", "FizzBuzz", "16");
    }

    @Override
    public void writeLine(Object line) {
        linesWritten.add(line.toString());
    }
}
