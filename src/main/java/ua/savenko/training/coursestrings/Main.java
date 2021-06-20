package ua.savenko.training.coursestrings;

import ua.savenko.training.coursestrings.chapter1.Task4;

public class Main {
    public static void main(String[] args) {
        demoTask4();
    }

    public static void demoTask4() {
        String source = "Hello world. hello!";
        String substr = "Programmer, ";
        int insertPosition = 13;
        Task4 task4 = new Task4();
        System.out.print(task4.doIt(source, substr, insertPosition));
    }

}
