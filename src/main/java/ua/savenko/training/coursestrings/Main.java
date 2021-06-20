package ua.savenko.training.coursestrings;

import ua.savenko.training.coursestrings.chapter1.SortedTask9;
import ua.savenko.training.coursestrings.chapter1.Task4;
import ua.savenko.training.coursestrings.chapter1.Task9;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        demoSortedTask9();
    }

    public static void demoTask4() {
        String source = "Hello world. hello!";
        String substr = "Programmer, ";
        int insertPosition = 13;
        Task4 task4 = new Task4();
        System.out.print(task4.doIt(source, substr, insertPosition));
    }

    public static void demoTask9() {
        String source = "Hello World. hello! Hello all in the World. Hello Stefan, hello Maria and hello other in world.";
        Task9 task9 = new Task9();
        Map<String, Long> wordsCounters = task9.getUniqueWordsCounter(source);
        printMapStringLong(wordsCounters);
    }
    public static void demoSortedTask9(){
        String source = "Hello World. hello! Hello all in the World. Hello Stefan, hello Maria and hello other in world.";
        SortedTask9 sortedTask9 = new SortedTask9();
        
        Map<String, Long> wordsCounters = sortedTask9.getUniqueWordsCounter(source);
        printMapStringLong(wordsCounters);
    }

    private static void printMapStringLong(Map<String, Long> wordsCounters) {
        for (Map.Entry<String, Long> wordCounts : wordsCounters.entrySet()) {
            System.out.println(wordCounts.getKey() + ": " + wordCounts.getValue());
        }
    }
}
