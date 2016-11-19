import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public String answer(int number) {

        List<Rule> rules = new ArrayList<Rule>();
        rules.add(new FizzBuzzRule());
        rules.add(new FizzRule());
        rules.add(new BuzzRule());

        for(int rule = 0;rule < rules.size();rule++) {
            if (rules.get(rule).check(number))
                return rules.get(rule).getAnswer();
        }
        return Integer.toString(number);
    }
}
