package lesson15;

import java.time.LocalTime;

public class bai15 {
    public static void main(String[] args) {

        //3 cách khởi tạo thời gian

        LocalTime currentTime = LocalTime.now();
        System.out.println("thời điểm chạy chương trình: " + currentTime);



        LocalTime other = LocalTime.of(21, 15, 52);
        System.out.println("Thời gian theo khởi tạo bên trên: " + other);



        LocalTime time = LocalTime.parse("05:15:40");   //phải là dấu hai chấm chứ ko phải dấu bất kì
        System.out.println("Thời gian theo như khởi tạo: " + time);



        //thay đổi thời gian

        var newTime = currentTime.plusHours(5);   //cộng thêm 5h tính từ lúc chạy chương trình
        System.out.println("5 tiếng sau: " + newTime);

        var prevTime = currentTime.minusMinutes(30);  //trừ đi 30p kể từ lúc chạy chương trình
        System.out.println("Thời điểm 30p trước: " + prevTime);
    }
}
