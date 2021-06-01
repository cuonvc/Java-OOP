package lesson10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Exercises5 {
    public static void main(String[] args) throws FileNotFoundException {
        File file5 = new File("C:\\Users\\Thi Cuong\\IdeaProjects\\JavaOOP\\src\\lesson10\\input5.txt");
        Scanner input = new Scanner(file5);
        var n = input.nextInt();
        var numbers = new int[n];

        //dịch file
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.println("Số phần tử: " + n);
        System.out.println("Mảng khi chưa sắp xếp: ");
        showList(numbers);
        System.out.println("Mảng sau khi sắp xếp: ");
        Arrays.sort(numbers, 0, numbers.length);  //nửa đầu của mảng
        lastPart(numbers);    //nửa sau của mảng
        showList(numbers);
    }

    /**
     * nửa sau của mảng giảm dần
     * @param numbers
     */
    private static void lastPart(int[] numbers) {
        for (int i = (numbers.length / 2) + 1; i <= numbers.length - 2; i++) {
            for (int j = numbers.length - 1; j >= i; j--) {
                if (numbers[j] > numbers[j - 1]) {
                    var x = numbers[j];
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = x;
                }
            }
        }
    }

    /**
     * hiển thị kết quả trước và sau
     * @param numbers mảng
     */
    private static void showList(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
