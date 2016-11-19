import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public String answer(int number) {

        List<Rule> rules = new ArrayList<Rule>();
        rules.add(new FizzBuzzRule());
        rules.add(new FizzRule());
        rules.add(new BuzzRule());

        for (Rule rule : rules) {
            if (rule.check(number))
                return rule.getAnswer();
        }
        return Integer.toString(number);
    }
}
