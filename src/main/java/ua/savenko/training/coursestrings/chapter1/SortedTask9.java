package ua.savenko.training.coursestrings.chapter1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

import static java.util.stream.Collectors.*;

public class SortedTask9 {
    public LinkedHashMap<String, Long> getUniqueWordsCounter(String text) {
        return new Task9().getUniqueWordsCounter(text)
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));
    }
}
