package lesson25.LyThuyet;

import java.util.Date;
//một lớp mà có phương thức abstract thì bắt buộc lớp đó phải là lớp abstract
public abstract class Person {
    private String id;
    private String name;
    private String address;
    private Date dayOfBirth;

    // ...

    //cách viết phương thức abstract 1
    abstract void earnMoney();  //hành động kiếm tiền của người nói chung

    //cách viết phương thức abstract 2
    public abstract void walk();  //hành động đi bộ của người nói chung

    //những phương thức abstract không cần có định nghĩa
}

class Student extends Person {
    private String studentId;
    private String major;
    private float avgGrade;
    // ...


    //nếu lớp cha là abstract class thì lớp con bắt buộc cũng phải là abstract class hoặc phải implement đầy đủ các
    //phương thức abstract từ lớp cha xuống

    @Override
    void earnMoney() {
        System.out.println("Sinh viên đi làm thêm kiếm tiền");
    }

    @Override
    public void walk() {
        System.out.println("Sinh viên đi bộ quanh hồ gươm");
    }
}