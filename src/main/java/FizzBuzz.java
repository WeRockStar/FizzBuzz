
public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String FIZZ_BUZZ = "FizzBuzz";

    public String answer(int number) {
        if (isFizzBuzz(number))
            return FIZZ_BUZZ;

        if (isFizz(number)) {
            return FIZZ;
        }

        if (isBuzz(number))
            return BUZZ;

        return Integer.toString(number);
    }

    private boolean isFizzBuzz(int number) {
        return isFizz(number) && isBuzz(number);
    }

    private boolean isBuzz(int number) {
        return number % 5 == 0;
    }

    private boolean isFizz(int number) {
        return number % 3 == 0;
    }
}
