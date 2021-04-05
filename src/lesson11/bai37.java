package lesson11;

import java.io.File;
import java.io.IOException;

public class bai37 {
    public static void main(String[] args) {
        //thao tác với file và thư mục

        //tạo thư mục
        File folder = new File("C:\\Users\\Thi Cuong\\IdeaProjects\\JavaOOP\\src\\lesson11\\test");
        var isSuccess = folder.mkdir();   //mkdirs nếu tạo nhiều thư mục cùng lúc lồng nhau
        System.out.println("Tạothư mục: " + isSuccess); //trả về true nếu tạo thành công, false nếu thư mục đã tồn tại hoặc tạo kothành công

        //tạo file
        File file1 = new File("C:\\Users\\Thi Cuong\\IdeaProjects\\JavaOOP\\src\\lesson11\\text.txt");
        try {
            var Success = file1.createNewFile();   //ALT + ENTER
            System.out.println("Tạo file: " + Success);  //cũng trả về boolean như tạo thư mục
        } catch (IOException e) {
            e.printStackTrace();
        }

        //đổi tên file (ví dụ đổi với file1)
        File newFile = new File("C:\\Users\\Thi Cuong\\IdeaProjects\\JavaOOP\\src\\lesson11\\output.out");
        file1.renameTo(newFile);


        //xoá một file
        newFile.delete();
    }

}
