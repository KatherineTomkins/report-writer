package student.report.main;

import java.util.List;
import java.util.Map;

import student.report.evals.Counter;
import student.report.evals.Namer;
import student.report.evals.Orderer;
import student.report.evals.Splitter;

public class FindStudents {

    Splitter splitter = new Splitter();
    Counter counter = new Counter();
    Orderer orderer = new Orderer();
    Namer namer = new Namer();

    public static void main(final String[] args) {
        final String students =
                "Hello World:NNNY, Student One:YYYY, Test This:0, Student Two:YNNY, Name Yes:YNYY, Student None:NNNN";
        final FindStudents finder = new FindStudents();
        System.out.println(finder.find(students));
    }

    public List<String> find(final String students) {
        final List<String> splitStudents = splitter.split(students);
        final Map<String, Integer> countedScores = counter.count(splitStudents);
        final Map<String, Integer> orderedScores = orderer.order(countedScores);
        final List<String> toBeHelped = namer.name(orderedScores);
        return toBeHelped;
    }

}
