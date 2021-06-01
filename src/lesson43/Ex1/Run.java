package lesson43.Ex1;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập tên: ");
        var petName = input.nextLine();
        cat.setPetName(petName);
        System.out.println("Nhập tuổi");
        var age = Float.parseFloat(input.nextLine());
        try {
            cat.setAge(age);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

        showCat(cat);
    }

    private static void showCat(Cat cat) {
        System.out.println("Tên thường gọi: " + cat.getPetName());
        System.out.println("Tuổi: " + cat.getAge());
    }
}
