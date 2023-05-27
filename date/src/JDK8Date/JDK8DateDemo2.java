package JDK8Date;

import java.time.LocalDateTime;

/**
 * - LocalDate       表示日期（年月日）
 * - LocalTime       表示时间（时分秒）
 * - LocalDateTime    表示时间+ 日期 （年月日时分秒）
 *
 *
 * public static LocalDateTime now()获取当前系统时间
 * public static LocalDateTime of  (年, 月 , 日, 时, 分, 秒)
 * 使用指定年月日和时分秒初始化一个LocalDateTime对象
 */
public class JDK8DateDemo2 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        LocalDateTime localDateTime = LocalDateTime.of(2023, 11, 11, 11, 11, 11);
        System.out.println(localDateTime);
    }

}
