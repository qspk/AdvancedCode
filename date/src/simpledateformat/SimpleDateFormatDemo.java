package simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
        //格式化: 从Date 到 String
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat();
        System.out.println(sdf);

        sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String s = sdf.format(d);
        System.out.println(s);
        System.out.println("-----------------------");

        //从 String 到 Date
        String ss = "2023-05-25 11:11:11";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        //ParseException
        Date dd = simpleDateFormat.parse(ss);
        System.out.println(dd);

    }
}
