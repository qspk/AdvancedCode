package bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MyBigDecimal {
    public static void main(String[] args) {
        //传入字符串类型参数  小数类型 计算时仍然会出现不精确问题
        BigDecimal bd1 = new BigDecimal("0.1");
        BigDecimal bd2 = new BigDecimal("0.2");
        BigDecimal bd3 = new BigDecimal("0.3");



        BigDecimal add = bd1.add(bd2);
        BigDecimal subtract = bd1.subtract(bd2);
        BigDecimal multiply = bd1.multiply(bd2);
        BigDecimal divide = bd1.divide(bd2);
        BigDecimal divide1 = bd1.divide(bd2, 2, RoundingMode.CEILING);

        BigDecimal divide2 = bd1.divide(bd3,2,RoundingMode.HALF_UP);
        BigDecimal divide3 = bd1.divide(bd3,2,RoundingMode.UP);


        System.out.println(add);
        System.out.println(subtract);
        System.out.println(multiply);
        System.out.println(divide);
        System.out.println(divide1);
        System.out.println(divide2);
        System.out.println(divide3);
    }
}
