public class AccBankSP29_3 {
//các thuộc tính (properties)
    private String number;
    private String name;
    private String type;
    private double balance;
    private String bank;
    private String firstDay;
    private String lastDay;




//constructor (khởi tạo)
    //khởi tạo mặc định (default constructor)
    public AccBankSP29_3() {
        number = "";
        name = "";
        type = "";
        balance = 0;
        bank = "";
        firstDay = "";
        lastDay = "";
    }
    //constructor 1 tham số
    public AccBankSP29_3(String number) {
        this.number = number;
    }
    //constructor 2 tham số
    public AccBankSP29_3(String number, String name) {
        this(number);
        this.name = name;
    }
    //constructor 3 tham số
    public AccBankSP29_3(String number, String name, String type) {
        this(number, name);
        this.type = type;
    }
    //constructor 4 tham số
    public AccBankSP29_3(String number, String name, String type, double balance) {
        this(number, name, type);
        this.balance = balance;
    }
    //constructor 5 tham số
    public AccBankSP29_3(String number, String name, String type, double balance, String bank) {
        this(number, name, type, balance);
        this.bank = bank;
    }
    //constructor 6 tham số
    public AccBankSP29_3(String number, String name, String type, double balance,
                         String bank, String firstDay) {
        this(number, name, type, balance, bank);
        this.firstDay = firstDay;
    }
    //constructor 7 tham số
    public AccBankSP29_3(String number, String name, String type, double balance,
                         String bank, String firstDay, String lastDay) {
        this(number, name, type, balance, bank, firstDay);
        this.lastDay = lastDay;
    }




//gọi ra các getter và setter

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

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
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





//method: ở đây là các hành động
    //hành động nạp tiền vào acc
    public boolean add(long amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }
    //hành động rút tiền khỏi acc
    public boolean withdraw(long amount) {
        if (amount > 0 && amount < balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
    //hành động kiểm tra số dư
    public void checkBalance() {
        System.out.println(balance);
    }
    //hành động thanh toán các giao dịch khác
    public boolean other(String service, long amount) {
        if (amount > 0 && amount < balance && !service.isEmpty()) {
            balance -= amount;
            System.out.println("giao dịch " + service + " thành công " + amount);
            return true;
        }
        System.out.println("giao dịch thát bại...");
        return false;
    }
}
