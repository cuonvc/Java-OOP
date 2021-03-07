public class StudentSP01 {
    //Properties (các thuộc tính)
    public String fullName;
    public String studentId;
    public int age;
    public float avgGrade;
    public String address;




    //Constructors (khởi tạo) : tên của constructors phải trùng với tên của lớp
    public StudentSP01() {
        fullName = "";
        studentId = "";
        age = 0;
        avgGrade = 0;
        address = "";
    }

    //hoặc
    public StudentSP01(String id) {
        studentId = id;
    }

    //hoặc
    public StudentSP01(String id, String name) {
        studentId = id;
        fullName = name;
    }





    //Methods (các phương thức): chủ yếu dùng để thể hiện các hành động
    public void doHomework(String subject) {
        System.out.println(fullName + " đang làm bài tập môn " + subject);
    }
}
