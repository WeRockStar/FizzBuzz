public class FizzBuzzRule {
    private final String FIZZ_BUZZ = "FizzBuzz";

    public static boolean isFizzBuzz(int number) {
        return BuzzRule.isBuzz(number) && FizzRule.isFizz(number);
    }

    public String getFizzBuzz() {
        return FIZZ_BUZZ;
    }
}