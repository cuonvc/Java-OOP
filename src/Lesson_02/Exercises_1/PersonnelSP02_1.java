public class PersonnelSP28_1 {
    //properties: các thuộc tính
    public String id;
    public String fullName;
    public String address;
    public int age;
    public String phoneNumber;
    public int wages;
    public int expYear;


    //constructor: các phương thức khởi tạo

    //mặc định: default constructor
    public PersonnelSP28_1() {
        id = "";
        fullName = "";
        address = "";
        age = 0;
        phoneNumber = "";
        wages = 0;
        expYear = 0;
    }

    // 1 tham số
    public PersonnelSP28_1(String code) {
        this.id = code;
    }

    // 2 tham số
    public PersonnelSP28_1(String code, String fullName) {
        this(code);
        this.fullName = fullName;
    }

    // 3 tham số
    public PersonnelSP28_1(String code, String fullName, String address) {
        this(code, fullName);
        this.address = address;
    }

    // 4 tham số
    public PersonnelSP28_1(String code, String fullName, String address, int age) {
        this(code, fullName, address);
        this.age = age;
    }

    // 5 tham số
    public PersonnelSP28_1(String code, String fullName, String address, int age, String phoneNumber) {
        this(code, fullName, address, age);
        this.phoneNumber = phoneNumber;
    }

    // 6 tham số
    public PersonnelSP28_1(String code, String fullName, String address, int age, String phoneNumber, int wages) {
        this(code, fullName, address, age, phoneNumber);
        this.wages = wages;
    }

    // 7 tham số
    public PersonnelSP28_1(String code, String fullName, String address, int age, String phoneNumber, int wages, int expYear) {
        this(code, fullName, address, age, phoneNumber, wages);
        this.expYear = expYear;
    }



    //phương thức thể hiện hành động làm việc
    public void work(String job) {
        System.out.println(fullName + " đang làm " + job);
    }

    //phương thức thể hiện hành động nghỉ ngơi
    public void relax() {
        System.out.println(fullName + " đang thư giãn");
    }

    //phương thức thể hiện hành động nhận lương
    public void takeMoney(int money) {
        System.out.println(fullName + " vừa mới nhận " + money + ".VNĐ tiền lương");
    }

    //phương thức thể hiện hành động đi du lịch
    public void travel(String go) {
        System.out.println(fullName + " sẽ đi du lịch ở " + go);
    }
}
