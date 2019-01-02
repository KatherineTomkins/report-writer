package student.report.evals;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Counter {

    public Map<String, Integer> count(final List<String> splitStudents) {
        final Map<String, Integer> transforms = new HashMap<>();
        for (final String item : splitStudents) {
            final String[] t = item.split(":");
            final String tOne = t[1].replace("Y", "2").replace("N", "1");
            final Integer num = String.valueOf(tOne).chars().map(Character::getNumericValue).sum();
            transforms.put(t[0], num);
        }
        return transforms;
    }

}
