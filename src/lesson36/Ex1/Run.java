package lesson36.Ex1;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Cat cat = new Cat();
        System.out.println("Pet Name: ");
        var name = input.nextLine();
        cat.setPetName(name);
        System.out.println("Tuổi mèo: ");
        var age = Float.parseFloat(input.nextLine());
        try {
            cat.setAge(age);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
            System.out.println("Đã xảy ra ngoại lệ InvalidAgeException");
        }

        showInfoCat(cat);
    }

    private static void showInfoCat(Cat cat) {
        System.out.println("Tên thường gọi: " + cat.getPetName());
        System.out.println("Tuổi: " + cat.getAge());
    }
}
