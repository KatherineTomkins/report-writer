package student.report.evals;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Orderer {

    public Map<String, Integer> order(final Map<String, Integer> countedScores) {
        return countedScores.entrySet().stream().sorted((Map.Entry.<String, Integer> comparingByValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
    }

}
