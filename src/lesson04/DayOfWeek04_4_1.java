package lesson04;

import java.util.Scanner;

public class DayOfWeek04_4_1 {
    enum DayOfWeek {
        //các hằng số
        monday("Monday"), tuesday("Tuesday"), wednesday("Wednesday"),
        thursday("Thursday"), friday("Friday"), saturday("Saturday"), sunday("SunDay");

        //properties
        private String value;

        //constructor
        DayOfWeek (String name) {
            value = name;
        }

        //method (getter)
        public String getValue() {
            return value;
        }
    }

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
            case "thứ hai" -> DayOfWeek.monday.getValue();
            case "thứ ba" -> DayOfWeek.tuesday.getValue();
            case "thứ tư" -> DayOfWeek.wednesday.getValue();
            case "thứ năm" -> DayOfWeek.thursday.getValue();
            case "thứ sáu" -> DayOfWeek.friday.getValue();
            case "thứ bảy" -> DayOfWeek.saturday.getValue();
            case "chủ nhật" -> DayOfWeek.sunday.getValue();
            default -> "Không hợp lệ, vui lòng nhập lại";
        };
        return EngName;
    }
}
