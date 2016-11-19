
public class BuzzRule {

    private final String answer = "Buzz";

    public static boolean isBuzz(int number) {
        return number % 5 == 0;
    }

    public String getAnswer() {
        return answer;
    }
}
