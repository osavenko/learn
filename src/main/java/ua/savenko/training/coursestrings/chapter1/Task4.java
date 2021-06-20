package ua.savenko.training.coursestrings.chapter1;

public class Task4 {
    public String doIt(String source, String substr, int position) {
        if(position<0){
            throw new IllegalArgumentException("Position is negative");
        }
        if (source == null) {
            source = "";
        }
        if (substr == null) {
            substr = "";
        }
        if (source.length() < position) {
            return source + substr;
        }
        StringBuilder rezult = new StringBuilder(source);
        rezult.insert(position, substr);
        return rezult.toString();
    }
}
