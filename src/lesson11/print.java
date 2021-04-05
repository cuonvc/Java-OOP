package lesson11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class print {
    public static void main(String[] args) throws FileNotFoundException {
//        //những đọc dữ liệu ra màn hình


//        //cách 1: cách truyền thống
//        System.out.println("Hello world");
//
//        //cách 2: thaythế thay thế "System.out" = "myOutput"
//        PrintWriter myOutput = new PrintWriter(System.out, true);
//        myOutput.println("Hello world");
//
//        //cách 3: bản chất là cách 2 nhưng cho cái sutoFlush xuống dưới
//        PrintWriter myOutput1 = new PrintWriter(System.out);
//        myOutput1.println("Hello world");
//        myOutput1.flush();
//
//        //cách 4: đóng file
//        PrintWriter myOutput2 = new PrintWriter(System.out);
//        myOutput2.println("Hello world");
//        myOutput2.close();






        // ghi dữ liệu ra file
        File file = new File("C:\\Users\\Thi Cuong\\IdeaProjects\\JavaOOP\\src\\lesson11\\print.txt"); //tạo một file mới
        PrintWriter print = new PrintWriter(file);    //ALT + ENTER
        Student Cuong = new Student("SV001", "Nguyen Van Cuong", 18, 3.5f, "Hưng Yên", "Cuongnvc5802@gmail.com");
        print.println(Cuong.getStudentId());
        print.println(Cuong.getFullName().getFullName());
        print.println(Cuong.getAge());
        print.println(Cuong.getAvgGrade());
        print.println(Cuong.getAddress());
        print.println(Cuong.getEmail());
        print.close();

        Student newStudent = readStudentFromFile("C:\\Users\\Thi Cuong\\IdeaProjects\\JavaOOP\\src\\lesson11\\print.txt");
        showStudent(newStudent);

    }

    private static void showStudent(Student student) {
        System.out.println("Mã sv: " + student.getStudentId());
        System.out.println("HỌ và tên: " + student.getFullName().getFullName());
        System.out.println("Tuổi: " + student.getAge());
        System.out.println("Điểm TB: " + student.getAvgGrade());
        System.out.println("ĐỊa chỉ: " + student.getAddress());
        System.out.println("Email: " + student.getEmail());
    }

    private static Student readStudentFromFile(String fileName) {
        try {
            Scanner scanner = new Scanner(new File(fileName));
            while (scanner.hasNextLine()) {
                var id = scanner.nextLine();
                var name = scanner.nextLine();
                var age = Integer.parseInt(scanner.nextLine());
                var avg = Float.parseFloat(scanner.nextLine());
                var address = scanner.nextLine();
                var email = scanner.nextLine();
                Student student = new Student(id, name, age, avg, address, email);
                return student;
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Student student = new Student();

        return student;
    }
}
