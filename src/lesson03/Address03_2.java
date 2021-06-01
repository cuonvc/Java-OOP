package lesson03;

public class Address03_2 {
    public static void main(String[] args) {
        AddressSP03_2 diachi = new AddressSP03_2();

        diachi.setNumber("12abc");
        diachi.setLane("267");
        diachi.setRoad("abcxyz");
        diachi.setNeighbors("3");
        diachi.setCommune("Phan Sào Nam");
        diachi.setDistrict("Phù Cừ");
        diachi.setCity("Hưng Yên");

        System.out.println("địa chỉ của tôi: " + diachi.fullAddress());

        //hoặc hiển thị riêng lẻ
        System.out.println("huyện của tôi: " + diachi.getDistrict());
        //...v..v..
    }
}
