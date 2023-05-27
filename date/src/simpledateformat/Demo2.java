package simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Demo2 {
    //    三天打鱼两天晒网，1990-01-01开始打渔，
//    给出一个日期，输出当天是在打鱼还是晒网，如2022-02-05
    public static void main(String[] args) throws ParseException {

        String startDate = "1990-01-01";
        String endDate = "2020-02-18";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        long startTime = sdf.parse(startDate).getTime();
        long ensTime = sdf.parse(endDate).getTime();

        int dayNum = (int) ((ensTime - startTime) / (1000 * 60 * 60 * 24));

        int result = dayNum % 3;
        if (result == 1) {
            System.out.println(endDate + " 在打渔");
        } else {
            System.out.println(endDate + " 在晒网");

        }
    }
}
