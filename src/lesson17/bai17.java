package lesson17;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class bai17 {
    public static void main(String[] args) {
//        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/uuuu");
//        LocalDate currentTime = LocalDate.now();
//        System.out.println("Ngày hôm nay: " + format.format(currentTime));
//
//        //thử với định dạng khác
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-uuuu");
//        System.out.println("Ngày hôm nay: " + formatter.format(currentTime));





        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu HH:mm:ss:S");
        LocalDateTime current = LocalDateTime.now();
        System.out.println("Thời điểm hiện tại: " + LocalDateTime.parse(formatter.format(current), formatter));

        //hoặc
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/uuuu HH:mm:ss:SSS");
        LocalDateTime myBirthDay = LocalDateTime.parse("05/08/2002 20:30:16:999", formatter1);
        System.out.println("Sinh nhật: " + myBirthDay);
    }
}
