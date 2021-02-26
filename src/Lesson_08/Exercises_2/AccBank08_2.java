import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class AccBank08_2 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        ArrayList<AccBankSP08_2> accounts = new ArrayList<>();
        int choice = 0;
        do {
            System.out.println("=================MENU=================");
            System.out.println("1. Thêm tài khoản");
            System.out.println("2. Hiển thị thông tin tất cả tài khoản");
            System.out.println("3. Nạp tiền");
            System.out.println("4. Rút tiền");
            System.out.println("5. Tìm tài khoản với tên tài khoản");
            System.out.println("6. Tìm tài khoản với mã tài khoản");
            System.out.println("7. Tìm tài khoản có số dư lớn hơn x (x nguyên dương)");
            System.out.println("8. Xóa một tài khoản theo id");
            System.out.println("0. Thoát chương trình...");
            System.out.println("Lựa chọn hành động: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 0:
                    System.out.println("Đã thoát chương trình.");
                    break;
                case 1:
                    var account = addAcount(input);
                    accounts.add(account);  //thêm vào danh sách
                    break;
                case 2:
                    showAccount(accounts);
                    break;
                case 3:
                    if (accounts.size() > 0) {
                        System.out.println("Mã tài khoản cần nạp: ");
                        var idAccount = input.nextLine();
                        System.out.println("Số tiền cần nạp");
                        var amount = input.nextLong();
                        var isSuccesss = deposit(accounts, idAccount, amount);
                        if (isSuccesss) {
                            System.out.println("---> Nạp thành công <---");
                        } else {
                            System.out.println("---Tài khoản không tồn tại hoặc số tiền không hợp lệ---");
                        }
                    } else {
                        System.out.println("Danh sách tài khoản trống...");
                    }
                    break;
                case 4:
                    if (accounts.size() > 0) {
                        System.out.println("Mã tài khoản cần rút: ");
                        var idAccount = input.nextLine();
                        System.out.println("Số tiền cần rút: ");
                        var amount = input.nextLong();
                        var isSuccesss = withdraw(accounts, idAccount, amount);
                        if (isSuccesss) {
                            System.out.println("---> Rút thành công <---");
                        } else {
                            System.out.println("---Tài khoản không tồn tại hoặc số tiền không hợp lệ---");
                        }
                    } else {
                        System.out.println("Danh sách tài khoản trống...");
                    }
                    break;
                case 5:
                    if (accounts.size() > 0) {
                        System.out.println("Nhập tên tài khoản càn tìm: ");
                        var name = input.nextLine();
                        var result = searchByName(accounts, name);
                        if (result.size() > 0) {
                            System.out.println("--->Có " + result.size() + " kết quả " + name + "<---");
                            showAccount(result);
                        } else {
                            System.out.println("---Không thấy kết quả cho " + name + "---");
                        }
                    } else {
                        System.out.println("Danh sách tài khoản trống...");
                    }
                    break;
                case 6:
                    if (accounts.size() > 0) {
                        System.out.println("Nhập mã tài khoản cần tìm: ");
                        var id = input.nextLine();
                        var result = searchById(accounts, id);
                        if (result.size() > 0) {
                            System.out.println("---> Có " + result.size() + " kết quả " + id + " <---");
                            showAccount(result);
                        } else {
                            System.out.println("---Không thấy kết quả cho " + id + "---");
                        }
                    } else {
                        System.out.println("Danh sách tài khoản trống...");
                    }
                    break;
                case 7:
                    if (accounts.size() > 0) {
                        System.out.println("Nhập mức số dư: ");
                        var balance = input.nextLong();
                        var result = searchByBalance(accounts, balance);
                        if (result.size() > 0) {
                            System.out.println("---> Có " + result.size() + " tài khoản có số dư lớn hơn " + balance + " <---");
                            showAccount(result);
                        } else {
                            System.out.println("--- Không có tài khoản nào có số dư lớn hơn " + balance + " ---");
                        }
                    } else {
                        System.out.println("Danh sách rỗng...");
                    }
                    break;
                case 8:
                    if (accounts.size() > 0) {
                        String yes = "y";
                        String no = "n";
                        System.out.println("Nhập ID tài khoản cần xóa: ");
                        var id = input.nextLine();
                        System.out.println("Xác nhận xóa tài khoản này...");
                        System.out.println("Yes (y) or No (n) ?");
                        var YorN = input.nextLine();
                        if (YorN.compareTo(yes) == 0) {
                            var result = removeById(accounts, id);
                            if (result) {
                                System.out.println("---> Xóa thành công tài khoản " + id + " <---" );
                            } else {
                                System.out.println("ID không hợp lệ, vui lòng thử lại...");
                            }
                        } else if (YorN.compareTo(no) == 0) {
                            System.out.println("Xóa không thành công");
                        } else {
                            System.out.println("Cú pháp không chính xác !");
                        }

                    } else {
                        System.out.println("Danh sách trống...");
                    }
                    break;
                default:
                    System.out.println("Cú pháp không hợp lệ, nhập lại...");
                    break;

            }
        } while (choice != 0);
    }

    /**
     * phương thức xóa bỏ tài khoản khỏi danh sách
     * @param accounts danh sách tài khoản gốc
     * @param id mã tài khoản cần xóa
     * @return trả về những tài khoản cần xóa
     */
    private static boolean removeById(ArrayList<AccBankSP08_2> accounts, String id) {
        for (int i = 0; i <= accounts.size() - 1; i++) {
            if (accounts.get(i).getId().compareTo(id) == 0) { //nếu mã nhập vào trùng mã trong danh sách
                accounts.remove(i);
                return true;
            }
        }
        return false;
    }

    /**
     * phương thức tìm tài khoản có số dư lớn hơn x (nhập từ bàn phím)
     * @param accounts danh sách tài khoản gốc
     * @param balance số dư cần nhập
     * @return trả về những tài khoản theo yêu cầu
     */
    private static ArrayList<AccBankSP08_2> searchByBalance(ArrayList<AccBankSP08_2> accounts, long balance) {
        ArrayList<AccBankSP08_2> res = new ArrayList<>();
        for (var acc : accounts) {
            if (acc.getBalance() >= balance) {
                res.add(acc);
            }
        }
        return res;
    }

    /**
     * phương thức tìm tài khoản với id nhập từ bàn phím
     * @param accounts danh sách tài khoản
     * @param id mã cần tìm
     * @return nếu id có chứa từ khóa cần tìm thì trả về
     */
    private static ArrayList<AccBankSP08_2> searchById(ArrayList<AccBankSP08_2> accounts, String id) {
        ArrayList<AccBankSP08_2> res = new ArrayList<>();
        for (var acc : accounts) {
            if (acc.getId().toLowerCase().matches(id)) {
                res.add(acc);
            }
        }
        return res;
    }

    /**
     * phương thức tìm tài khoản với tên nhập từ bàn phím
     * @param accounts danh sách tài khoản
     * @param name tên cần tìm (fullName)
     * @return nếu tên có chứa từ khóa càn tìm thì trả về
     */
    private static ArrayList<AccBankSP08_2> searchByName(ArrayList<AccBankSP08_2> accounts, String name) {
        ArrayList<AccBankSP08_2> res = new ArrayList<>();
        for (var acc : accounts) {
            if (acc.getName().toLowerCase().matches(name)) {
                res.add(acc);
            }
        }
        return res;
    }

    /**
     * phương thức rút tiền trong tài khoản
     * @param accounts danh sách chứa các tài khoản
     * @param idAccount mã tài khoản cần rút
     * @param amount số tiền rút
     * @return
     */
    private static boolean withdraw(ArrayList<AccBankSP08_2> accounts, String idAccount, long amount) {
        var acc = searchId(accounts, idAccount);
        if (acc != null) {
            return acc.withdraw(amount);
        }
        return false;
    }

    /**
     * phương thức nạp tiền vào tài khoản
     * @param accounts những tài khoản được nạp tiền
     * @param idAccount mã tài khoản được nạp
     * @param amount số tiền nạp
     * @return true nếu nạp thành công và false nếu ngược lại
     */
    private static boolean deposit(ArrayList<AccBankSP08_2> accounts, String idAccount, long amount) {
        var acc = searchId(accounts, idAccount);
        if (acc != null) {
            return acc.deposit(amount);
        }
        return false;
    }


    /**
     * phương thức tìm tài khoản cần nạp và rút tiền
     * @param accounts danh sách tài khoản
     * @param idAccount mã số tài khoản
     * @return trả về những tài khoản có số dư >= x
     */
    private static AccBankSP08_2 searchId(ArrayList<AccBankSP08_2> accounts, String idAccount) {
        for (int i = 0; i <= accounts.size() - 1; i++) {
            if (accounts.get(i).getId().compareToIgnoreCase(idAccount) == 0) {  //nếu cái id của tài khoản cần tìm (idAccount)
                //trùng với một trong những cái id trong danh sách (accounts) thì đúng
                return accounts.get(i);  //trả về tài khoản vừa tìm được
            }
        }
        return null;   //trả về không có gì
    }

    /**
     * phương thức hiển thị từng acc
     * @param accounts những tài khoản được hiển thị
     */
    private static void showAccount(ArrayList<AccBankSP08_2> accounts) {
        if (accounts.size() > 0) {
            System.out.printf("%-5s %-16s %-17s %-18s %-12s %-17s %-17s %-15s\n",
                    "ID", "Số tài khoản", "Tên tài khoản", "Loại toài khoản",
                    "Số dư", "Ngân Hàng", "Ngày phát hành", "Ngày hết hạn");
            for (var acc : accounts) {
                showInfoAccount(acc);
            }

        } else {
            System.out.println("Danh sách trống.");
        }
        
    }

    /**
     * phương thức hiển thông tin của tài khoản dưới dạng bảng
     * phương thức này là tập con của showAccount
     * @param acc tài khoản được hiển thị
     */
    private static void showInfoAccount(AccBankSP08_2 acc) {
        System.out.printf("%-5s %-16s %-17s %-18s %-12.0f %-17s %-17s %-15s\n",
                acc.getId(), acc.getNumber(), acc.getName(), acc.getType(),
                acc.getBalance(), acc.getBank(), acc.getFirstDay(), acc.getLastDay());
    }


    /**
     * phương thức nhập thông tin của tài khoản mới
     * @param input đối tượng của Scanner
     * @return trả về danh sách thông tin của tài khoản
     */
    private static AccBankSP08_2 addAcount(Scanner input) {
        System.out.print("ID tài khoản: ");
        var id = input.nextLine();
        System.out.print("Số tài khoản: ");
        var number = input.nextLine();
        System.out.print("Tên tài khoản: ");
        var name = input.nextLine();
        System.out.print("Loại tài khoản: ");
        var type = input.nextLine();
        System.out.print("Số dư: ");
        var balance = input.nextFloat();
        input.nextLine();  //xuống dòng vì kiểu float ko có nextline
        System.out.print("Ngân hàng: ");
        var bank = input.nextLine();
        System.out.print("Ngày phát hành: ");
        var firstD = input.nextLine();
        System.out.print("Ngày hết hạn: ");
        var lastD = input.nextLine();

        AccBankSP08_2 acc = new AccBankSP08_2(id, number, name, type, balance,
                bank, firstD, lastD);
        return acc;
    }
}
