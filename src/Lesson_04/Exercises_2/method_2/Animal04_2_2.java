import java.util.Scanner;

public class Animal30_2_2 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập giá trị từ 1-12: ");
        var month = input.nextInt();

        getAnimal(month);
        System.out.println("Tháng " + month + " là con " + getAnimal(month));
    }

    private static String getAnimal(int month) {
        String animal = switch(month) {
            case 0 -> "Kết thúc chương trình";
            case 1 -> AnimalSP30_2_2.the_Rat.getValue();
            case 2 -> AnimalSP30_2_2.the_buffalo.getValue();
            case 3 -> AnimalSP30_2_2.the_tiger.getValue();
            case 4 -> AnimalSP30_2_2.the_cat.getValue();
            case 5 -> AnimalSP30_2_2.the_dragon.getValue();
            case 6 -> AnimalSP30_2_2.the_snake.getValue();
            case 7 -> AnimalSP30_2_2.the_horse.getValue();
            case 8 -> AnimalSP30_2_2.the_goat.getValue();
            case 9 -> AnimalSP30_2_2.the_monkey.getValue();
            case 10 -> AnimalSP30_2_2.the_chicken.getValue();
            case 11 -> AnimalSP30_2_2.the_dog.getValue();
            case 12 -> AnimalSP30_2_2.the_pig.getValue();
            default -> "giá trị không hợp lệ, nhập lại giá trị từ 1-12...";
        };
        return animal;
    }
}
