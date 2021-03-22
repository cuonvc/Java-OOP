package lesson10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercises2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file2 = new File("C:\\Users\\Thi Cuong\\IdeaProjects\\JavaOOP\\src\\lesson10\\input2.txt");
        Scanner input = new Scanner(file2);
        var n = input.nextInt();   //só lượng sinh viên
        var avgGrades = new float[n];  //mảng chứa điểm của các sinh viên

        //đọc ra từng điểm của từng sinh viên
        for (int i = 0; i < n; i++) {
            avgGrades[i] = input.nextFloat();
        }
        System.out.println("Số học sinh là: " + n);

        System.out.println("Điểm khi chưa sắp xếp: ");
        showList(avgGrades);

        System.out.println("Điểm sau khi sắp xếp giảm dần: ");
        sort(avgGrades);  //gọi phương thức sắp xếp giảm
        showList(avgGrades);

    }

    /**
     * phương thức sắp xếp theo thứ tự giảm dần
     * @param avgGrades
     */
    private static void sort(float[] avgGrades) {
        for (int i = 0; i < avgGrades.length - 1; i++) {
            for (int j = avgGrades.length - 1; j > i; j--) {
                if (avgGrades[j] > avgGrades[j - 1]) {
                    var x = avgGrades[j];
                    avgGrades[j] = avgGrades[j - 1];
                    avgGrades[j - 1] = x;
                }
            }
        }
    }

    /**
     * phương thức hiển thị điểm sinh viên
     * @param avgGrades điểm
     */
    private static void showList(float[] avgGrades) {
        for (var avg : avgGrades) {
            System.out.print(avg + " ");
        }
        System.out.println();
    }
}
