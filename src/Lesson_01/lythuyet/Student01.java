public class Student01 {
    //input cái lớp student vào bai27

    public static void main(String[] args) {
        StudentSP01 Cuong = new StudentSP01("CN2055010026", "Nguyễn Văn Cường");
        StudentSP01 Hoang = new StudentSP01("CN2055010026H");
        StudentSP01 Huan = new StudentSP01();


        //chạy thử để biết dặc điểm của từng bug
        System.out.println("Tên của Cuong là: " + Cuong.fullName); //chạy đc

        System.out.println("Tên của Hoang là: " + Hoang.fullName);  //lỗi null vì fullNam của hoàng chưa đc gán

        Hoang.fullName = "Nguyễn Ngọc Hoàng"; //gán tên cho Hoang
        System.out.println("Tên của HOang là: " + Hoang.fullName);  //giờ thì ko lỗi null nữa

        System.out.println("Tên của tôi là: " + Huan.fullName); //cái này ko hiện gì vì fullName của Huân chỉ là khởi
        //tạo mặc định (default constructor)
        System.out.println("Độ dài tên: " + Cuong.fullName.length());


        //sử dụng Methods: cho thực hiện một hành động nào đó
        Cuong.doHomework("Toán");  //khi chạy sẽ thấy nó liên kết với phần Methods ở class "student"

    }
}
