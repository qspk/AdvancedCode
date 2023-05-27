package simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Demo {
    /**
     * 秒杀开始时间是2020年11月11日 00:00:00,
     * 结束时间是2020年11月11日 00:10:00,
     * 用户小贾下单时间是2020年11月11日 00:03:47,
     * 用户小皮下单时间是2020年11月11日 00:10:11,
     * 判断用户有没有成功参与秒杀活动
     */

    public static void main(String[] args) throws ParseException {
        //1.判断两位同学的下单时间是否在范围之内就可以了。
        //2.要把每一个时间都换算成毫秒值。

        String start = "2020年11月11日 00:00:00";
        String end = "2020年11月11日 00:10:00";

        String jia = "2020年11月11日 00:03:47";
        String pi = "2020年11月11日 00:10:11";

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        long startTime = simpleDateFormat.parse(start).getTime();
        long endTime = simpleDateFormat.parse(end).getTime();

        long jiaTime = simpleDateFormat.parse(jia).getTime();
        long piTime = simpleDateFormat.parse(pi).getTime();

        if (jiaTime >= startTime && jiaTime <= endTime) {
            System.out.println("小贾同学参加上了秒杀活动");
        } else {
            System.out.println("小贾同学没有参加上秒杀活动");
        }
        System.out.println("-----------------------------");
        if (piTime >= startTime && piTime <= endTime) {
            System.out.println("小皮同学参加上了秒杀活动");
        } else {
            System.out.println("小皮同学没有参加上秒杀活动");
        }
    }
}
