import java.util.Scanner;

public class Season04_1_2 {
    public static void main(String[] args) {

        SeasonSP04_1_2 spring = SeasonSP04_1_2.Spring;
        SeasonSP04_1_2 summer = SeasonSP04_1_2.Summer;
        SeasonSP04_1_2 fall = SeasonSP04_1_2.Fall;
        SeasonSP04_1_2 winter = SeasonSP04_1_2.Winter;

        var input = new Scanner(System.in);
        System.out.println("Nhập giá trị từ 1-12: ");
        var month = input.nextInt();

        getSeason(month);
        System.out.println("Tháng " + month + " là mùa " + getSeason(month));
    }

    private static String getSeason(int month) {
        String season = switch(month) {
            case 0 -> "Kết thúc chương trình";
            case 1, 2, 3 -> SeasonSP04_1_2.Spring.getValue();
            case 4, 5, 6 -> SeasonSP04_1_2.Summer.getValue();
            case 7, 8, 9 -> SeasonSP04_1_2.Fall.getValue();
            case 10, 11, 12 -> SeasonSP04_1_2.Winter.getValue();
            default -> "Giá trị không hợp lệ, vui lòng nhập lại...";
        };
        return season;
    }
}
