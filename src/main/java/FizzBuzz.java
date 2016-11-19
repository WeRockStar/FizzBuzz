
public class FizzBuzz {

    public static final String FIZZ = "Fizz";

    public String answer(int number) {
        if (number == 3) {
            return FIZZ;
        }
        return Integer.toString(number);
    }
}
