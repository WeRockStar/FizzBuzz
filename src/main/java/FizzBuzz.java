import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public String answer(int number) {

        List<Rule> rules = new ArrayList<Rule>();
        rules.add(new FizzBuzzRule());
        rules.add(new FizzRule());
        rules.add(new BuzzRule());

        if (rules.get(0).check(number))
            return rules.get(0).getAnswer();

        if (rules.get(1).check(number)) {
            return rules.get(1).getAnswer();
        }

        if (rules.get(2).check(number))
            return rules.get(2).getAnswer();

        return Integer.toString(number);
    }
}
