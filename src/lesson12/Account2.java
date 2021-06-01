package lesson12;

import java.util.Date;

public class Account2 {

//properties
    private static int nextId = 100001;
    private String id;
    private String numberAcc;
    private String fullName;
    private String type;
    private long balance;
    private String bank;
    private Date firstDay;
    private Date lastDay;


//constructors
    public Account2() {
        setId(null);
        numberAcc = "";
        fullName = "";
        type = "";
        balance = 0;
        bank = "";
        firstDay = new Date();
        firstDay = new Date();
    }

    public void setId(String id) {
        if (id != null){
            this.id = id;
        } else {
            this.id = "WAB" + nextId;
            nextId++;
        }
    }

    public Account2(String id) {
        setId(id);
    }

    public Account2(String id, String numberAcc) {
        this(id);
        this.numberAcc = numberAcc;
    }

    public Account2(String id, String numberAcc, String fullName) {
        this(id, numberAcc);
        this.fullName = fullName;
    }

    public Account2(String id, String numberAcc, String fullName, String type) {
        this(id, numberAcc, fullName);
        this.type = type;
    }

    public Account2(String id, String numberAcc, String fullName, String type, long balance) {
        this(id, numberAcc, fullName, type);
        this.balance = balance;
    }

    public Account2(String id, String numberAcc, String fullName, String type, long balance, String bank) {
        this(id, numberAcc, fullName, type, balance);
        this.bank = bank;
    }

    public Account2(String id, String numberAcc, String fullName, String type,
                    long balance, String bank, Date firstDay) {
        this(id, numberAcc, fullName, type, balance, bank);
        this.firstDay = firstDay;
    }

    public Account2(String id, String numberAcc, String fullName, String type, long balance,
                    String bank, Date firstDay, Date lastDay) {
        this(id, numberAcc, fullName, type, balance, bank, firstDay);
        this.lastDay = lastDay;


    }
    //getter and setter

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Account2.nextId = nextId;
    }

    public String getId() {
        return id;
    }

    public String getNumberAcc() {
        return numberAcc;
    }

    public void setNumberAcc(String numberAcc) {
        this.numberAcc = numberAcc;
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

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public Date getFirstDay() {
        return firstDay;
    }

    public void setFirstDay(Date firstDay) {
        this.firstDay = firstDay;
    }

    public Date getLastDay() {
        return lastDay;
    }

    public void setLastDay(Date lastDay) {
        this.lastDay = lastDay;
    }


//các hành động
    public boolean deposit(long amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(long amount) {
        if (amount > 0 && amount < balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public boolean transfer(Account2 other, long amount) {
        if (amount > 0 && amount < balance) {
            balance -= amount;
            other.balance += amount;
            return true;
        }
        return false;
    }

    public void checkBalance() {
        System.out.println("Số dư hiện tại: " + balance);
    }

    public boolean pay(String service, long amount) {
        if (!service.isEmpty() && amount < balance && amount > 0) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
