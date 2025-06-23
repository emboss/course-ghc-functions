package copilot.workshop;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import static copilot.workshop.Functions.filterOdds;
import static copilot.workshop.Functions.reverse;;

public class FunctionsTest {

    @Test
    void testReverse() {
        assertEquals("olleH", reverse("Hello"));
        assertEquals("!dlroW ,olleH", reverse("Hello, World!"));
        assertEquals("", reverse(""));
        assertEquals("a", reverse("a"));
    }

    @Test
    void testFilterOdds() {
        assertEquals("[2, 4, 6]", filterOdds(List.of(1, 2, 3, 4, 5, 6)).toString());
        assertEquals("[]", filterOdds(List.of(1, 3, 5)).toString());
    }

    @Test
    void testIsPrime() {
        Functions functions = new Functions();
        assertEquals(true, functions.isPrime(2));
        assertEquals(true, functions.isPrime(3));
        assertEquals(false, functions.isPrime(4));
        assertEquals(true, functions.isPrime(5));
        assertEquals(false, functions.isPrime(1));
        assertEquals(false, functions.isPrime(-3));
        assertEquals(true, functions.isPrime(101));
    }
}