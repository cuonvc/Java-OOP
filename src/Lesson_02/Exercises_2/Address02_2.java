public class Address02_2 {
    public static void main(String[] args) {
        //hiển thị với default constructor
        System.out.println("==============================default constructor==================================");
        AddressSP02_2 show = new AddressSP02_2();
        show.number = "12";
        show.lane = "267";
        show.road = "abcxyz";
        show.neighbors = "Ba Đông";
        show.commune = "Phan Sào Nam";
        show.district = "Phù Cừ";
        show.city = "Hưng Yên";
        System.out.println(show.fullAddress());




        System.out.println("===============================constructor 1 tham số=================================");
        AddressSP02_2 show1 = new AddressSP02_2("12");
        System.out.println(show1.number);



        System.out.println("===============================constructor 2 tham số=================================");
        AddressSP02_2 show2 = new AddressSP02_2("12", "267");
        System.out.println(show2.number);
        System.out.println(show2.lane);



        System.out.println("===============================constructor 3 tham số=================================");
        AddressSP02_2 show3 = new AddressSP02_2("12", "267", "abcxyz");
        System.out.println(show3.number);
        System.out.println(show3.lane);
        System.out.println(show3.road);



        //tương tự với 4,5,6 tham số



        System.out.println("================================constructor 7 tham số================================");
        AddressSP02_2 show7 = new AddressSP02_2("12", "267", "abcxyz", "Ba Đông",
                "Phan Sào Nam", "Phù Cừ", "Hưng Yên");
        System.out.println(show7.fullAddress());
    }
}
