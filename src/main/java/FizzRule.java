public class FizzRule implements Rule {

    private final String FIZZ = "Fizz";

    public boolean apply(int number) {
        return number % 3 == 0;
    }

    public String getAnswer() {
        return FIZZ;
    }
}