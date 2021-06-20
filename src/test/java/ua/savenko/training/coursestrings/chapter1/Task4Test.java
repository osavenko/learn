package ua.savenko.training.coursestrings.chapter1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {

    private Task4 task4;

    @BeforeEach
    void setUp() {
        task4 = new Task4();
    }

    @Test
    void givenSourceSubstrPositionNegative_whenDoIt_thenIllegalArgumentException() {
        String source = "Hello word!";
        String substr = "good ";
        int position = -1;

        Throwable throwable = assertThrows(IllegalArgumentException.class, () -> {
            String actuall = task4.doIt(source, substr, position);
        });

        assertTrue(throwable.getMessage().contains("Position is negative"));
    }

    @Test
    void givenSourceSustrNullPosition_whenDoIt_thenSomeText() {
        String source = "good ";
        String substr = null;
        int position = 6;
        String expected = "good ";

        String actuall = task4.doIt(source, substr, position);

        assertEquals(expected, actuall);
    }

    @Test
    void givenSourceNullSustrPosition_whenDoIt_thenSomeText() {
        String source = null;
        String substr = "good ";
        int position = 6;
        String expected = "good ";

        String actuall = task4.doIt(source, substr, position);

        assertEquals(expected, actuall);
    }

    @Test
    void givenSourceSubstrPosition_whenDoIt_thenSomeText() {
        String source = "Hello word!";
        String substr = "good ";
        int position = 6;
        String expected = "Hello good word!";

        String actuall = task4.doIt(source, substr, position);

        assertEquals(expected, actuall);
    }
}