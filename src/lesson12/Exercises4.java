package lesson12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Exercises4 {
    public static void main(String[] args) throws ParseException {
        var nextYear = Calendar.getInstance().get(Calendar.YEAR) + 1;   //năm hiện tại + 1 = năm tiếp theo
        var format = "dd/MM/yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        //thời gian ngày đầu tiên của năm kế tiếp
        var nextTime = dateFormat.parse("01/01/" + nextYear).getTime();
        var result = (nextTime - new Date().getTime()) / (1000 * 60 * 60 * 24);
        System.out.println("SỐ ngày còn lại kết thúc năm là: " + result);

    }
}
