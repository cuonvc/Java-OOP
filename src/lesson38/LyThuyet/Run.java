package lesson38.LyThuyet;

public class Run {
    public static void main(String[] args) {
        MyMap<Integer, String> mapOne = new MyMap<>(1, "One");
        System.out.println("Chuyển đổi: " + mapOne.getKey()
                + " ==> " + mapOne.getValue());

        MyMap<String, String> translate = new MyMap<>("Thứ hai", "Monday");
        System.out.println("Chuyển đổi: " + translate.getKey()
                + " ==> " + translate.getValue());
    }
}
