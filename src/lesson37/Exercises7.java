package lesson37;

public class Exercises7 {
    public static void main(String[] args) {
        Integer[] numbersInt = {1, 4, 7, 3, 7, 3, 0, 2};
        Long[] numbersLong = {34242l, 232424l, 44444l};
        Float[] numbersFloat = {1.1f, 2.3f, 1.5f};


        System.out.println("Tổng int = " + add(numbersInt));
        System.out.println("Tổng long = " + add(numbersLong));
        System.out.println("Tổng float = " + add(numbersFloat));
    }

    /**
     * phương thức chỉ áp dụng cho các kiểu dữ liệu implement Number
     * @param elements
     * @param <T>
     * @return
     */
    public static <T extends Number> double add(T[] elements) {
        double sum = 0;
        for (int i = 0; i < elements.length; i++) {
            sum = sum + elements[i].doubleValue();
        }
        return sum;
    }
}
