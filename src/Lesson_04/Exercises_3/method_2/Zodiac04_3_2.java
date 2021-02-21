import java.util.Scanner;

public class Zodiac30_3_2 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập ngày sinh: ");
        var day = input.nextInt();
        System.out.println("Nhập tháng sinh: ");
        var month = input.nextInt();

        getZodiac(day, month);
            System.out.println(day + "/" + month + " là cung " + getZodiac(day, month));
    }

    private static String getZodiac(int day, int month) {
        String zodiac = switch (month) {
            case 0 -> "Kết thúc chương trình";
            case 1 -> (day <= 19) ? ZodiacSP30_3_2.capricorn.getValue()
                    : (day <= 31) ? ZodiacSP30_3_2.aquarius.getValue() : "Giá trị không hợp lệ";
            case 2 -> (day <= 18) ? Zodiac30_3_1.Zodiac.aquarius.getValue()
                    : (day <= 28) ? Zodiac30_3_1.Zodiac.pisces.getValue() : "Giá trị không hợp lệ";
            case 3 -> (day <= 20) ? Zodiac30_3_1.Zodiac.pisces.getValue()
                    : (day <= 31) ? Zodiac30_3_1.Zodiac.aries.getValue() : "Giá trị không hợp lệ";
            case 4 -> (day <= 20) ? Zodiac30_3_1.Zodiac.aries.getValue()
                    : (day <= 30) ? Zodiac30_3_1.Zodiac.taurus.getValue() : "Giá trị không hợp lệ";
            case 5 -> (day <= 20) ? Zodiac30_3_1.Zodiac.taurus.getValue()
                    : (day <= 31) ? Zodiac30_3_1.Zodiac.gemini.getValue() : "Giá trị không hợp lệ";
            case 6 -> (day <= 19) ? Zodiac30_3_1.Zodiac.gemini.getValue()
                    : (day <= 30) ? Zodiac30_3_1.Zodiac.cancer.getValue() : "Giá trị không hợp lệ";
            case 7 -> (day <= 22) ? Zodiac30_3_1.Zodiac.cancer.getValue()
                    : (day <= 31) ? Zodiac30_3_1.Zodiac.leo.getValue() : "Giá trị không hợp lệ";
            case 8 -> (day <= 22) ? Zodiac30_3_1.Zodiac.leo.getValue()
                    : (day <= 31) ? Zodiac30_3_1.Zodiac.virgo.getValue() : "Giá trị không hợp lệ";
            case 9 -> (day <= 22) ? Zodiac30_3_1.Zodiac.virgo.getValue()
                    : (day <= 30) ? Zodiac30_3_1.Zodiac.libra.getValue() : "Giá trị không hợp lệ";
            case 10 -> (day <= 23) ? Zodiac30_3_1.Zodiac.libra.getValue()
                    : (day <= 31) ? Zodiac30_3_1.Zodiac.scorpius.getValue() : "Giá trị không hợp lệ";
            case 11 -> (day <= 22) ? Zodiac30_3_1.Zodiac.scorpius.getValue()
                    : (day <= 30) ? Zodiac30_3_1.Zodiac.sagittarius.getValue() : "Giá trị không hợp lệ";
            case 12 -> (day <= 19) ? Zodiac30_3_1.Zodiac.sagittarius.getValue()
                    : (day <= 31) ? Zodiac30_3_1.Zodiac.capricorn.getValue() : "Giá trị không hợp lệ";
            default -> "tháng không hợp lệ, vui lòng nhập lại...";
        };
        return zodiac;
    }
}
