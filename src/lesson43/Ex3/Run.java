package lesson43.Ex3;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Lecturer lecturer = new Lecturer();
        var innput = new Scanner(System.in);
        System.out.println("Nhập mã nhân viên: ");
        var id = innput.nextLine();
        lecturer.setId(id);
        System.out.println("Lương nhân viên: ");
        var wagesStr = innput.nextLine().trim();
        if (wagesStr.matches("\\d+[.]\\d+")) {  //nếu là số thực
            float wages = Float.parseFloat(wagesStr);
            wages = Math.round(wages * 100) * 1.0f / 100;   //làm tròn đến 2 chữ số thập phân
            try {
                lecturer.setWages(wages);
            } catch (InvalidStringWagesException e) {
                System.out.println(e.getMessage());
                System.out.println("Đã xảy ra ngoại lệ InvalidStringWagesException");
            }
        } else {
            Float wages = Float.parseFloat(wagesStr);
            try {
                lecturer.setWages(wages);
            } catch (InvalidStringWagesException e) {
                System.out.println(e.getMessage());
                System.out.println("Đã xảy ra ngoại lệ InvalidStringWagesException");
            }
        }

        showResult(lecturer);
    }

    private static void showResult(Lecturer lecturer) {
        System.out.println("Mã nhân viên: " + lecturer.getId());
        System.out.println("Mức lương: " + lecturer.getWages()  + " triệu");
    }
}
