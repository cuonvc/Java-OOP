package lesson03;

public class PersonnelSP03_1 {
//properties (các thuộc tính)
    private String personId;
    private String fullName;
    private String address;
    private int age;
    private String phoneNumber;
    private long wages;
    private int expYear;




//constructor (các phương thức khởi tạo)
    // 0 tham số (default constructor)
    public PersonnelSP03_1() {
        personId = "";
        fullName = "";
        address = "";
        age = 0;
        phoneNumber = "";
        wages = 0;
        expYear = 0;
    }

    // 1 tham số
    public PersonnelSP03_1(String personId) {
        this.personId = personId;
    }

    // 2 tham số
    public PersonnelSP03_1(String personId, String fullName) {
        this(personId);
        this.fullName = fullName;
    }

    // 3 tham số
    public PersonnelSP03_1(String personId, String fullName, String address) {
        this(personId, fullName);
        this.address = address;
    }

    // 4 tham số
    public PersonnelSP03_1(String personId, String fullName, String address, int age) {
        this(personId, fullName, address);
        this.age = age;
    }

    // 5 tham số
    public PersonnelSP03_1(String personId, String fullName, String address, int age, String phoneNumber) {
        this(personId, fullName, address, age);
        this.phoneNumber = phoneNumber;
    }

    // 6 tham số
    public PersonnelSP03_1(String personId, String fullName, String address, int age, String phoneNumber, long wages) {
        this(personId, fullName, address, age, phoneNumber);
        this.wages = wages;
    }

    // 7 tham số
    public PersonnelSP03_1(String personId, String fullName, String address, int age, String phoneNumber, long wages, int expYear) {
        this(personId, fullName, address, age, phoneNumber, wages);
        this.expYear = expYear;
    }






//các cặp getter, setter cho từng thuộc tính

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public float getWages() {
        return wages;
    }

    public void setWages(long wages) {
        this.wages = wages;
    }

    public int getExpYear() {
        return expYear;
    }

    public void setExpYear(int expYear) {
        this.expYear = expYear;
    }







    //method: ở đây là các hành động
    //làm việc
    public void work(String job) {
        System.out.println(fullName + " đang " + job);
    }

    //nghỉ ngơi
    public void relax() {
        System.out.println(fullName + " đang thư giãn");
    }

    //nhận lương
    public void takeMoney(long amount) {
        System.out.println(fullName + " đã nhận " + amount + " tiền lương");
    }

    //đi du lịch
    public void travel(String going) {
        System.out.println(fullName + " sẽ đi " + going);
    }
}
