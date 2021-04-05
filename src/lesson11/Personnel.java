package lesson11;

public class Personnel {
//properties
    private static int nextId = 1001;
    private String personId;
    private String fullName;
    private String address;
    private int age;
    private String numberPhone;
    private long wage;
    private float experience;



//constructors
    public Personnel() {
        setId();
        personId = "";
        fullName = "";
        address = "";
        age = 0;
        numberPhone = "";
        wage = 0;
        experience = 0;
    }

    private void setId() {
        this.personId = "EMP" + nextId;
        nextId ++;
    }

    public Personnel(String personId) {
        if (personId == null) {
            setId();
        } else {
            this.personId = personId;
        }
    }

    public Personnel(String personId, String fullName) {
        this(personId);
        this.fullName = fullName;
    }

    public Personnel(String personId, String fullName, String address) {
        this(personId, fullName);
        this.address = address;
    }

    public Personnel(String personId, String fullName, String address, int age) {
        this(personId, fullName, address);
        this.age = age;
    }

    public Personnel(String personId, String fullName, String address, int age, String numberPhone) {
        this(personId, fullName, address, age);
        this.numberPhone = numberPhone;
    }

    public Personnel(String personId, String fullName, String address, int age, String numberPhone, long wage) {
        this(personId, fullName, address, age, numberPhone);
        this.wage = wage;
    }

    public Personnel(String personId, String fullName, String address, int age, String numberPhone, long wage, float experience) {
        this(personId, fullName, address, age, numberPhone, wage);
        this.experience = experience;
    }



//getter and setter

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Personnel.nextId = nextId;
    }

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



//method: ở đây là các hành động của nhân viên
    public void work(String job) {
        System.out.println(fullName + " đang " + job);
    }
    public void relax() {
        System.out.println(fullName + " đang thư giãn");
    }
    public void receiveSalary(float amount) {
        System.out.println(fullName + " đã nhận " + amount + ".VNĐ tiền lương");
    }
    public void travel(String someWhere) {
        System.out.println(fullName + " đang du lịch ở " + someWhere);
    }
}
