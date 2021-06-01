package lesson18.lythuyet;
// KẾ THỪA NHIỀU BẬC
public class Person {
    private String id;
    private String fullName;

    private void move() {
        // ...
    }
}

//Student là lớp con của Person và là lớp cha của GraduatedStudent
class Student extends Person {
    private String studentId;
    private float avgGrade;

    public void doHomeWork() {
        //...
    }
}

// GraduatedStudent là lớp con của Student
class GraduatedStudent extends Student {
    private String level;
    private float startingSalary;
    private int graduatedYear;

    public void workInOffice() {
        //...
    }
}
