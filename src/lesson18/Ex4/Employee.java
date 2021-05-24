package lesson18.Ex4;

import java.util.Date;

public class Employee extends Person {
//properties
    private static int nextId = 1001;  
    private String idEMP;  //mã nhân viên
    private String position;  //vị trí công việc
    private long wage;
    private float experience;  //kinh nghiệm

//constructors
    public Employee(String idCard, String fullName, String address, Date birthday, String email,
                    String phoneNumber, String idEMP, String position, long wage, float experience) {
        super(idCard, fullName, address, birthday, email, phoneNumber);
        setNextIdEMP(idEMP);
        this.position = position;
        this.wage = wage;
        this.experience = experience;
    }

    /**
     * phương thức thiết lập mã nhân viên
     * @param idEMP mã nhân viên cần thiết lập
     */
    private void setNextIdEMP(String idEMP) {
        if (idEMP == null) {  //nếu id chưa tồn tại
            this.idEMP = "EMP" + nextId;  //thì tạo mới
            nextId ++;
        } else {
            this.idEMP = idEMP;
        }
    }


//getter and setter
    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Employee.nextId = nextId;
    }

    public String getIdEMP() {
        return idEMP;
    }

    public void setIdEMP(String idEMP) {
        this.idEMP = idEMP;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public long getWage() {
        return wage;
    }

    public void setWage(long wage) {
        this.wage = wage;
    }

    public float getExperience() {
        return experience;
    }

    public void setExperience(float experience) {
        this.experience = experience;
    }


    public void work(String job) {
        System.out.println(getFullName() + " đang " + job);
    }
    public void relax() {
        System.out.println(getFullName() + " đang nghỉ ngơi ");
    }
    public void receiveSalary(long amount) {
        System.out.println(getFullName() + " đã nhận " + amount + ".VNĐ tiền lương");
    }
    public void travel(String someWhere) {
        System.out.println(getFullName() + " đang đi chơi ở " + someWhere);
    }
}
