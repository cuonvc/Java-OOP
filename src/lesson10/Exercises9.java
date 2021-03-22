package lesson10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercises9 {
    public static void main(String[] args) throws FileNotFoundException {
        File file9 = new File("C:\\Users\\Thi Cuong\\IdeaProjects\\JavaOOP\\src\\lesson10\\input9.txt");
        Scanner input = new Scanner(file9);
        var n = input.nextInt();
        var x = input.nextInt();
        var numbers = new int[n];
        //dịch file
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.println("Danh sách các phần tử trong mảng là: ");
        showList(numbers);
        if (isExist(numbers, x)) {
            System.out.println("Giá trị " + x + " xuất hiện " + countX(numbers, x) + " lần.");
        } else {
            System.out.println("Không xuất hiện giá trị " + x + " trong mảng.");
        }

    }

    private static int countX(int[] numbers, int x) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) {
                count ++;
            }
        }
        return count;
    }

    private static boolean isExist(int[] numbers, int x) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) {
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
