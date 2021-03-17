package lesson02;

public class Personnel02_1 {
    public static void main(String[] args) {
        // gọi các phương thức khởi tạo khác nhau để tạo đối tượng
        // lưu ý rằng ở đây mỗi lần gọi constructor sẽ tạo một đối tượng

        //đối tượng 0
        PersonnelSP02_1 person = new PersonnelSP02_1();

        System.out.println("===================================================================");
        System.out.println("đối tượng 1 không thể hiển thị vì đang được khởi tạo mặc định (default constructor)");




        //đối tượng 1
        PersonnelSP02_1 person1 = new PersonnelSP02_1("2055010026");

        System.out.println("===================================================================");
        System.out.println("mã nhân viên: " + person1.id);




        //đối tượng 2
        PersonnelSP02_1 person2 = new PersonnelSP02_1("2055010026", "Nguyễn Văn Cường");

        System.out.println("===================================================================");
        System.out.println("mã nhân viên: " + person2.id);
        System.out.println("Tên nhân viên: " + person2.fullName);




        //đối tượng 3
        PersonnelSP02_1 person3 = new PersonnelSP02_1("2055010026", "Nguyễn Văn Cường",
                "Hưng Yên");

        System.out.println("===================================================================");
        System.out.println("mã nhân viên: " + person3.id);
        System.out.println("Tên nhân viên: " + person3.fullName);
        System.out.println("địa chỉ: " + person3.address);





        //đối tượng 4
        PersonnelSP02_1 person4 = new PersonnelSP02_1("2055010026", "Nguyễn Văn Cường",
                "Hưng Yên", 18);

        System.out.println("===================================================================");
        System.out.println("mã nhân viên: " + person4.id);
        System.out.println("Tên nhân viên: " + person4.fullName);
        System.out.println("địa chỉ: " + person4.address);
        System.out.println("tuổi: " + person4.age);






        //đối tượng 5
        PersonnelSP02_1 person5 = new PersonnelSP02_1("2055010026", "Nguyễn Văn Cường",
                "Hưng Yên", 18, "0987654321");

        System.out.println("===================================================================");
        System.out.println("mã nhân viên: " + person5.id);
        System.out.println("Tên nhân viên: " + person5.fullName);
        System.out.println("địa chỉ: " + person5.address);
        System.out.println("tuổi: " + person5.age);
        System.out.println("số điện thoại: " + person5.phoneNumber);






        //đối tượng 6
        PersonnelSP02_1 person6 = new PersonnelSP02_1("2055010026", "Nguyễn Văn Cường",
                "Hưng Yên", 18, "0987654321", 20000000);

        System.out.println("===================================================================");
        System.out.println("mã nhân viên: " + person6.id);
        System.out.println("Tên nhân viên: " + person6.fullName);
        System.out.println("địa chỉ: " + person6.address);
        System.out.println("tuổi: " + person6.age);
        System.out.println("số điện thoại: " + person6.phoneNumber);
        System.out.println("lương tháng này: " + person6.wages);





        //đối tượng 7
        PersonnelSP02_1 person7 = new PersonnelSP02_1("2055010026", "Nguyễn Văn Cường",
                "Hưng Yên", 18, "0987654321", 20000000, 3);

        System.out.println("===================================================================");
        System.out.println("mã nhân viên: " + person7.id);
        System.out.println("Tên nhân viên: " + person7.fullName);
        System.out.println("địa chỉ: " + person7.address);
        System.out.println("tuổi: " + person7.age);
        System.out.println("số điện thoại: " + person7.phoneNumber);
        System.out.println("lương tháng này: " + person7.wages);
        System.out.println("kinh nghiệm: " + person7.expYear + " năm.");




        //hành động
        System.out.println("==========================================================================");
        person2.work("code");
        person2.relax();
        person2.takeMoney(2000);
        person2.travel("Sao Hỏa");
        //chọn person 2 vì từ person2 trở đi mới chứa fullName thì mới hiển thị đc tên + đang làm gì...
    }
}
