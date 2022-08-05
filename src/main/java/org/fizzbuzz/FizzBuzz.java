package org.fizzbuzz;

public final class FizzBuzz {
    private final LineWriter lineWriter;

    public FizzBuzz(LineWriter lineWriter) {
        this.lineWriter = lineWriter;
    }

    public void execute(int start, int end) {
        int i = start;
        while (i <= end) {
            if (i % 3 == 0) {
                lineWriter.writeLine("Fizz");
            } else if (i % 5 == 0) {
                lineWriter.writeLine("Buzz");
            } else {
                lineWriter.writeLine(i);
            }

            ++i;
        }
    }
}
