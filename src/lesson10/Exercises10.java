package lesson10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercises10 {
    public static void main(String[] args) throws FileNotFoundException {
        File file10 = new File("C:\\Users\\Thi Cuong\\IdeaProjects\\JavaOOP\\src\\lesson10\\input10.txt");
        Scanner input = new Scanner(file10);
        var n = input.nextInt();
        var x = input.nextInt();
        var a = input.nextInt();
        var b = input.nextInt();
        var numbers = new int[n];
        //dịch file
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.println("Danh sách các phần tử trong mảng là: ");
        showList(numbers);
        if (isExist(numbers, x, a, b)) {
            System.out.println("Trong khoảng [" + a + "," + b + "], " + x + " xuất hiện "
                    + count(numbers, x, a, b) + " lần");
        } else {
            System.out.println("Giá trị " + x + " không tồn tại trong khoảng [" + (a + 1) + "," + (b + 1) + "].");
        }
    }

    private static int count(int[] numbers, int x, int a, int b) {
        var count = 0;
        for (int i = a; i <= b; i++) {
            if (numbers[i] == x) {
                count++;
            }
        }
        return count;
    }

    private static boolean isExist(int[] numbers, int x, int a, int b) {
        for (int i = a; i <= b; i++) {
            if (i >= 0 && i < numbers.length - 1 && numbers[i] == x) {
                return true;
            }
        }
        return false;
    }


    private static void showList(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
