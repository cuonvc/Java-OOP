package lesson10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Exercises3 {
    public static void main(String[] args) throws FileNotFoundException {
        File file3 = new File("C:\\Users\\Thi Cuong\\IdeaProjects\\JavaOOP\\src\\lesson10\\input3.txt");
        Scanner input = new Scanner(file3);
        var n = input.nextInt();
        var numbers = new int[n];

        System.out.println("Số phần tử: " + n);

        //đọc dữ liệu
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.println("Các phần tử khi chưa sắp xếp: ");
        showList(numbers);

        Arrays.sort(numbers);
        System.out.println("Các phần tử khi đã sắp xếp tăng dần: ");
        showList(numbers);

        //tìm phần tử lớn thứ hai trong dãy
        var max2 = findMax(numbers);
        System.out.println("Số lớn thứ hai trong danh sách: " + max2);

        System.out.println("Các vị trí của số lớn thứ hai: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == max2) {
                System.out.print((i + 1) + " ");
            }
        }
    }

    /**
     * phương thức tìm số lớn thứ hai
     * @param numbers mảng
     * @return giá trị lớn thứ hai
     */
    private static int findMax(int[] numbers) {
        var max = numbers[numbers.length - 1];
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] != max) {
                return numbers[i];
            }
        }
        return max; //nếu ko có số nào khác max thì trả về chính nó
    }

    /**
     * phương thức hiển thị danh sách các phần tử
     * @param numbers mảng chứa các phần tử
     */
    private static void showList(int[] numbers) {
        for (var number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
