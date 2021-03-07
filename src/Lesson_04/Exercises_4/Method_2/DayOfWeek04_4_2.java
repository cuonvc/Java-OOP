import java.util.Scanner;

public class DayOfWeek04_4_2 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập thứ trong tuần bằng tiếng việt: ");
        var VieName = input.nextLine();
        VieName = VieName.toLowerCase();

        getDay(VieName);
        System.out.println(VieName + " -> " + getDay(VieName));
    }

    private static String getDay(String vieName) {
        String EngName = switch (vieName) {
            case "thứ hai" -> DayOfWeek04_4_1.DayOfWeek.monday.getValue();
            case "thứ ba" -> DayOfWeek04_4_1.DayOfWeek.tuesday.getValue();
            case "thứ tư" -> DayOfWeek04_4_1.DayOfWeek.wednesday.getValue();
            case "thứ năm" -> DayOfWeek04_4_1.DayOfWeek.thursday.getValue();
            case "thứ sáu" -> DayOfWeek04_4_1.DayOfWeek.friday.getValue();
            case "thứ bảy" -> DayOfWeek04_4_1.DayOfWeek.saturday.getValue();
            case "chủ nhật" -> DayOfWeek04_4_1.DayOfWeek.sunday.getValue();
            default -> "Không hợp lệ, vui lòng nhập lại";
        };
        return EngName;
    }
}
