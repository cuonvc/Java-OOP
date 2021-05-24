package lesson36.UncheckedEx;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        Student student = new Student();
        System.out.println("Họ và tên: ");
        var fullName = input.nextLine();
        student.setFullName(fullName);
        System.out.println("Điểm trung bình: ");
        var avg = Float.parseFloat(input.nextLine());
        try {
            student.setAvgGrade(avg);
        } catch (InvalidGradeException e) {
            System.out.println("Đã xảy ra ngoại lệ InvalidGradeException");
            System.out.println(e.getMessage());
        }

        showInfoStudent(student);

    }
    private static void showInfoStudent(Student student) {
        System.out.println("Họ và tên: " + student.getFullName());
        System.out.println("Điểm trung bình: " + student.getAvgGrade());
    }
}
