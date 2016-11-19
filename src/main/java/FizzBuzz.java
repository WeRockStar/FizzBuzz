
public class FizzBuzz {

    public String answer(int number) {
        Rule buzzRule = new BuzzRule();
        FizzRule fizzRule = new FizzRule();
        FizzBuzzRule fizzBuzzRule = new FizzBuzzRule();

        if (fizzBuzzRule.apply(number))
            return fizzBuzzRule.getAnswer();

        if (fizzRule.apply(number)) {
            return fizzRule.getAnswer();
        }

        if (buzzRule.apply(number))
            return buzzRule.getAnswer();

        return Integer.toString(number);
    }
}
