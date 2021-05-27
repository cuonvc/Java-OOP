package lesson38.Ex1;

public class Run {
    public static void main(String[] args) {
        Translate<String,String> tras = new Translate<>("Xin chào", "Hello");
        Translate<Integer, String> tras1 = new Translate<>(1, "Một");
        Translate<Integer, Float> tras3 = new Translate<>(2, 3.2f);

        //hiển thị bằng toString
        System.out.println(tras);
        System.out.println(tras1);
        //Hiển thị tùy ý
        System.out.println("\"" + tras3.getKey() + "\" khác \"" + tras3.getValue() + "\"");
    }
}
