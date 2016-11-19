
public class BuzzRule implements Rule {

    private final String answer = "Buzz";

    public boolean apply(int number) {
        return number % 5 == 0;
    }

    public String getAnswer() {
        return answer;
    }
}
