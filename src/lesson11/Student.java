package lesson11;

public class Student {
    // thuộc tính
    private String studentId;
    private Student.FullName fullName;
    private int age;
    private float avgGrade;
    private String address;
    private String email;

    public Student() {
        age = 0;
        avgGrade = 0;
        address = "";
        studentId = "";
        email = "";
        fullName = new FullName();
    }

    public Student(String studentId, String fullName, int age,
                   float avgGrade, String address, String email) {
        this.studentId = studentId;
        setFullName(fullName);
        this.age = age;
        this.avgGrade = avgGrade;
        this.address = address;
        this.email = email;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        if (studentId.isEmpty()) {
            showError("Mã SV không hợp lệ");
        } else {
            this.studentId = studentId;
        }
    }

    public Student.FullName getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFullName(String fullName) {
        var names = fullName.split(" ");
        var myName = new Student.FullName();
        myName.first = names[names.length - 1];
        myName.last = names[0];
        myName.mid = "";
        for (int i = 1; i < names.length - 1; i++) {
            myName.mid += names[i] + " ";
        }
        if (!isValid(myName)) {
            showError("Tên không hợp lệ");
        } else {
            this.fullName = myName;
        }
    }

    /**
     * phương thức dùng để kiểm tra tên hợp lệ hay không
     * tên hợp lệ khi chỉ chứa chữ cái và khoảng trắng
     *
     * @param fullName là tên cần ktra
     * @return true nếu tên hợp lệ, false nếu ngược lại
     */
    private boolean isValid(Student.FullName fullName) {
        if (fullName.first.isEmpty()) {
            return false; // ten khong hop le
        }
        if (fullName.first.matches(".*[^a-zA-Z\\s]+.*")) {
            return false; // ten k hop le
        }
        return true; // ok
    }

    private void showError(String msg) {
        System.out.println(msg);
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

    public void setAddress(String address) {
        if (address.isEmpty()) {
            showError("Địa chỉ không hợp lệ");
        } else {
            this.address = address;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public class FullName {
        private String first;
        private String last;
        private String mid;

        public String getFirst() {
            return first;
        }

        public String getLast() {
            return last;
        }

        public String getMid() {
            return mid;
        }

        public String getFullName() {
            return last + " " + mid + " " + first;
        }
    }
}
