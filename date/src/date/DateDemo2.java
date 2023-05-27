package date;

import java.util.Date;

public class DateDemo2 {

    /*public long getTime()获取的是日期对象从1970年1月1日 00:00:00到现在的毫秒值
    public void setTime(long time)设置时间，给的是毫秒值 ,从起始时间开始
    */
    public static void main(String[] args) {
        Date d = new Date();

        System.out.println(d.getTime());

        long time = 1000 * 60 * 60;
        time = System.currentTimeMillis();
        d.setTime(time);

        System.out.println(d);
        System.out.println(d.getTime());
    }
}
