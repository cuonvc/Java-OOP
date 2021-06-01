package lesson03;

public class StudentSP03 {
//properties (các thuộc tính)
    private String studentId;
    private String fullName;
    private float avgGrade;
    private String address;
    private String email;


    //sinh getter và setter:
    //để sinh getter và setter ấn tổ hợp ALT + INS -> chọn "getter and setter" (tương tự sinh constructor)


    public String getStudentId() {
        return studentId;
    }

    //thử chèn thêm điều kiện vào Id
    public void setStudentId(String studentId) {
        if (studentId.isEmpty()) {
            System.out.println("ID không hợp lệ...");
        } else {
            this.studentId = studentId;
        }
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public float getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(float avgGrade) {
        this.avgGrade = avgGrade;
    }

    public String getAddress() {
        return address;
    }

    //test thử cái này với chứng năng sinh phương thức (alt + enter)
    public void setAddress(String address) {
        if (address.isEmpty()) {
            showError("Địa chỉ không hợp lệ...");
        } else {
            this.address = address;
        }
    }

    private void showError(String msg) {  //phương thức này đc sinh ra bởi phương thức address bên trên chứ đây ko phải getter hay setter
        System.out.println(msg);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
