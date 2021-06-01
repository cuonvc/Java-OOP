package lesson12;

import java.util.Date;

public class Personnel1 {
//properties
    private static int nextId = 1001;
    private String id;
    private String fullName;
    private String address;
    private Date dateOfBirth;
    private String numberPhone;
    private long wage;
    private float experience;


//constructor
    public Personnel1() {
        setId();
        fullName = "";
        address = "";
        dateOfBirth = new Date();
        numberPhone = "";
        wage = 0;
        experience = 0;
    }

    public Personnel1(String id) {
        if(id == null) {
            setId();
        } else {
            this.id = id;
        }
    }

    /**
     * phương thức thiết lập mã nhân viên mới
     */
    public void setId() {
        this.id = "EMP" + nextId;
        nextId++;
    }

    public Personnel1(String id, String fullName) {
        this(id);
        this.fullName = fullName;
    }

    public Personnel1(String id, String fullName, String address) {
        this(id, fullName);
        this.address = address;
    }

    public Personnel1(String id, String fullName, String address, Date dateOfBirth) {
        this(id, fullName, address);
        this.dateOfBirth = dateOfBirth;
    }

    public Personnel1(String id, String fullName, String address, Date dateOfBirth, String numberPhone) {
        this(id, fullName, address, dateOfBirth);
        this.numberPhone = numberPhone;
    }

    public Personnel1(String id, String fullName, String address, Date dateOfBirth, String numberPhone, long wage) {
        this(id, fullName, address, dateOfBirth, numberPhone);
        this.wage = wage;
    }

    public Personnel1(String id, String fullName, String address, Date dateOfBirth,
                      String numberPhone, long wage, float experience) {
        this(id, fullName, address, dateOfBirth, numberPhone, wage);
        this.experience = experience;
    }





//getter and setter


    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Personnel1.nextId = nextId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
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



//các hành động
    public void work(String job) {
        System.out.println(fullName + " đang " + job);
    }

    public void relax() {
        System.out.println(fullName + " đang nghỉ ngơi");
    }

    public void receiveSalary(long amount) {
        System.out.println(fullName + " đã nhận " + amount + ".VNĐ tiền lương");
    }

    public void travel(String someWhere) {
        System.out.println(fullName + " chuẩn bị đi du lịch ở " + someWhere);
    }
}
