package lesson13;

import java.lang.ref.Cleaner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class bai13 {
    public static void main(String[] args) {
        var format = "dd/MM/yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        var dateStr = "05/08/2002";
        try {
            Date date = dateFormat.parse(dateStr);
            Calendar calendar = Calendar.getInstance();  //thời điểm chạy chương trình
            calendar.setTime(date);

            System.out.println("Ngày: " + calendar.get(Calendar.DAY_OF_MONTH));
            //vì tháng trong năm sẽ bắt đầu từ 0 nên phải +1 cho chính xác thực tế
            System.out.println("Tháng: " + (calendar.get(Calendar.MONTH) + 1));
            System.out.println("Năm: " + calendar.get(Calendar.YEAR));
            System.out.println("Múi giờ: " + calendar.getTimeZone().getID());
            System.out.println("Mili giây: " + calendar.getTimeInMillis());
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
