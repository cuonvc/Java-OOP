package lesson16;


import java.time.LocalDateTime;

public class bai16 {
    public static void main(String[] args) {
        // 3 cách khởi tạo giá trị thời gian trong lớp LocalDateTime

        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println("Thời điểm hiện tại là: " + currentTime);

        LocalDateTime myBirthDay = LocalDateTime.of(2002, 8, 5, 15, 20, 42);
        System.out.println("Sinh nhật của tôi: " + myBirthDay);

        LocalDateTime otherTime = LocalDateTime.parse("2021-04-20T23:02:43");   //parse này vẫn tuân theo quy tắc
        //bài sau sẽ tự định nghĩa được quy tắc parse
        System.out.println("Thời điểm viết code này: " + otherTime);



        //các phương thức khác như .plus, .minus, ... tương tự 2 bài trước

    }
}
