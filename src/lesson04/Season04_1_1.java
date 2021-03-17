package lesson04;

import java.util.Scanner;

public class Season04_1_1 {
    enum Season {
        //hằng số
        Spring("Mùa Xuân"), Summer("Mùa Hạ"), Fall("Mùa Thu"), Winter("Mùa Đông");

        //properties
        private String value;

        //constructor
        Season(String value) {
            this.value = value;
        }

        //getter
        public String getValue() {
            return value;
        }
    }

    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập giá trị từ 1-12: ");
        var month = input.nextInt();
        //gọi phương thức đánh  giá với swich
        getSeason(month);
        System.out.println("Tháng " + month + " là " + getSeason(month));
    }

    /**
     * phương thức trả về mùa của năm dựa vào các tháng
     * @param month tháng nhập vào
     * @return tên mùa
     */
    private static String getSeason(int month) {
        String season = switch (month) {
            case 0 -> "kết thúc chương trình";
            case 1, 2, 3 -> Season.Spring.getValue();
            case 4, 5, 6 -> Season.Summer.getValue();
            case 7, 8, 9 -> Season.Fall.getValue();
            case 10, 11, 12 -> Season.Winter.getValue();
            default -> "giá trị không hợp lệ, vui lòng nhập lại...";
        };
        return season;
    }
}
