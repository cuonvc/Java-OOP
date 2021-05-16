package lesson21.Lythuyet;

import java.util.Date;

public class Person {
    private String fullName;
    private Date dateOfBirth;
    private int age;

    //...

    //các phương thức và geter, setter gốc trong lớp cha
    public void work() {      //phương thức này có thể Override được
        System.out.println("một người đang làm việc");
    }

    public void setFullName(String fullName) {    //phương thức này có thể Override
        this.fullName = fullName;
    }

    //cũng là setter nhưng thêm keyword final
    public final void setAge(int age) {     //phương thức này không thể Override vì là Final
        this.age = age;
    }
}

//lớp con
class Student extends Person {
    private String studentId;
    //...


    //đây là những phương thức sau khi Override
    @Override
    public void work() {
        super.work();
        System.out.println("Sinh viên đang học");
    }

    @Override
    public void setFullName(String fullName) {
        super.setFullName(fullName);
    }
}
