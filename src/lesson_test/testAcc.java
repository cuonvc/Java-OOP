package lesson_test;

import java.util.ArrayList;
import java.util.Scanner;

public class testAcc {
    public static void main(String[] args) {
        var choice = 0;
        var input = new Scanner(System.in);
        ArrayList<testAccSP> Account = new ArrayList<>();  //khởi tạo danh sách các tài khoản
        do {
            System.out.println("===========MENU===========");
            System.out.println("1. Thêm tài khoản");
            System.out.println("2. Thông tin tài khoản");
            System.out.println("3. Nạp tiền");
            System.out.println("4. Rút tiền");
            System.out.println("5. Tìm tài khoản theo tên");
            System.out.println("6. Tìm tài khoản theo mã ID");
            System.out.println("7. Tìm tài khoản có số dư lớn hơn yêu cầu");
            System.out.println("8. Xóa tài khoản");
            System.out.println("0. Thoát chương trình");

            choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 0:
                    System.out.println("Đã thoát chương trình.");
                    break;
                case 1:
                    var create = addAcc(input);
                    Account.add(create);  //thêm thông tin vừa nhập vào danh sách Account
                    break;
                case 2:
                    showAcc(Account);
                    break;
                case 3:
                    if (Account.size() > 0) {
                        System.out.println("Nhập mã tài khoản: ");
                        var id = input.nextLine();
                        System.out.println("Nhập số tiền: ");
                        var amount = input.nextLong();
                        var isSuccess = add(Account, id, amount);
                        if (isSuccess) {
                            System.out.println("Nạp thành công " + amount + " vào tài khoản " + id);
                        } else {
                            System.out.println("Lỗi cú pháp...");
                        }
                    } else {
                        System.out.println("Danh sách tài khoản trống...");
                    }
                    break;
                case 4:
                    if (Account.size() > 0) {
                        System.out.println("Nhập mã tài khoản cần rút: ");
                        var id = input.nextLine();
                        System.out.println("Nhập số tiền muốn rút: ");
                        var amount = input.nextLong();
                        var isSuccess = withdrawMoney(Account, id, amount);
                        if (isSuccess) {
                            System.out.println("Rút thành công " + amount + " từ tài khoản " + id);
                        } else {
                            System.out.println("lỗi cú pháp...");
                        }
                    } else {
                        System.out.println("Danh sách tài khoản trống...");
                    }
                    break;
                case 5:
                    if (Account.size() > 0) {
                        System.out.println("Tên tài khoản: ");
                        var name = input.nextLine();
                        var result = searchName(Account, name);
                        if (result.size() > 0) {
                            System.out.println("Có " + result.size() + " kết quả tên: " + name);
                        } else {
                            System.out.println("Không tìm thấy kết quả...");
                        }
                    } else {
                        System.out.println("Danh sách trống...");
                    }
                    break;
                case 6:
                    if (Account.size() > 0) {
                        System.out.println("Nhập ID: ");
                        var id = input.nextLine();
                        var result = searchId(id, Account);
                        if (result != null) {
                            System.out.println("Tìm thấy một tài khoản có ID: " + id);
                        } else {
                            System.out.println("Không tìm thấy kết quả...");
                        }
                    } else {
                        System.out.println("Danh sách trống...");
                    }
                    break;
                case 7:
                    if (Account.size() > 0) {
                        System.out.println("Nhập mức số dư: ");
                        var stander = input.nextLong();
                        if (stander > 0) {
                            var result = searchBalance(Account, stander);
                            if (result.size() > 0) {
                                System.out.println("Có " + result.size() + " tài khoản có số dư >= " + stander);
                            } else {
                                System.out.println("Danh sách trống...");
                            }
                        } else {
                            System.out.println("Vui lòng nhập gia trị lớn hơn 0...");
                        }

                    } else {
                        System.out.println("Danh sách trống...");
                    }
                    break;
                case 8:
                    if (Account.size() > 0) {
                        System.out.println("ID tài khoản cần xóa: ");
                        var id = input.nextLine();
                        var isSuccess = deleteId(id, Account);
                        if (isSuccess) {
                            System.out.println("---> Xóa thành công <---");
                        } else {
                            System.out.println("Không tìm thấy tài khoản...");
                        }
                    } else {
                        System.out.println("danh sách trống...");
                    }
                    break;
                default:
                    System.out.println("Vui lòng chọn giá trị từ 0-8 ...");
                    break;
            }
        } while (choice != 0);
    }

    private static boolean deleteId(String id, ArrayList<testAccSP> account) {
        for (int i = 0; i <= account.size() - 1; i++) {
            if (account.get(i).getId().compareToIgnoreCase(id) == 0) {
                account.remove(i);
                return true;
            }

        }
        return false;
    }

    private static ArrayList<testAccSP> searchBalance(ArrayList<testAccSP> account, long stander) {
        ArrayList<testAccSP> res = new ArrayList<>();
        for (var acc : account) {
            if (acc.getBalance() >= stander) {
                res.add(acc);
            }
        }
        return res;
    }

    private static ArrayList<testAccSP> searchName(ArrayList<testAccSP> account, String name) {
        ArrayList<testAccSP> res = new ArrayList<>();
        for (var acc : account) {
            var firstName = getFirstName(acc.getName());
            if (firstName.compareToIgnoreCase(name) == 0) {
                res.add(acc);
            }
        }
        return res;
    }

    /**
     * lọc lấy tên trong cả họ và tên
     * @param name vừa là tên trước khi lọc vừa là tên sau khi lọc
     * @return trả về tên sai khi lọc
     */
    private static String getFirstName(String name) { //name là cả họ và tên trước khi lọc
        int index = name.lastIndexOf(" ");
        return name.substring(index + 1);   //name là chỉ tên sau khi lọc
    }

    private static boolean withdrawMoney(ArrayList<testAccSP> account, String id, long amount) {
        var accAmountWithdraw = searchId(id, account);
        if (accAmountWithdraw != null) {
            return accAmountWithdraw.withdraw(amount);
        }
        return false;
    }

    private static boolean add(ArrayList<testAccSP> account, String id, long amount) {
        var accAmountAdd = searchId(id, account);
        if (accAmountAdd != null) {
            return accAmountAdd.recharge(amount);
        }
        return false;
    }

    private static testAccSP searchId(String id, ArrayList<testAccSP> account) {
        for (int i = 0; i <= account.size() - 1; i++) {
            if (account.get(i).getId().compareToIgnoreCase(id) == 0) {
                return account.get(i);
            }
        }
        return null;
    }


    private static void showAcc(ArrayList<testAccSP> account) {
        if (account.size() > 0) {
            System.out.printf("%-17s %-17s %-18s %-19s %-10s %-14s %-19s %-12s\n",
                    "Mã tài khoản", "Số tài khoản", "Tên tài khoản", "Loại tài khoản", "SỐ dư", "Ngân hàng",
                    "Ngày phát hành", "Ngày hết hạn");
            for (var acc : account) {
                showInfo(acc);
            }
        } else {
            System.out.println("Danh sách trống...");
        }
    }

    private static void showInfo(testAccSP acc) {
        System.out.printf("%-17s %-17s %-18s %-19s %-10.0f %-14s %-19s %-12s\n",
                acc.getId(), acc.getNumber(), acc.getName(), acc.getType(), acc.getBalance(),
                acc.getBank(), acc.getFirstDay(), acc.getLastDay());
    }

    private static testAccSP addAcc(Scanner input) {
        System.out.print("Mã tài khoản: ");
        var id = input.nextLine();
        System.out.print("Số tài khoản: ");
        var number = input.nextLine();
        System.out.print("Tên tài khoản: ");
        var name = input.nextLine();
        System.out.print("Loại tài khoản: ");
        var type = input.nextLine();
        System.out.print("Tên ngân hàng: ");
        var bank = input.nextLine();
        System.out.print("Ngày phát hành: ");
        var first = input.nextLine();
        System.out.print("Ngày hết hạn: ");
        var last = input.nextLine();
        System.out.print("Số dư:");
        var balance = input.nextFloat();
        testAccSP account = new testAccSP(id,number, name, type, balance, bank, first, last);
        return account;
    }
}
