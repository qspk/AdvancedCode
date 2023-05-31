package iterator;

import java.util.ArrayList;

public class For_each {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("q");
        list.add("q");
        list.add("q");
        list.add("q");

        for (String s : list) {
            System.out.println(s);
        }
    }
}
