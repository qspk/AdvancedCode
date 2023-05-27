package JDK8Date;

import java.time.LocalDateTime;
import java.time.Month;

/**
 * public int getYear()获取年
 * public int getMonthValue()获取月份（1-12）
 * public int getDayOfMonth()获取月份中的第几天（1-31）
 * public int getDayOfYear()获取一年中的第几天（1-366）
 * public DayOfWeek getDayOfWeek()获取星期
 * public int getMinute()获取分钟
 * public int getHour()获取小时
 */
public class JDK8DateDemo3 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2023, 05, 25, 22, 11, 11);

        // public int getYear()
        int year = localDateTime.getYear();
        System.out.println("年: " + year);

        //public int getMonthValue()  (1-12)
        int month = localDateTime.getMonthValue();
        Month month1 = localDateTime.getMonth();
        System.out.println("月: " + month + month1);

        //public int getDayOfMonth()   (1-31)
        int day = localDateTime.getDayOfMonth();
        System.out.println("日: " + day);

        //public int getDayOfYear()  (1-366)
        int dayOfYear = localDateTime.getDayOfYear();
        System.out.println("一年中的第 " + dayOfYear + "天");


    }
}
