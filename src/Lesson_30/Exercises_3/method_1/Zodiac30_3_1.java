import java.util.Scanner;

public class Zodiac30_3_1 {
    enum Zodiac {
        //các hằng số
        aries("bạch dương"), taurus("kim ngưu"), gemini("song tử"), cancer("cự giải"),
        leo("sư tử"), virgo("xử nữ"), libra("thiên bình"), scorpius("bọ cạp"),
        sagittarius("nhân mã"),capricorn("ma kết"), aquarius("bảo bình"), pisces("song ngư");

        //properties
        private String value;

        //constructor
        Zodiac(String value) {
            this.value = value;
        }

        //getter
        public String getValue() {
            return value;
        }
    }

    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập ngày sinh: ");
        var day = input.nextInt();
        System.out.println("Nhâp tháng sinh: ");
        var month = input.nextInt();

        getZodiac(day, month);
        System.out.println(day + "/" + month + " là cung " + getZodiac(day, month));
    }

    private static String getZodiac(int day, int month) {
        String zodiac = switch(month) {
            case 0 -> "Kết thúc chương trình";
            case 1 -> (day <= 19) ? Zodiac.capricorn.getValue()
                    : (day <= 31) ? Zodiac.aquarius.getValue() : "Ngày không hợp lệ";
            case 2 -> (day <= 18) ? Zodiac.aquarius.getValue()
                    : (day <= 28) ? Zodiac.pisces.getValue() : "Ngày không hợp lệ";
            case 3 -> (day <= 20) ? Zodiac.pisces.getValue()
                    : (day <= 31) ? Zodiac.aries.getValue() : "Ngày không hợp lệ";
            case 4 -> (day <= 20) ? Zodiac.aries.getValue()
                    : (day <= 30) ? Zodiac.taurus.getValue() : "Ngày không hợp lệ";
            case 5 -> (day <= 20) ? Zodiac.taurus.getValue()
                    : (day <= 31) ? Zodiac.gemini.getValue() : "Ngày không hợp lệ";
            case 6 -> (day <= 19) ? Zodiac.gemini.getValue()
                    : (day <= 30) ? Zodiac.cancer.getValue() : "Ngày không hợp lệ";
            case 7 -> (day <= 22) ? Zodiac.cancer.getValue()
                    : (day <= 31) ? Zodiac.leo.getValue() : "Ngày không hợp lệ";
            case 8 -> (day <= 22) ? Zodiac.leo.getValue()
                    : (day <= 31) ? Zodiac.virgo.getValue() : "Ngày không hợp lệ";
            case 9 -> (day <= 22) ? Zodiac.virgo.getValue()
                    : (day <= 30) ? Zodiac.libra.getValue() : "Ngày không hợp lệ";
            case 10 -> (day <= 23) ? Zodiac.libra.getValue()
                    : (day <= 31) ? Zodiac.scorpius.getValue() : "Ngày không hợp lệ";
            case 11 -> (day <= 22) ? Zodiac.scorpius.getValue()
                    : (day <= 30) ? Zodiac.sagittarius.getValue() : "Ngày không hợp lệ";
            case 12 -> (day <= 19) ? Zodiac.sagittarius.getValue()
                    : (day <= 31) ? Zodiac.capricorn.getValue() : "Ngày không hợp lệ";
            default -> "Ngày tháng không hợp lệ, vui lòng nhập lại...";
        };
        return zodiac;
    }
}
