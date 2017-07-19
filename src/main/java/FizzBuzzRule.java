public class FizzBuzzRule implements Rule {

    private final String FIZZ_BUZZ = "FizzBuzz";
    private Rule buzzRule = new BuzzRule();
    private Rule fizzRule = new FizzRule();

    public boolean check(int number) {
        return buzzRule.check(number) && fizzRule.check(number);
    }

    public String getAnswer() {
        return FIZZ_BUZZ;
    }
}