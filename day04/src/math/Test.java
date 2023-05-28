package math;

public class Test {
    public static void main(String[] args) {
//        public static int abs(int a) //返回参数的绝对值
        System.out.println(Math.abs(-90));
        System.out.println(Math.abs(90));

//        public static double ceil(double a)  //向上取整
        System.out.println(Math.ceil(9.3));

//        public static double floor(double a)  //向下取整
        System.out.println(Math.floor(9.9));

//        public static int round(float a)  //四舍五入
        System.out.println(Math.round(9.3f));

        System.out.println(Math.max(1, 2));
        System.out.println(Math.min(1, 2));

//        public static double pow(double a, double b)  //a的b 次幂
        System.out.println(Math.pow(2, 99));

//        public static double random()   //[0.0, 1.0) 随机数
        System.out.println(Math.random());
    }
}
