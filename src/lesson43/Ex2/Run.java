package lesson43.Ex2;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        BankAccount otherAccount = new BankAccount();
        var input = new Scanner(System.in);
        int choice = 0;
        do {
            showNoti("Xin mời chọn");
            System.out.println("1. Nạp tiền vào tài khoản.");
            System.out.println("2. Rút tiền.");
            System.out.println("3. Chuyển tiền.");
            System.out.println("4. Thanh toán hóa đơn.");
            System.out.println("0. Thoát chương trình.");
            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 0:
                    showNoti("Đã thooát chương trình");
                    break;
                case 1:
                    System.out.println("Nhập số tiền: ");
                    var amount1 = input.nextLine();
                    depositMethod(amount1, account);
                    System.out.println("Số dư: " + account.getBalance());
                    break;
                case 2:
                    System.out.println("Nhập số tiền: ");
                    var amount2 = input.nextLine();
                    withdrawMethod(amount2, account);
                    System.out.println("Số dư: " + account.getBalance());
                    break;
                case 3:
                    System.out.println("Nhập số tiền: ");
                    var amount3 = input.nextLine();
                    transfersMethod(amount3, account, otherAccount);
                    System.out.println("Số dư: " + account.getBalance());
                    break;
                case 4:
                    System.out.println("Dịch vụ: ");
                    var service = input.nextLine();
                    System.out.println("Số tiền: ");
                    var amount4 = input.nextLine();
                    payMethod(service, amount4, account);
                    System.out.println("Số dư: " + account.getBalance());
                    break;
                default:
                    showNoti("Sai cú pháp, vui lòng chọn lại");
                    break;
            }
        } while (choice != 0);
    }

    private static void payMethod(String service, String amount4, BankAccount account) {
        try {
            account.pay(service, amount4);
            System.out.println("Đã thanh toán " + amount4 + ".VNĐ tiền " + service);
        } catch (InvalidAmountStringException e) {
            e.getMessage();
            System.out.println("Đã xảy ra ngoại lệ InvalidAmountStringException");
        }
    }

    private static void transfersMethod(String amount3, BankAccount account, BankAccount otherAccount) {
        try {
            account.transfers(amount3, otherAccount);
            System.out.println("Chuyển thành công " + amount3 + ".VNĐ");
        } catch (InvalidAmountStringException e) {
            e.getMessage();
            System.out.println("Đã xảy ra ngoại lệ InvalidAmountStringException");
        }
    }

    private static void withdrawMethod(String amount2, BankAccount account) {
        try {
            account.withdraw(amount2);
            System.out.println("Rút thành công " + amount2 + ".VNĐ");
        } catch (InvalidAmountStringException e) {
            e.getMessage();
            System.out.println("Đã xảy ra ngoại lệ InvalidAmountStringException");
        }
    }

    private static void depositMethod(String amount1, BankAccount account) {
        try {
            account.deposit(amount1);
            System.out.println("Nạp thành công " + amount1 + ".VNĐ vào tài khoản");
        } catch (InvalidAmountStringException e) {
            System.out.println(e.getMessage());
            System.out.println("Đã xảy ra ngoại lệ InvalidAmountStringException");
        }
    }

    private static void showNoti(String str) {
        System.out.println(">>>>>>>>>> " + str + " <<<<<<<<<<");
    }
}
