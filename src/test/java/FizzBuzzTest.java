import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() throws Exception {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void answer_given_1_return_1() throws Exception {
        String actual = fizzBuzz.answer(1);
        assertEquals("1", actual);
    }

    @Test
    public void answer_given_2_return_2() throws Exception {
        String actual = fizzBuzz.answer(2);
        assertEquals("2", actual);
    }

    @Test
    public void answer_given_3_return_Fizz() throws Exception {
        String actual = fizzBuzz.answer(3);
        assertEquals(FizzBuzz.FIZZ, actual);
    }

    @Test
    public void answer_given_9_return_Fizz() throws Exception {
        String actual = fizzBuzz.answer(9);
        assertEquals(FizzBuzz.FIZZ, actual);
    }

    @Test
    public void answer_given_5_return_buzz() throws Exception {
        String actual = fizzBuzz.answer(5);
        assertEquals(FizzBuzz.BUZZ, actual);
    }

    @Test
    public void answer_given_10_return_buzz() throws Exception {
        String actual = fizzBuzz.answer(10);
        assertEquals(FizzBuzz.BUZZ, actual);
    }

    @Test
    public void answer_given_15_return_fizz_buzz() throws Exception {
        String actual = fizzBuzz.answer(15);
        assertEquals("FizzBuzz", actual);
    }

    @Test
    public void answer_given_30_return_fizz_buzz() throws Exception {
        String actual = fizzBuzz.answer(30);
        assertEquals("FizzBuzz", actual);
    }
}