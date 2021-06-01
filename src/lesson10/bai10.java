package lesson10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) throws FileNotFoundException {
//        File file = new File("C:\\Users\\Thi Cuong\\Desktop\\testLesson10.txt");    //cách 2
//        System.out.println("Kiểm tra xem file này có tồn tại hay không: " + file.exists());
//        System.out.println("Kiểm tra tên của file: " + file.getName());
//        System.out.println("Kiểm tra kích thước file: " + file.length() + " bytes");
//        System.out.println("Trả về đường dẫn tận cùng của file: " + file.getAbsolutePath());
//        System.out.println("Trả về đường dẫn tận cùng của file: " + file.getAbsoluteFile());
//
//        //đọc file
//        Scanner readFile = new Scanner(file); //ALT + ENTER
//        while (readFile.hasNextLine()) {
//            var line = readFile.nextLine();
//            System.out.println(line);
//        }
//        readFile.close();




        //nếu một file mà nằm luôn trong project đang code (OOP) thì chỉ cần gọi tên file là được
        //ví dụ:
        File file = new File("arr.txt");
        Scanner readFile = new Scanner(file);
        if (readFile.hasNextInt()) {
            var n = readFile.nextInt();   //số phần tử của mảng
            var numbers = new int[n];  //mảng chứa các phần tử
            System.out.println("Số lượng phần tử: " + n);
            System.out.println("danh sách các phần tử: ");
            for (int i = 0; i < n; i++) {
                numbers[i] = readFile.nextInt();
            }
            showElement(numbers);
        }
        readFile.close();
    }

    private static void showElement(int[] numbers) {
        for (var element : numbers) {
            System.out.print(element + " ");
        }
    }
}
