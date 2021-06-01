package lesson38.Ex4;

import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        List<RegisterDriver> registerDriverList = new ArrayList<>();

        //tạo đối tượng lái xe (gồm id, fullName)
        Driver dv1 = new Driver("D1", "Trần Văn An");
        Driver dv2 = new Driver("D2", "Trần Việt Cường");
        Driver dv3 = new Driver("D3", "Trần Đức Bo");


        //tạo đối tượng tuyến đường (gồm id, name)
        Routes rt1 = new Routes("R1", "Cầu giấy - Nội Bài");
        Routes rt2 = new Routes("R2", "Gia Lâm - Trung Văn");
        Routes rt3 = new Routes("R3", "Long Biên - Cầu giấy");


        //tạo thông tin đăng kí chạy tuyến với mỗi đối tượng lái xe
        RegisterDriver registerDriver1 = new RegisterDriver(dv1, rt1, 10);
        RegisterDriver registerDriver2 = new RegisterDriver(dv2, rt2, 7);
        RegisterDriver registerDriver3 = new RegisterDriver(dv3, rt3, 9);


        //tạo danh sách ghép tài xế - tuyến xe - số lượt lái
        create(registerDriverList, registerDriver1);
        create(registerDriverList, registerDriver2);
        create(registerDriverList, registerDriver3);

        showResult(registerDriverList);
    }

    /**
     * hiển thị kết quả
     * @param registerDriverList
     */
    private static void showResult(List<RegisterDriver> registerDriverList) {
        for (var item : registerDriverList) {
            System.out.println(item);
        }
    }

    /**
     * thêm mới đối tượng vào bảng dánh sách phân công
     * nếu có rồi thì báo đã tồn tại
     * @param registerDriverList danh sách
     * @param other đối tượng cần kiểm tra
     */
    private static void create(List<RegisterDriver> registerDriverList, RegisterDriver other) {
        if (!registerDriverList.contains(other)) {
            registerDriverList.add(other);
        } else {
            System.out.println("Đối tượng " + other + " đã tồn tại");
        }
    }
}
