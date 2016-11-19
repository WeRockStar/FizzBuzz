
public class FizzBuzz {
    public String answer(int number) {

        BuzzRule buzzRule = new BuzzRule();
        FizzRule fizzRule = new FizzRule();
        FizzBuzzRule fizzBuzzRule = new FizzBuzzRule();

        if (fizzBuzzRule.isFizzBuzz(number))
            return fizzBuzzRule.getFizzBuzz();

        if (fizzRule.isFizz(number)) {
            return fizzRule.getFizz();
        }

        if (buzzRule.isBuzz(number))
            return buzzRule.getAnswer();

        return Integer.toString(number);
    }
}
