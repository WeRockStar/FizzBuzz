
public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String FIZZ_BUZZ = "FizzBuzz";

    public String answer(int number) {
        if (isFizz(number) && number % 5 == 0)
            return FIZZ_BUZZ;

        if (isFizz(number)) {
            return FIZZ;
        }

        if (number % 5 == 0)
            return BUZZ;

        return Integer.toString(number);
    }

    private boolean isFizz(int number) {
        return number % 3 == 0;
    }
}
