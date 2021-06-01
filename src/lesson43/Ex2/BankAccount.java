package lesson43.Ex2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BankAccount {
    private String bankCardId;  //số thẻ
    private String accountId;  //số tài khoản
    private String Owner;  //tên tài khoản
    private float balance;  //số dư

    public BankAccount() {
    }

    public BankAccount(String bankCardId, String accountId, String owner, float balance) {
        this.bankCardId = bankCardId;
        this.accountId = accountId;
        Owner = owner;
        this.balance = balance;
    }

    public final String getBankCardId() {
        return bankCardId;
    }

    public final void setBankCardId(String bankCardId) {
        this.bankCardId = bankCardId;
    }

    public final String getAccountId() {
        return accountId;
    }

    public final void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public final String getOwner() {
        return Owner;
    }

    public final void setOwner(String owner) {
        Owner = owner;
    }

    public final float getBalance() {
        return balance;
    }

    public final void setBalance(float balance) {
        this.balance = balance;
    }



    public void deposit(String amount)
            throws InvalidAmountStringException {
        String regex = "\\d+";  //một hoặc nhiều số từ 0-9
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(amount);
        //nếu trả về true thì thỏa mãn
        if (!matcher.matches()) {  //nếu amount khác regex (không phải là số)
            String msg = "Lỗi cú pháp!";
            throw new InvalidAmountStringException(msg, amount);
        } else if (Long.parseLong(amount) > 0 && Long.parseLong(amount) < 100000000) {
            balance += Long.parseLong(amount);
        } else {
            String msg = "Lỗi cũ pháp!";
            throw new InvalidAmountStringException(msg,amount);
        }
    }



    public void withdraw(String amount) throws InvalidAmountStringException {
        String regex = "\\d+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(amount);
        if (!matcher.matches()) {
            String msg = "Lỗi cú pháp!";
            throw new InvalidAmountStringException(msg, amount);
        } else if (Long.parseLong(amount) > 0 && Long.parseLong(amount)
                < balance && Long.parseLong(amount) < 100000000){
            balance -= Long.parseLong(amount);
        } else {
            String msg = "Lỗi cú pháp!";
            throw new InvalidAmountStringException(msg, amount);
        }
    }

    public void transfers(String amount, BankAccount other)
            throws InvalidAmountStringException {
        String regex = "\\d+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(amount);
        if (!matcher.matches()) {
            String msg = "Lỗi cú pháp!";
            throw new InvalidAmountStringException(msg, amount);
        } else if (Long.parseLong(amount) > 0 && Long.parseLong(amount)
                < balance && Long.parseLong(amount) < 100000000 && other != null){
            balance -= Long.parseLong(amount);
            other.balance += Long.parseLong(amount);
        } else {
            String msg = "Lỗi cú pháp!";
            throw new InvalidAmountStringException(msg, amount);
        }
    }

    public void pay(String service, String amount)
            throws InvalidAmountStringException {
        String regex = "\\d+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(amount);
        if (!matcher.matches()) {
            String msg = "Lỗi cú pháp";
            throw new InvalidAmountStringException(msg, amount);
        } else if (Long.parseLong(amount) > 0 && Long.parseLong(amount)
                < balance && service != null) {
            balance -= Long.parseLong(amount);
        } else {
            String msg = "Lỗi cú pháp";
            throw new InvalidAmountStringException(msg, amount);
        }
    }
}
