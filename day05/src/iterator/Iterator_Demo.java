package iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 *  迭代器的使用  hasNext(), next()
 */
public class Iterator_Demo {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();

        list.add("你好");
        list.add("Java");
        list.add("!");

        Iterator<String> it = list.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
