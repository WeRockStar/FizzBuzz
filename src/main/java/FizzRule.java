public class FizzRule implements Rule {

    private final String FIZZ = "Fizz";

    public boolean check(int number) {
        return number % 3 == 0;
    }

    public String getAnswer() {
        return FIZZ;
    }
}