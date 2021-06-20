package ua.savenko.training.coursestrings.chapter1;
import static  java.util.stream.Collectors.*;

import java.util.Arrays;
import java.util.LinkedHashMap;


public class Task9 {

    public LinkedHashMap<String, Long> getUniqueWordsCounter(String text){
        return Arrays.stream(text.split("\\W+"))
                .collect(toList())
                .stream()
                .collect(groupingBy(word -> word, LinkedHashMap::new, counting()));
    }
}
