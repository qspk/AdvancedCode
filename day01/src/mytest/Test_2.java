package mytest;

import java.util.ArrayList;

public class Test_2 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("ew");
        System.out.println(strings.remove(""));
        System.out.println(strings.remove("ew"));

    }
}
