package lesson12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class bai12 {
    public static void main(String[] args) {
        //vì lớp Date chỉ hiểu được thời gian là mini giây nên phải đổi từ ngày về miligiây
        Date date = new Date(5*24*60*60*1000);   //5ngày * 24h * 60p * 60s * 1000 == minigiây

        //gốc thời gian được tính từ 00h00m00s ngày 1/1/1970
        //nhưng do Việt Nam nằm trong múi giờ thứ 7 nên sẽ là 07h00p00s ngày 1/1/1970
        //như vậy thời gian 5 ngày sau sẽ là 07h00p00s ngày 6/1/1970
        System.out.println("Thời gian sau 5 ngày là: " + date);  //hiển thị theo kiểu mặc định

        //hiển thị theo cách tự định nghĩa
        var format = "dd/MM/yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        System.out.println("Thời gian sau 5 ngày là: " + dateFormat.format(date));




        //ví dụ 1: tính tuổi của một người đến thời điểm hiện tại khi biết ngày/tháng/năm sinh
//        var format = "dd/MM/yyyy";
//        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
//        var input = new Scanner(System.in);
//        System.out.println("Nhập ngày tháng năm sinh: ");
//        var birth = input.nextLine();
//        try {
//            Date birthDay = dateFormat.parse(birth);
//            System.out.println("Ngày sinh của bạn: " + dateFormat.format(birthDay));
//            System.out.println("Ngày hiện tại: " + dateFormat.format(new Date()));
//            var age = findAge(birthDay.getTime());
//            System.out.println("Tuổi hiện tại: " + age);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//    /**
//     * phương thức tìm tuổi
//     * @param time lúc được sinh ra
//     * @return trả về tuổi
//     */
//    private static long findAge(long time) {
//        var currentTime = new Date().getTime();  //thời gian hiện tại
//        var hours = 365 * 24 + 6;  //số giờ trong một năm, vì 4 năm nhuận 1 lần nên 1 năm đc cộng thêm 6h
//        var min = hours * 60;  //số phút trong một năm
//        var sec = min * 60;  //số giây trong một năm
//        var milisec = sec * 1000L;  //số miligiây trong một năm (ngôn ngữ nó chỉ hiểu miligiây nên phải đổi)
//        return (currentTime - time) / milisec;
    }
}
