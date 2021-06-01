package lesson43.LyThuyet;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class bai43 {
    public static void main(String[] args) {
        String str = "Hi there! I love learning Java programmingn" +
                "language. I hope you enjoy it too.";
        String str1 = "  ";
        String regex = "\\s+";  //đại diện cho một hoặc nhiều dấu cách
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        Matcher matcher1 = pattern.matcher(str1);

//        System.out.println("Kiểm tra xem str có khớp với regex hay không ? " + matcher.matches());  //false
//        System.out.println("Kiểm tra xem str1 có khớp với regex hay không ? " + matcher1.matches());  //true


//        while (matcher.find()) {  //nếu như tìm thấy sự xuất hiện nhiều lần của pattern (ở đây là khoảng trắng)
//            System.out.println("Bắt đầu " + matcher.start() + " - " + " kết thúc " + matcher.end());
//        }


        //tách và hiển thị một string
//        var words = pattern.split(str);  //cách 1
//        showResult(words);

//        var words = str.split(regex);  //cách 2
//        showResult(words);



        //thay thế kí tự
        var newStr = matcher.replaceAll(" - ");  //ở đây thay thế khoảng trắng bằng dấu -
        System.out.println(newStr);

        var newStr1 = matcher.replaceFirst(" - ");  //ở đây là thay thế khoảng trắng đầu tiên bằng dấu cách
        System.out.println(newStr1);
    }

    private static void showResult(String[] words) {
        for (var w : words) {
            System.out.println(w);
        }
    }
}
