import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void answer_given_1_return_1() throws Exception {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String actual = fizzBuzz.answer(1);

        assertEquals("1", actual);
    }

    @Test
    public void answer_given_2_return_2() throws Exception {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String actual = fizzBuzz.answer(2);

        assertEquals("2", actual);
    }
}