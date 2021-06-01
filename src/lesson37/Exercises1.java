package lesson37;

public class Exercises1 {
    public static void main(String[] args) {
        String[] brands = {"Apple", "Huawei", "Oppo", "Xiaomi", "SamSung"};
        Integer[] numbers = {1, 2, 7, 5, 4};

        System.out.println("Danh sách các phần tử số là: ");
        showArray(brands);
        System.out.println("Danh sách các phần tử brand là: ");
        showArray(numbers);
    }


    public static <T> void showArray(T[] array) {
        for (var e : array) {
            System.out.print(e + " ");
        }
        System.out.println();
    }
}
