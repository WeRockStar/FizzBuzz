public class FizzRule {
    private final String FIZZ = "Fizz";

    public static boolean isFizz(int number) {
        return number % 3 == 0;
    }

    public String getFizz() {
        return FIZZ;
    }
}