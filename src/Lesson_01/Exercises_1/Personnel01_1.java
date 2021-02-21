public class Personnel27_1 {
    public static void main(String[] args) {
        //profile
        PersonnelSP27_1 Cuong = new PersonnelSP27_1();
        Cuong.fullName = "Nguyễn Văn Cường";
        System.out.println("Họ và tên: " + Cuong.fullName);
        Cuong.personnelID = "CN2055010026";
        System.out.println("Mã các nhân: " + Cuong.personnelID);
        Cuong.address = "Hưng Yên";
        System.out.println("Địa chỉ: " + Cuong.address);
        Cuong.age = 18;
        System.out.println("Tuổi: " + Cuong.age);
        Cuong.phoneNumber = "123456789";
        System.out.println("Số điện thoại: " + Cuong.phoneNumber);
        Cuong.wage = 9f;
        System.out.println("Tiền lương: " + Cuong.wage + "000.000 VNĐ");
        Cuong.yearsOfExp = 3;
        System.out.println("Số năm kinh nghiệm: " + Cuong.yearsOfExp + " năm");


        //hành động
        Cuong.work("code !");
        Cuong.rest("nghỉ ngơi");
        Cuong.takeMoney("nhận lương");
        Cuong.travel("lên Sao Hỏa");
    }
}
