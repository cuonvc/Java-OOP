package lesson08;

import java.util.ArrayList;

public class Lesson08 {
    public static void main(String[] args) {
        //MUỐN RUN THỬ XEM KẾT QUẢ CỦA TỪNG CÂU LỆNH THẾ NÀO THÌ COMMENT CÁC DÒNG KO CẦN THIẾT ĐI. NHỚ PHẢI ĐỘNG NÃO !
        //tạo ra một ArrayList: có 3 cách tạo nhưng nên tạo list trống
//1, tạo ArrayList với kiểu tham chiếu
        ArrayList<String> Friends = new ArrayList<> ();
        String friend1 = "Cường";
        String friend2 = "Huân";
        String friend3 = "Huy";
        String friend4 = "Hưng";
        String friend5 = "Thịnh";

        //thêm trực tiếp tên của từng đối tượng
        Friends.add(friend1);
        Friends.add(friend2);
        Friends.add(friend3);
        Friends.add(friend4);
        Friends.add(friend5);
        System.out.println("Số phần tử trong ArrayList: " + Friends.size());

        //thêm từng đối tượng thông qua các vị trí của nó
        //cách này có thể hiểu là một list bạn ai cũng có một số báo danh riêng nhưng có một thằng dở hơi nào đó chen vào
        //và giữa kết quả là các thằng số thứ tự sau nó phải tiến lên 1 đơn vị
        Friends.add(3, "Hào");  //thêm bình thường, ko động chạm đến vị trí của ai
        Friends.add(0, "Chiến"); //thay thế tên của Cường thành Chiến. Cường ban đầu là 0 giờ thành 1

        //thay thế tên của một đối tượng, không làm ảnh hưởng vị trí của các thằng khác
        Friends.set(5, "Hưng Fake");
        System.out.println("Tên Hưng sau khi đổi: " + Friends.get(5));

        //xóa một phần tử
        Friends.remove("Chiến"); //phải đúng chính tả
        Friends.remove(0);  //cách này chỉ cần nhớ vị trí của phần tử cần xóa là OK

        //tìm vị trí của một phàn tử bằng tên
        System.out.println("vị trí người tên \"Thịnh\" là: " + (Friends.indexOf("Thịnh") + 1)); // + 1 vì bao giờ vị trí đầu tiên cũng là 0

        //xóa toàn bộ các phần tử trong list
//        Friends.clear();
//        System.out.println("Số phần tử sau khi xóa: " + Friends.size());

        //kiểm tra xem list có rỗng hay không
        System.out.println("Trả về true hoặc false: " + Friends.isEmpty());

        //hiển thị danh sách các phần tử của ArrayList
        System.out.println("Danh sách cá phần tử của ArrayList: ");
        for (int i = 0; i <= Friends.size() - 1; i++) {
            System.out.print(Friends.get(i) + ", ");
        }


        System.out.println();  //tách dòng với kết quả danh sách bên trên
        //nhét tất cả các phần tử của ArrayList vào một mảng
        String[] friendArr = new String[Friends.size()];
        //điều kiện của mảng này là số phần tử của mảng phải vừa khít bằng số phần tử của ArrayList nên mới khai báo mảng cồng kềnh thế kia
        Friends.toArray(friendArr); //sau khi dòng trên đã gán đủ size cho mảng rồi thì dòng này chỉ việc coppy thôi
        System.out.println("Mảng chứa các phần tử của ArrayList: ");
        for (int i = 0; i <= friendArr.length - 1; i++) {
            System.out.print(friendArr[i] + ", ");
        }








//2, tạo ArrayList với kiểu nguyên thủy
        //ko thể tạo ArrayList với kiểu nguyên thủy được mà phải tạo với lớp bao của nó
        //VD: Integer thay vì int như trước
        ArrayList<Integer> avgGrade = new ArrayList<>();
        //...v.v...
    }
}
