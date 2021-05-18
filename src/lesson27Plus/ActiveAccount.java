package lesson27Plus;

public class ActiveAccount extends Account {
    private boolean active;  //trạng thái kích hoạt tài khoản
    private boolean online;  //trạng thái đang onile

    public ActiveAccount(boolean active, boolean online) {
        this.active = active;
        this.online = online;
    }

    public ActiveAccount(String id, String username, String password,
                         boolean active, boolean online) {
        super(id, username, password);
        this.active = active;
        this.online = online;
    }

    public ActiveAccount(String id, String username, String password,
                         String fullName, String address, String email,
                         String phoneNumber, boolean active, boolean online) {
        super(id, username, password, fullName, address, email, phoneNumber);
        this.active = active;
        this.online = online;
    }


    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }
}
