package student.report.evals;

import java.util.Arrays;
import java.util.List;

public class Splitter {

    public List<String> split(final String input) {
        final List<String> splitStudents = Arrays.asList(input.split(","));
        return splitStudents;

    }

}
