package lesson02;

public class AccBankSP02_3 {
//properties
    public String number;
    public String name;
    public String type;
    public float balance;
    public String bank;
    public String firstDay;
    public String lastDay;




//constructor
    //khởi tạo mặc định
    public AccBankSP02_3() {
        number = "";
        name = "";
        type = "";
        balance = 0f;
        bank = "";
        firstDay = "";
        lastDay = "";
    }

    //khởi tạo constructor 1 tham số đầu
    public AccBankSP02_3(String number) {
        this.number = number;
    }

    //khởi tạo constructor 2 tham số đầu
    public AccBankSP02_3(String number, String name) {
        this(number);
        this.name = name;
    }

    //khởi tạo constructor 3 tham số đầu
    public AccBankSP02_3(String number, String name, String type) {
        this(number, name);
        this.type = type;
    }

    //khởi tạo constructor 4 tham số đầu
    public AccBankSP02_3(String number, String name, String type, float balance) {
        this(number, name, type);
        this.balance = balance;
    }

    //khởi tạo constructor 5 tham số đầu
    public AccBankSP02_3(String number, String name, String type, float balance, String bank) {
        this(number, name, type, balance);
        this.bank = bank;
    }

    //khởi tạo constructor 6 tham số đầu
    public AccBankSP02_3(String number, String name, String type,
                         float balance, String bank, String firstDay) {
        this(number, name, type, balance, bank);
        this.firstDay = firstDay;
    }

    //khởi tạo constructor 7 tham số
    public AccBankSP02_3(String number, String name, String type, float balance,
                         String bank, String firstDay, String lastDay) {
        this(number, name, type, balance, bank, firstDay);
        this.lastDay = lastDay;
    }

    //method: ở đây là các hành động
    //nạp tiền vào tài khoản
    public boolean diposit(long amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    //rút tiền khỏi tài khoản
    public boolean withdraw(long amount) {
        if (amount > 0 && amount < balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    //kiểm tra số dư
    public void checkBalance() {
        System.out.println(balance);
    }

    //thanh toán các giao dịch khác
    public boolean pay(String service, long amount) {
        if (amount > 0 && amount < balance && !service.isEmpty()) {
            System.out.println("Tiền " + service + " đã trả " + amount + ".VNĐ");
            return true;
        }
        return false;
    }
}
