package lesson27Plus;

public class Run {
    public static void main(String[] args) {
        AccManagementImp accManager = new AccManagementImp();

        Account account = new ActiveAccount("Acc123", "nguyenvancuong2002",
                "abc123", true, false);

        accManager.signUp(account);
        accManager.signIn(account);
        System.out.println("sau khi đăng nhập");
        showAccStatus(account);
        accManager.signOut(account);
        System.out.println("Sau khi đăng xuất");
        showAccStatus(account);
    }

    private static void showAccStatus(Account account) {
        ActiveAccount activeAccount = (ActiveAccount) account;
        var status = (activeAccount.isOnline()) ? "đang online" : "đang offline";
        System.out.println("Tài khoản " + activeAccount.getUsername() + " đang " + status);
    }
}
