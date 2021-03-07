import java.util.Scanner;

public class Zodiac04_3_2 {
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
            case 1 -> (day <= 19) ? ZodiacSP04_3_2.capricorn.getValue()
                    : (day <= 31) ? ZodiacSP04_3_2.aquarius.getValue() : "Giá trị không hợp lệ";
            case 2 -> (day <= 18) ? ZodiacSP04_3_2.aquarius.getValue()
                    : (day <= 28) ? ZodiacSP04_3_2.pisces.getValue() : "Giá trị không hợp lệ";
            case 3 -> (day <= 20) ? ZodiacSP04_3_2.pisces.getValue()
                    : (day <= 31) ? ZodiacSP04_3_2.aries.getValue() : "Giá trị không hợp lệ";
            case 4 -> (day <= 20) ? ZodiacSP04_3_2.aries.getValue()
                    : (day <= 30) ? ZodiacSP04_3_2.taurus.getValue() : "Giá trị không hợp lệ";
            case 5 -> (day <= 20) ? ZodiacSP04_3_2.taurus.getValue()
                    : (day <= 31) ? ZodiacSP04_3_2.gemini.getValue() : "Giá trị không hợp lệ";
            case 6 -> (day <= 19) ? ZodiacSP04_3_2.gemini.getValue()
                    : (day <= 30) ? ZodiacSP04_3_2.cancer.getValue() : "Giá trị không hợp lệ";
            case 7 -> (day <= 22) ? ZodiacSP04_3_2.cancer.getValue()
                    : (day <= 31) ? ZodiacSP04_3_2.leo.getValue() : "Giá trị không hợp lệ";
            case 8 -> (day <= 22) ? ZodiacSP04_3_2.leo.getValue()
                    : (day <= 31) ? ZodiacSP04_3_2.virgo.getValue() : "Giá trị không hợp lệ";
            case 9 -> (day <= 22) ? ZodiacSP04_3_2.virgo.getValue()
                    : (day <= 30) ? ZodiacSP04_3_2.libra.getValue() : "Giá trị không hợp lệ";
            case 10 -> (day <= 23) ? ZodiacSP04_3_2.libra.getValue()
                    : (day <= 31) ? ZodiacSP04_3_2.scorpius.getValue() : "Giá trị không hợp lệ";
            case 11 -> (day <= 22) ? ZodiacSP04_3_2.scorpius.getValue()
                    : (day <= 30) ? ZodiacSP04_3_2.sagittarius.getValue() : "Giá trị không hợp lệ";
            case 12 -> (day <= 19) ? ZodiacSP04_3_2.sagittarius.getValue()
                    : (day <= 31) ? ZodiacSP04_3_2.capricorn.getValue() : "Giá trị không hợp lệ";
            default -> "tháng không hợp lệ, vui lòng nhập lại...";
        };
        return zodiac;
    }
}
