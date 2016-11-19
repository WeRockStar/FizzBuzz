public class FizzBuzzRule implements Rule {

    private final String FIZZ_BUZZ = "FizzBuzz";
    private Rule buzzRule = new BuzzRule();
    private FizzRule fizzRule = new FizzRule();

    public boolean apply(int number) {
        return buzzRule.apply(number) && fizzRule.apply(number);
    }

    public String getAnswer() {
        return FIZZ_BUZZ;
    }
}