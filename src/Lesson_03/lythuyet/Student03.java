public class Student29 {
    public static void main(String[] args) {
        StudentSP29 Cuong = new StudentSP29();

        Cuong.setFullName("Nguyễn Văn Cường");  // set là để điền thông tin
        System.out.println("Họ và tên: " + Cuong.getFullName()); // get là để lấy (hiển thị) thông tin

        //tương tự với id, address, avg,...
        Cuong.setStudentId(""); //dòng này báo "ID không hợp lệ"
        Cuong.setStudentId("2055010026");  //dòng này ok
        System.out.println("ID: " + Cuong.getStudentId());

        Cuong.setAvgGrade(3.25f);
        System.out.println("Điểm trung bình: " + Cuong.getAvgGrade());

        Cuong.setAddress("");  //dòng này báo "địa chỉ ko hợp lệ
        Cuong.setAddress("Hưng Yên"); //dòng này ok
        System.out.println(Cuong.getAddress());
    }
}
