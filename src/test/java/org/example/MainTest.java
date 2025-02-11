package org.example;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void inputWithinRangeAndMatchFound() {
        String input = "2 50\n10 50\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Main.main(new String[]{});
    }

    @Test
    void inputWithinRangeAndMatchNotFound() {
        String input = "2 50\n10 20\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Main.main(new String[]{});
    }

    @Test
    void inputOutOfRangeFirstNumber() {
        String input = "101 50\n10 20\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Main.main(new String[]{});
    }

    @Test
    void inputOutOfRangeSecondNumber() {
        String input = "2 101\n10 20\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Main.main(new String[]{});
    }

    @Test
    void incorrectNumberOfElements() {
        String input = "2 50\n10\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Main.main(new String[]{});
    }

    @Test
    void inputWithMoreThanTwoNumbers() {
        String input = "2 50 30\n10 20\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Main.main(new String[]{});
    }

    @Test
    void inputWithNonNumericValues() {
        String input = "2 50\n10 abc\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Main.main(new String[]{});
    }
}