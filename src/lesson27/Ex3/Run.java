package lesson27.Ex3;

public class Run {
    public static void main(String[] args) {
        Iphone  iphone = new Iphone();

        iphone.setName("12 pro max");
        iphone.setBrand("Apple");

        System.out.println("Tên máy: " + iphone.getName());
        System.out.println("Thương hiệu: " + iphone.getBrand());
        iphone.connect("Tai nghe");
        iphone.volumUp();
        //...
    }
}
