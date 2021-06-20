package ua.savenko.training.coursestrings.chapter1;

public class Task4 {
    public String doIt(String source, String substr, int position) {
        if (source.length() < position) {
            return source + substr;
        }
        StringBuilder rezult = new StringBuilder(source);
        rezult.insert(position, substr);
        return rezult.toString();
    }
}
