
public class FizzBuzz {
    public String answer(int number) {

        BuzzRule buzzRule = new BuzzRule();
        FizzRule fizzRule = new FizzRule();
        FizzBuzzRule fizzBuzzRule = new FizzBuzzRule();

        if (FizzBuzzRule.isFizzBuzz(number))
            return fizzBuzzRule.getFizzBuzz();

        if (FizzRule.isFizz(number)) {
            return fizzRule.getFizz();
        }

        if (BuzzRule.isBuzz(number))
            return buzzRule.getAnswer();

        return Integer.toString(number);
    }
}
