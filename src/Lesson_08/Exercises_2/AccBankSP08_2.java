import java.sql.Struct;

public class AccBankSP08_2 {
//properties
    private String id;
    private String number;
    private String name;
    private String type;
    private float balance;
    private String bank;
    private String firstDay;
    private String lastDay;



//constructor
    //default constructor
    public AccBankSP08_2() {
        id = "";
        number = "";
        name = "";
        type = "";
        balance = 0;
        bank = "";
        firstDay = "";
        lastDay = "";
    }

    //constructor n tham số
    public AccBankSP08_2(String id) {
        this.id = id;
    }

    public AccBankSP08_2(String id, String number) {
        this(id);
        this.number = number;
    }

    public AccBankSP08_2(String id, String number, String name) {
        this(id, number);
        this.name = name;
    }

    public AccBankSP08_2(String id, String number, String name, String type) {
        this(id, number, name);
        this.type = type;
    }

    public AccBankSP08_2(String id, String number, String name, String type, float balance) {
        this(id, number, name, type);
        this.balance = balance;
    }

    public AccBankSP08_2(String id, String number, String name, String type,
                         float balance, String bank) {
        this(id, number, name, type, balance);
        this.bank = bank;
    }

    public AccBankSP08_2(String id, String number, String name, String type,
                         float balance, String bank, String firstDay) {
        this(id, number, name, type, balance, bank);
        this.firstDay = firstDay;
    }

    public AccBankSP08_2(String id, String number, String name, String type,
                         float balance, String bank, String firstDay, String lastDay) {
        this(id, number, name, type, balance, bank, firstDay);
        this.lastDay = lastDay;
    }



//getter and setter

    public String getId() {
        return id;
    }

    public void setId(String password) {
        this.id = password;
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




//các methods
    public boolean deposit(float amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(float amount) {
        if (amount > 0 && amount < balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public void checkBalance() {
        System.out.println("Số dư hiện tại: " + balance + ".VNĐ");
    }

    public boolean other(String service, float amount) {
        if (!service.isEmpty() && amount > 0 && amount < balance) {
            System.out.println("Thánh toán " + service + " thành công số tiền: " + amount);
            return true;
        }
        return false;
    }
}
