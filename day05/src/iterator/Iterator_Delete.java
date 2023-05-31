package iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/**
 * 集合的删除方法
 */
public class Iterator_Delete {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "a", "a", "b", "b", "c", "c", "d", "d");

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("a")) {
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i).equals("c")) {
                list.remove(i);
            }
        }
        System.out.println(list);

        list.removeIf(s -> s.contains("d"));
        System.out.println(list);


        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().equals("b")) {
                it.remove();
            }
        }
        System.out.println(list);
    }
}
