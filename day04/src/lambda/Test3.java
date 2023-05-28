package lambda;

/**
 *   带参有返回值
 */
interface Addable {
    int add(int x, int y);
}

public class Test3 {
    public static void main(String[] args) {
        useAddable(new Addable() {
            @Override
            public int add(int x, int y) {
                return x + y;
            }
        });

        useAddable((x, y) -> x + y);
//        useAddable(Integer::sum);
    }

    public static void useAddable(Addable addable) {
        System.out.println(addable.add(3, 5));
    }
}
