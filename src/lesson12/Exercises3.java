package lesson12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Exercises3 {
    public static void main(String[] args) {
        var startDay = getDay();
        var endDay = getDay();
        var result = count(startDay, endDay);
        System.out.println("Chênh lệch giữa " + startDay + " và " + endDay + " là: " + result + " ngày");
    }

    /**
     * phương thức tính số ngày cách nhau của ngày đầu và ngày cuối
     * @param startDay ngày đầu
     * @param endDay ngày cuối
     * @return trả về số ngày cần tính
     */
    private static long count(String startDay, String endDay) {
        var format = "dd/MM/yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        try {
            var date1 = dateFormat.parse(startDay);  //định dạng ngày đầu
            var date2 = dateFormat.parse(endDay);  //định dạng ngày cuối
            var time1 = date1.getTime();   //thời gian ngày đầu (tính bằng ms)
            var time2 = date2.getTime();  //thời gian ngày cuối (tính bằng ms)
            var res = Math.abs(time2 - time1) / (24 * 60 * 60 * 1000);
            return res;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return 0;
    }

    private static String getDay() {
        var input = new Scanner(System.in);
        System.out.println("Nhập ngày, tháng, năm theo định dạng dd/MM/yyyy: ");
        var day = input.nextLine();
        if (day.length() == 10) {   //độ dài của đoạn string dd/MM/yyyy
            return day;
        }
        return "01/01/2021";
    }
}
