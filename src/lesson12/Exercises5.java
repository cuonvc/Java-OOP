package lesson12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercises5 {
    public static void main(String[] args) throws ParseException {
        var format = "dd/MM/yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        //time ngày đầu tiên của thế kỉ 21
        var nextCent = dateFormat.parse("01/01/2100").getTime();
        var result = (nextCent - new Date().getTime()) / (60 * 60 * 1000 * 24);
        System.out.println("Số ngày còn lại của thế kỉ 21 là: " + result);
    }
}
