package lesson08;

public class PersonnelSP08_1 {
//properties
    private String id;
    private String fullName;
    private String address;
    private int age;
    private String phoneNumber;
    private long wages;
    private int expYear;



//constructor
    //default constructor
    public PersonnelSP08_1() {
        id = "";
        fullName = "";
        address = "";
        age = 0;
        phoneNumber = "";
        wages = 0;
        expYear = 0;
    }

    //constructor 1 tham số
    public PersonnelSP08_1(String id) {
        this.id = id;
    }

    //constructor 2 tham số
    public PersonnelSP08_1(String id, String fullName) {
        this(id);
        this.fullName = fullName;
    }
    //constructor 3 tham số
    public PersonnelSP08_1(String id, String fullName, String address) {
        this(id, fullName);
        this.address = address;
    }
    //constructor 4 tham số
    public PersonnelSP08_1(String id, String fullName, String address, int age) {
        this(id, fullName, address);
        this.age = age;
    }
    //constructor 5 tham số
    public PersonnelSP08_1(String id, String fullName, String address, String phoneNumber, int age) {
        this(id, fullName, address, age);
        this.phoneNumber = phoneNumber;
    }
    //constructor 6 tham số
    public PersonnelSP08_1(String id, String fullName, String address, String phoneNumber, int age, long wages) {
        this(id, fullName, address, phoneNumber, age);
        this.wages = wages;
    }
    //constructor 7 tham số
    public PersonnelSP08_1(String id, String fullName, String address, String phoneNumber, int age, long wages, int expYear) {
        this(id, fullName, address, phoneNumber, age, wages);
        this.expYear = expYear;
    }



    //getter and setter
    public String getId() {
        return id;
    }

    public void setId() {
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

    public void setAddress() {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge() {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber() {
        this.phoneNumber = phoneNumber;
    }

    public long getWages() {
        return wages;
    }

    public void setWages() {
        this.wages = wages;
    }

    public int getExpYear() {
        return expYear;
    }

    public void setExpYear() {
        this.expYear = expYear;
    }




//method (các hành động)
    public void work(String job) {
        System.out.println(fullName + " đang " + job);
    }

    public void relax() {
        System.out.println(fullName + " đang nghỉ ngơi");
    }

    public void takeMoney(long amount) {
        System.out.println(fullName + " đã nhận " + amount + ".VNĐ tiền lương");
    }

    public void travel(String where) {
        System.out.println(fullName + " sẽ đi " + where + " vào tuần tới");
    }


}
