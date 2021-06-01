package lesson36.Ex3;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Instructor instructor = new Instructor();
        Scanner input = new Scanner(System.in);
        System.out.println("Họ và tên: ");
        var name = input.nextLine();
        instructor.setFullName(name);
        System.out.println("Mức lương: ");
        var wages = Long.parseLong(input.nextLine());
        try {
            instructor.setWages(wages);
        } catch (InvalidWagesException e) {
            System.out.println(e.getMessage());
            System.out.println("Ngoại lệ: InvalidWagesException");
        }
        showInfo(instructor);
    }

    private static void showInfo(Instructor instructor) {
        System.out.println("Họ và tên: " + instructor.getFullName());
        System.out.println("Mức lương: " + instructor.getWages());
    }
}
