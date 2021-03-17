package lesson_test;

public class testAccSP {
    private String id;
    private String number;
    private String name;
    private String type;
    private float balance;
    private String bank;
    private String firstDay;
    private String lastDay;



    public testAccSP() {
        id = "";
        number = "";
        name = "";
        type = "";
        balance = 0;
        bank = "";
        firstDay = "";
        lastDay = "";
    }

    public testAccSP(String id) {
        this.id = id;
    }

    public testAccSP(String id, String number) {
        this.id = id;
        this.number = number;
    }

    public testAccSP(String id, String number, String name) {
        this.id = id;
        this.number = number;
        this.name = name;
    }

    public testAccSP(String id, String number, String name, String type) {
        this.id = id;
        this.number = number;
        this.name = name;
        this.type = type;
    }

    public testAccSP(String id, String number, String name, String type, float balance) {
        this.id = id;
        this.number = number;
        this.name = name;
        this.type = type;
        this.balance = balance;
    }

    public testAccSP(String id, String number, String name, String type, float balance, String bank) {
        this.id = id;
        this.number = number;
        this.name = name;
        this.type = type;
        this.balance = balance;
        this.bank = bank;
    }

    public testAccSP(String id, String number, String name, String type, float balance, String bank, String firstDay) {
        this.id = id;
        this.number = number;
        this.name = name;
        this.type = type;
        this.balance = balance;
        this.bank = bank;
        this.firstDay = firstDay;
    }

    public testAccSP(String id, String number, String name, String type, float balance, String bank, String firstDay, String lastDay) {
        this.id = id;
        this.number = number;
        this.name = name;
        this.type = type;
        this.balance = balance;
        this.bank = bank;
        this.firstDay = firstDay;
        this.lastDay = lastDay;
    }



    public void setId() {
        this.id = id;
    }
    public String getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getFirstDay() {
        return firstDay;
    }

    public void setFirstDay(String firstDay) {
        this.firstDay = firstDay;
    }

    public String getLastDay() {
        return lastDay;
    }

    public void setLastDay(String lastDay) {
        this.lastDay = lastDay;
    }




    public boolean recharge(long amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(long amount) {
        if (amount >= 100000 && amount < balance && amount % 10 == 0 ) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public void checkBalance() {
        System.out.println("SỐ dư trong tài khoản: " + balance);
    }

    public boolean deal(String service, long amount) {
        if (!service.isEmpty() && amount > 0 && amount < balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
