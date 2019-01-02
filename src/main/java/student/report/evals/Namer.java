package student.report.evals;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Namer {

    public List<String> Name(final Map<String, Integer> orderedScores) {
        final List<String> names = new ArrayList<>();
        for (final Map.Entry<String, Integer> entry : orderedScores.entrySet()) {
            if (entry.getValue() == 0) {
                names.add(entry.getKey());
            }
        }
        orderedScores.values().remove(0);
        final Map.Entry<String, Integer> lowest = orderedScores.entrySet().iterator().next();
        names.add(lowest.getKey());
        return names;
    }
}
