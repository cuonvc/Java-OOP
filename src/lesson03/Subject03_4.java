package lesson03;

import java.util.Scanner;

public class Subject03_4 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập số môn học: ");
        var n = input.nextInt();

        if (n <= 0) {
            System.out.println("giá trị không hợp lệ...");
        } else {
            SubjectSP03_4[] subject = new SubjectSP03_4[n];  //tạo đối tượng cho lớp SubjectSP29_4
            fillSubjects(subject, input);
            showSubjects(subject);
        }
    }

    private static void showSubjects(SubjectSP03_4[] subject) {
        System.out.println("=======================THÔNG TIN MÔN HỌC=========================");
        System.out.printf("%-15s %-16s %-15s %-15s %-15s \n", "Mã môn học", "Tên môn học",
                "Số tín chỉ", "Số tiết", "Số bài kiểm tra");
        for (var subj : subject) {
            subj.showInfoLine();
        }
    }

    /**
     * phương thức nhập vào các thông tin của môn học
     * @param subject mảng chứa các môn học
     * @param input đối tượng của Scanner
     */
    private static void fillSubjects(SubjectSP03_4[] subject, Scanner input) {
        for (int i = 0; i <= subject.length - 1; i++) {
            SubjectSP03_4 monhoc = new SubjectSP03_4();
            System.out.println("Nhập thông tin môn học thứ " + (i + 1) + ": ");
            System.out.print("Mã môn học: ");
            monhoc.setId(input.next());
            System.out.print("Tên môn học: ");
            monhoc.setName(input.next());
            System.out.print("Số tín chỉ: ");
            monhoc.setTerms(input.nextInt());
            System.out.print("Số tiết học: ");
            monhoc.setLesson(input.nextInt());
            System.out.print("Số bài kiểm tra: ");
            monhoc.setTest(input.nextInt());
            input.nextLine();  //loại bỏ kí tự thừa

            subject[i] = monhoc;
        }
    }
}
