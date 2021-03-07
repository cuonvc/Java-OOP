import java.util.Scanner;

public class Animal04_2_1 {
    enum Annimal {
        //các hằng số
        the_Rat("tí"), the_buffalo("sửu"), the_tiger("dần"), the_cat("mão"),
        the_dragon("thìn"), the_snake("tỵ"), the_horse("ngọ"), the_goat("mùi"),
        the_monkey("thân"), the_chicken("dậu"), the_dog("tuất"), the_pig("hợi");


        //properties(thuộc tính)
        private String value;

        //constructor
        Annimal(String value) {
            this.value = value;
        }

        //getter
        public String getValue() {
            return value;
        }
    }

    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập giá trị từ 1-12: ");
        var month = input.nextInt();

        getAnnimal(month);
        System.out.println("Tháng " + month + " là con " + getAnnimal(month));
    }

    private static String getAnnimal(int month) {
        String annimal = switch (month) {
            case 0 -> "Kết thúc chương trình";
            case 1 -> Annimal.the_Rat.getValue();
            case 2 -> Annimal.the_buffalo.getValue();
            case 3 -> Annimal.the_tiger.getValue();
            case 4 -> Annimal.the_cat.getValue();
            case 5 -> Annimal.the_dragon.getValue();
            case 6 -> Annimal.the_snake.getValue();
            case 7 -> Annimal.the_horse.getValue();
            case 8 -> Annimal.the_goat.getValue();
            case 9 -> Annimal.the_monkey.getValue();
            case 10 -> Annimal.the_chicken.getValue();
            case 11 -> Annimal.the_dog.getValue();
            case 12 -> Annimal.the_pig.getValue();
            default -> "Giá trị không hợp lệ, vui lòng nhập lại...";
        };
        return annimal;
    }
}
