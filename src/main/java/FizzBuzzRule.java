public class FizzBuzzRule {
    private final String FIZZ_BUZZ = "FizzBuzz";
    private BuzzRule buzzRule = new BuzzRule();
    private FizzRule fizzRule = new FizzRule();

    public boolean isFizzBuzz(int number) {
        return buzzRule.isBuzz(number) && fizzRule.isFizz(number);
    }

    public String getFizzBuzz() {
        return FIZZ_BUZZ;
    }
}