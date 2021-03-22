package lesson10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Exercises1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file1 = new File("C:\\Users\\Thi Cuong\\IdeaProjects\\JavaOOP\\src\\lesson10\\input1.txt");
        Scanner input = new Scanner(file1);
        if (input.hasNextInt()) {
            var n = input.nextInt();  //số lượng phần tử
            var numbers = new int[n];    //mảng chứa các phần tử

            //vòng for này có tác dụng đọc các dữ liệu trong file
            for (int i = 0; i < n; i++) {
                numbers[i] = input.nextInt();
            }

            System.out.println("Số các phần tử: " + n);

            System.out.println("Danh sách các phần tử khi chưa sắp xếp: ");
            showElement(numbers);

            Arrays.sort(numbers);
            System.out.println("Danh sách các phần tử khi đã sắp xếp: ");
            showElement(numbers);
        }


    }

    private static void showElement(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }


}
