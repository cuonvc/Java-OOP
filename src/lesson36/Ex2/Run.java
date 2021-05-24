package lesson36.Ex2;

import java.security.AccessControlContext;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account account = new Account();
        Account destination = new Account();
        System.out.println("Số tài khoản: ");
        var accountId = input.nextLine();
        account.setAccountId(accountId);
        System.out.println("Chủ tài khoản: ");
        var fullName = input.nextLine();
        account.setFullName(fullName);

        int choice = 0;
        do {
            System.out.println("1. Nạp tiền vào tài khoản");
            System.out.println("2. Rút tiền khỏi tài khoản");
            System.out.println("3. Chuyển tiền");
            System.out.println("4. Thanh toán dich vụ");
            System.out.println("0. Thoát chương trình");
            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 0:
                    System.out.println("Thoát chương trình");
                    break;
                case 1:
                    System.out.println("Nhập số tiền cần nạp: ");
                    var amount = Long.parseLong(input.nextLine());
                    try {
                        account.deposit(amount);
                        System.out.println("Số dư: " + account.getBalance() + ".VNĐ");
                    } catch (InvalidAmountException e) {
                        System.out.println(e.getMessage());
                        System.out.println("Lỗi cú pháp: InvalidAmountException");
                    }
                    break;
                case 2:
                    System.out.println("Nhập số tiền cần rút: ");
                    var amount2 = Long.parseLong(input.nextLine());
                    try {
                        account.withdraw(amount2);
                        System.out.println("Số dư: " + account.getBalance() + ".VNĐ");
                    } catch (InvalidAmountException e) {
                        System.out.println(e.getMessage());
                        System.out.println("Lỗi cú pháp: InvalidAmountException");
                    }
                    break;
                case 3:
                    System.out.println("Nhập số tài khoản đích: ");
                    var number = input.nextLine();
                    destination.setAccountId(number);
                    System.out.println("Nhập số tiền: ");
                    var amount3 = Long.parseLong(input.nextLine());
                    try {
                        account.transfers(destination, amount3);
                        System.out.println("Số dư: " + account.getBalance() + ".VNĐ");
                    } catch (InvalidAmountException e) {
                        System.out.println(e.getMessage());
                        System.out.println("Lỗi cú pháp: InvalidAmountException");
                    }
                    break;
                default:
                    System.out.println("Sai cú pháp, vui lòng nhập lại");
                    break;
            }
        } while (choice != 0);
    }
}
