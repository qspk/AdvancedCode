package lambda;


import java.util.Random;

interface RandomHandler {
    int getNum();
}
public class Test2 {
    public static void main(String[] args) {
        useRandomHandler(new RandomHandler() {
            @Override
            public int getNum() {
                Random r = new Random();
                return r.nextInt(10) + 1;
                //接口方法有返回值,一定要通过return语句将结果返回
                //否则会出现编译错误
            }
        });

        useRandomHandler(() ->{
            Random r = new Random();
            return r.nextInt(10) + 1;
        });


    }

    public static void useRandomHandler(RandomHandler rd) {
        System.out.println(rd.getNum());
    }
}
