package lesson27Plus;

import java.util.ArrayList;

public class AccManagementImp implements AccManagement {

    private ArrayList<Account> accounts; //sau này, khi áp dụng thực tế sẽ là dataBase chứ ko phải ArrayList

    public AccManagementImp() {
        accounts = new ArrayList<>();
    }

    public AccManagementImp(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    //hiểu đơn giản đăng kí tức là thêm một thành viên vào cái ArrayList bên trên
    public boolean signUp(Account account) {
        if (!isExist(account)) {  //nếu tài khoản chưa tồn tại
            accounts.add(account);
            return true;
        }
        return false;
    }

    /**
     * kiểm tra xem tài khoản cần tạo đã tồn tại hay chưa
     * @param account tài khoản cần ktra
     * @return
     */
    private boolean isExist(Account account) {
        for (var acc : accounts) {
            if (acc.getUsername().compareTo(account.getUsername()) == 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    //đăng nhập thì hiểu là nếu cặp username và pass trùng với cặp user và pass có sẵn trong Array thì return true
    public boolean signIn(Account account) {
        for (var acc : accounts) {
            if (acc.equals(account) && acc instanceof ActiveAccount) {
                var activeAcc = (ActiveAccount) acc;
                activeAcc.setOnline(true);
                return true;
                //sau này làm sâu hơn thì chỗ này sẽ là kích hoạt acc hoặc làm thứ gì đó bla...bla...
            }
        }
        return false;
    }

    @Override
    //đăng xuất thì là cho trạng thái account thành false, tức là không hoạt động
    public void signOut(Account account) {
        //tạo một lớp Active và bật trạng thái active là false
        for (var acc : accounts) {
            if (acc.equals(account) && acc instanceof ActiveAccount) {
                var activeAcc = (ActiveAccount) acc;
                activeAcc.setOnline(false);
                break;
            }
        }
    }

    @Override
    public boolean remove(Account account) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).equals(account)) {
                accounts.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    //điều kiện là user, pass trùng khớp và tài khoản chưa bị xóa khỏi hệ thống
    public boolean restoreAcc(Account account) {
        for (var acc : accounts) {
            if (acc.equals(account) && acc instanceof ActiveAccount ) {
                var activeAcc = (ActiveAccount) acc;
                activeAcc.setActive(true);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean changePassword(Account account) {
        for (var acc : accounts) {
            if (acc.equals(account)) {
                acc.setPassword(account.getPassword());  //hiểu là lấy pass mới đè lên pass cũ
                return true;
            }
        }
        return false;
    }

    @Override
    //tương tự thay đổi mật khẩu, không được thay đổi username
    public boolean changeAccInfo(Account account) {
        for (var acc : accounts) {
            if (acc.equals(account)) {
                acc.setEmail(account.getEmail());
                acc.setAddress(account.getAddress());
                acc.setPhoneNumber(account.getPhoneNumber());
                //...
                return true;
            }
        }
        return false;
    }
}
