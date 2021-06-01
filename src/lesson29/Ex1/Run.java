package lesson29.Ex1;

import lesson29.Ex1.Comparator.SortByHeightDown;
import lesson29.Ex1.Comparator.SortByName;
import lesson29.Ex1.Comparator.SortByWeightUP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        ArrayList<Animal> animals = new ArrayList<>();
        int choice = 0;
        do {
            System.out.println("1. Thêm mới một động vật vào danh sách");
            System.out.println("2. Hiển thị danh sách các động vật thành dạng bảng cột");
            System.out.println("3. Sắp xếp theo tên từ A-Z");
            System.out.println("4. Sắp xếp theo chiều cao giảm dần");
            System.out.println("5. Sắp xếp theo cân nặng giảm dần");
            System.out.println("6. Sắp xếp theo cân nặng tăng dần");
            System.out.println("0. Thoát chương trình.");
            System.out.println("=========== Nhập lựa chọn ===========");
            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 0:
                    showNofify("Đã thoát chương trình");
                    break;
                case 1:
                    var newAnimal = add(input);
                    animals.add(newAnimal);
                    showNofify("Thêm thành công một động vật");
                    break;
                case 2:
                    if (animals.size() > 0) {
                        showNofify("Danh sách các con vật");
                        showAnimal(animals);
                    } else {
                        showNofify("Danh sách trống");
                    }
                    break;
                case 3:
                    if (animals.size() > 0) {
                        showNofify("Danh sách sau khi sắp xếp từ a-z");
                        Collections.sort(animals, new SortByName());
                        showAnimal(animals);
                    } else {
                        showNofify("Danh sách trống");
                    }
                    break;
                case 4:
                    if (animals.size() > 0) {
                        showNofify("Sắp xếp theo chiều cao giảm dần");
                        Collections.sort(animals, new SortByHeightDown());
                        showAnimal(animals);
                    } else {
                        showNofify("Danh sách trống");
                    }
                    break;
                case 5:
                    if (animals.size() > 0) {
                        showNofify("Sắp xếp cân cặng theo chiều giảm dần");
                        Collections.sort(animals, new SortByHeightDown());
                        showAnimal(animals);
                    } else {
                        showNofify("Danh sách trống");
                    }
                    break;
                case 6:
                    if (animals.size() > 0) {
                        showNofify("Sắp xếp cân nặng tăng dần");
                        Collections.sort(animals, new SortByWeightUP());
                        showAnimal(animals);
                    } else {
                        showNofify("Danh sách trống");
                    }
                    break;
                default:
                    showNofify("Sai cú pháp, vui lòng chọn lại");
                    break;
            }
        } while (choice != 0);
    }

    /**
     * hiển thị danh sách động vật
     * @param animals
     */
    private static void showAnimal(ArrayList<Animal> animals) {
        System.out.printf("%-16s %-13s %-14s %-8s\n", "Tên con vật",
                "Tên loài", "Chiều cao", "Cân nặng");
        for (var ani : animals) {
            System.out.printf("%-16s %-13s %-14.2f %-8.2f\n", ani.getName(),
                    ani.getSpecies(), ani.getHeight(), ani.getWeight());
        }
    }

    /**
     * thêm mới một loài vật
     */
    private static Animal add(Scanner input) {
        System.out.println("Chọn loài: \n1. Động vật có vú\n2. Cá\n3. Chim\n");
        var option = Integer.parseInt(input.nextLine());
        System.out.println("Tên con vật: ");
        var name = input.nextLine();
        System.out.println("Tên loài: ");
        var species = input.nextLine();
        System.out.println("Chiều cao: ");
        var height = Float.parseFloat(input.nextLine());
        System.out.println("Cân nặng: ");
        var weight = Float.parseFloat(input.nextLine());

        switch (option) {
            case 1:
                return new Mammal(name, species, height, weight);
            case 2:
                return new Fish(name, species, height, weight);
            case 3:
                return new Bird(name, species, height, weight);
            default:
                showNofify("Sai cú pháp, vui lòng chọn lại");
                break;
        }
        return null;
    }

    /**
     * Hiển thị thông báo sau mỗi hành động
     * @param str nội dung thông báo
     */
    private static void showNofify(String str) {
        System.out.println(">>>>>>>> " + str + " <<<<<<<<");
    }
}
