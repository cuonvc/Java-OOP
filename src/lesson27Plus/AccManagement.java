package lesson27Plus;

/**
 * Thiết kế interface cho phép quản lý tài khoản gồm các thao tác:
 * đăng ký
 * đăng nhập
 * đăng xuất
 * xóa tài khoản
 * default: vô hiệu hóa tài khoản
 * khôi phục tài khoản
 * đổi mật khẩu
 * default: cấp lại mật khẩu
 * chỉnh sửa thông tin tài khoản
 */

public interface AccManagement {
    boolean signUp(Account account);

    boolean signIn(Account account);

    void signOut(Account account);

    boolean remove(Account account);

    boolean restoreAcc(Account account);

    boolean changePassword(Account account);

    boolean changeAccInfo(Account account);

    default void disableAcc(Account account) {
        System.out.println("Tài khoản của bạn đã bị vô hiệu hóa");
    }

    default String randomPassword(Account account) {
        return "";
    }
}
