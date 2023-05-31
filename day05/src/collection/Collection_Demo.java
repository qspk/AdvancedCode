package collection;

import java.util.ArrayList;
import java.util.Collection;

public class Collection_Demo {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList();
        list.add("小壹");
        list.add("小贰");
        list.add("小叁");
        list.add("小肆");

        System.out.println(list.remove("小叁"));
        System.out.println(list);

        if (list.contains("小贰")) {
            list.remove("小贰");
        }

        System.out.println(list);

        System.out.println(list.isEmpty());

        list.removeIf(s -> s.contains("小"));
        System.out.println(list);

        list.clear();
        System.out.println(list);
        System.out.println(list.isEmpty());

        System.out.println(list.size());
    }
}
