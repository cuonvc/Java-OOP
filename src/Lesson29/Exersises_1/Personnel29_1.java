public class Personnel29_1 {
    public static void main(String[] args) {
        PersonnelSP29_1 Cuong = new PersonnelSP29_1();

        Cuong.setPersonId("2055010026");
        Cuong.setFullName("Nguyễn Văn Cường");
        Cuong.setAddress("Việt Nam");
        Cuong.setAge(20);
        Cuong.setPhoneNumber("09123456789");
        Cuong.setWages(25000000);
        Cuong.setExpYear(3);

        System.out.println("Họ và Tên: " + Cuong.getFullName());
        System.out.println("Mã nhân viên: " + Cuong.getPersonId());
        System.out.println("Địa chỉ: " + Cuong.getAddress());
        System.out.println("Số điện thoại: " + Cuong.getPhoneNumber());
        System.out.println("Mức lương: " + Cuong.getWages());
        System.out.println("Số năm kinh nghiệm: " + Cuong.getExpYear());


        //các hành động
        Cuong.travel("lên Sao Hỏa");
        Cuong.relax();
        Cuong.takeMoney(1000000000);
        //...v.v...
    }
}
