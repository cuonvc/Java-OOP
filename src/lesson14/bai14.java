package lesson14;

import java.time.LocalDate;

public class bai14 {
    public static void main(String[] args) {
//        LocalDate current = LocalDate.now();
//        System.out.println("Ngày hiện tại: " + current);
//
//        var hundredDayLetter = current.plusDays(100);
//        System.out.println("100 ngày sau là: " + hundredDayLetter);
//
//        var tenYearLetter = current.plusYears(10);
//        System.out.println("10 năm sau là: " + tenYearLetter);
//
//        var fiveYearPrev = current.minusYears(5);
//        System.out.println("5 Năm trước là: " + fiveYearPrev);
//
//        System.out.println("Tháng hiện tại dạng chữ: " + current.getMonth());
//        System.out.println("Tháng hiện tại dạng số: " + current.getMonthValue());





//        LocalDate otherDate = LocalDate.of(2022, 12, 23);  //điền ngày bất kì
//        System.out.println(otherDate);




        LocalDate date1 = LocalDate.parse("2023-11-30");    //điền ngày bất kì
        System.out.println(date1);
        System.out.println("Ngày: " + date1.getDayOfMonth());
        System.out.println("Tháng: " + date1.getMonthValue());
        System.out.println("Năm: " + date1.getYear());

    }
}
