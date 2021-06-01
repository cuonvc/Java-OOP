package lesson10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercises4 {
    public static void main(String[] args) throws FileNotFoundException {
        File file4 = new File("C:\\Users\\Thi Cuong\\IdeaProjects\\JavaOOP\\src\\lesson10\\input4.txt");
        Scanner input = new Scanner(file4);
        var n = input.nextInt();
        var numbers = new int[n];
        System.out.println("Số phần tử: " + n);
        //đọc file
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }
        System.out.println("Danh sách khi chưa sắp xếp: ");
        showList(numbers);
        System.out.println("Danh sách khi đã sắp xếp: ");
        decreaseSort(numbers);
        showList(numbers);
        var min2 = findMin(numbers);
        System.out.println("Số nhỏ thứ hai là: " + min2);
        System.out.println("Các vị trí của " + min2 + " là: " );
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == min2) {
                System.out.print((i + 1) + " ");
            }
        }
    }

    private static int findMin(int[] numbers) {
        var min = numbers[numbers.length - 1];
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] != min) {
                return numbers[i];
            }
        }
        return min;
    }

    /**
     * sắp xếp các phần tử theo hướng giảm dần
     * @param numbers mảng
     */
    private static void decreaseSort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = numbers.length - 1; j > i; j--) {
                if (numbers[j] > numbers[j - 1]) {
                    var x = numbers[j];
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = x;
                }
            }
        }
    }

    /**
     * phương thức hiển thị các phần tử
     * @param numbers mảng chứa các phần tử
     */
    private static void showList(int[] numbers) {
        for (var number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
