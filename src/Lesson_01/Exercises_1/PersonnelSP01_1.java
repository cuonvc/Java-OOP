public class PersonnelSP01_1 {
    //properties (các thuộc tính)
    public String personnelID;
    public String fullName;
    public String address;
    public int age;
    public String phoneNumber;
    public float wage;
    public int yearsOfExp;



    //constructors (khởi tạo)
//    public personnelEx27(String id, String name, String Address, int Age, String phone, float Wage, int exp) {
//        personnelID = id;
//        fullName = name;
//        address = Address;
//        age = Age;
//        phoneNumber = phone;
//        wage = Wage;
//        yearsOfExp = exp;
//    }



    //Methods (các phương thức)
    //các hành động của nhân viên

    /**
     * @param working hành động là đang làm việc
     */
    public void work(String working) {
        System.out.println(fullName + " đang " + working);
    }

    /**
     * @param resting hành động đang nghỉ ngơi
     */
    public void rest(String resting) {
        System.out.println(fullName + " đang " + resting);
    }

    /**
     * @param taking hành động là nhận lương
     */
    public void takeMoney(String taking) {
        System.out.println(fullName + " đang " + taking);
    }

    /**
     * @param going hành động là đi du lịch
     */
    public void travel(String going) {
        System.out.println(fullName + " đang " + going);
    }
}
