package lesson10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Exercises6 {
    public static void main(String[] args) throws FileNotFoundException {
        File file6 = new File("C:\\Users\\Thi Cuong\\IdeaProjects\\JavaOOP\\src\\lesson10\\input6.txt");
        Scanner input = new Scanner(file6);
        while (input.hasNextLine()) {
            var str = input.nextLine();
            var words = str.split("\\s+");  //tách các từ tại vị trí có 1 hoặc nhiều dấu tab
            System.out.println("Các từ trước khi sắp xếp: ");
            showWords(words);

            System.out.println("Các từu sau khi sắp xếp: ");
            sort(words);
            showWords(words);
        }
        input.close();
    }

    /**
     * sắp xếp các từ theo bảng chữ cái
     * @param words danh sách các từ
     */
    private static void sort(String[] words) {
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = words.length - 1; j > i; j--) {
                if (words[j].compareTo(words[j - 1]) < 0) {
                    var x = words[j];
                    words[j] = words[j - 1];
                    words[j - 1] = x;
                }
            }
        }
    }

    /**
     * hiển thị kết quả trước và sau
     * @param words danh sách các từ
     */
    private static void showWords(String[] words) {
        for (var word : words) {
            System.out.print(word + " ");
        }
        System.out.println();
    }
}
