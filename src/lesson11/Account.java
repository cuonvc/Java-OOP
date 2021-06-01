package lesson11;

public class Account {
//properties - các thuộc tính
    private static int nextId = 100001;
    private String id;
    private String number;
    private String fullName;
    private String type;
    private long balance;
    private String bankName;
    private String firstDay;
    private String lastDay;



//constructors - các phương thức khởi tạo
    public Account() {
        setId(null);
        number = "";
        fullName = "";
        type = "";
        balance = 0;
        bankName = "";
        firstDay = "";
        lastDay = "";
    }

    /**
     * phương thức setId
     * @param id
     */
    public void setId(String id) {
        if (id != null) {
           this.id = id;
        } else {
            this.id = "WAB" + nextId;
            nextId ++;
        }
    }

    public Account(String id) {
        setId(id);
    }

    public Account(String id, String number) {
        this(id);
        this.number = number;
    }

    public Account(String id, String number, String fullName) {
        this(id, number);
        this.fullName = fullName;
    }

    public Account(String id, String number, String fullName, String type) {
        this(id, number, fullName);
        this.type = type;
    }

    public Account(String id, String number, String fullName, String type, long balance) {
        this(id, number, fullName, type);
        this.balance = balance;
    }

    public Account(String id, String number, String fullName,
                   String type, long balance, String bankName) {
        this(id, number, fullName, type, balance);
        this.bankName = bankName;
    }

    public Account(String id, String number, String fullName, String type,
                   long balance, String bankName, String firstDay) {
        this(id, number, fullName, type, balance, bankName);
        this.firstDay = firstDay;
    }

    public Account(String id, String number, String fullName, String type, long balance,
                   String bankName, String firstDay, String lastDay) {
        this(id, number, fullName, type, balance, bankName, firstDay);
        this.lastDay = lastDay;
    }


//getter and setter

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Account.nextId = nextId;
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

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
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


//method

   //nạp tiền vào tài khoản
    public boolean deposit(long amount) {
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
    //chuyển khoản
    public boolean transfers(Account other, long amount) {
        if (amount > 0 && amount < balance) {
            balance -= amount;
            other.balance += amount;
            return true;
        }
        return false;
    }
    //kiểm tra số dư
    public void checkBalance() {
        System.out.println("SỐ dư hiện tại của bạn: " + balance);
    }
    //dịch vụ khác
    public boolean pay(String service, long amount) {
        if (!service.isEmpty() && amount > 0 && amount < balance) {
            balance -= amount;
            System.out.println("Thanh toán thành công " + amount + ".VNĐ dịch vụ " + service);
            return true;
        }
        System.out.println("Thanh toán thất bại");
        return false;
    }
}
