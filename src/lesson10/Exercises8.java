package lesson10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercises8 {
    public static void main(String[] args) throws FileNotFoundException {
        File file8 = new File("C:\\Users\\Thi Cuong\\IdeaProjects\\JavaOOP\\src\\lesson10\\input8.txt");
        Scanner input = new Scanner(file8);
        var n = input.nextInt();  //số phần tử (10): giá trị đầu tiên của dòng 1
        var x = input.nextInt();   //giá trị x cần tìm (5): giá trị thứ hai của dòng 1
        var numbers = new int[n];
        //dịch file
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }
        System.out.println("Các phần tử trong mảng là: ");
        showArrays(numbers);
        input.close();

        //tìm và hiển thị xem x có tồn tại ko
        if (isExist(numbers, x)) {
            System.out.println("Giá trị " + x + " có tồn tại.");
        } else {
            System.out.println("Giá trị " + x + " không tồn tại.");
        }
    }

    /**
     * phương thức tìm xem x có tồn tại trong mảng hay ko
     * @param numbers mảng cần check
     * @param x giá trị đi tìm
     * @return true nếu tồn tại & false nếu ko tồn tại
     */
    private static boolean isExist(int[] numbers, int x) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) {
                return true;
            }
        }
        return false;
    }

    private static void showArrays(int[] numbers) {
        for (var number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
