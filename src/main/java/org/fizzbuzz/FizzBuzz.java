package org.fizzbuzz;

import java.util.stream.IntStream;

public final class FizzBuzz {
    private final LineWriter lineWriter;

    public FizzBuzz(LineWriter lineWriter) {
        this.lineWriter = lineWriter;
    }

    public void execute(int start, int end) {
        IntStream.rangeClosed(start, end)
                .mapToObj(
                        i -> i % 3 == 0 ?
                                (i % 5 == 0 ? "FizzBuzz" : "Fizz") :
                                (i % 5 == 0 ? "Buzz" : i))
                .forEach(lineWriter::writeLine);
    }
}
