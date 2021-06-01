package lesson01;

public class Address01_2 {
    public static void main(String[] args) {
        AddressSP01_2 myAddress = new AddressSP01_2("18", "3", "Ba Đông",
                "Phan Sào Nam", "Phù Cừ", "Hưng Yên");

        System.out.println("Địa chỉ của tôi: " + myAddress.fullAddress());
    }
}
