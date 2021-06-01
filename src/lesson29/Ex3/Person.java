package lesson29.Ex3;

import java.util.Date;

public abstract class Person implements Comparable<Person> {
    private String idCard;  //số cmnd
    private FullName fullName;  //họ và tên
    private String address;  //địa chỉ
    private Date dayOfBirth;  //ngày sinh
    private String email;  //mail
    private String phoneNumber;  //số điện thoại

    public Person() {
    }

    public Person(String idCard, String fullName, String address,
                  Date dayOfBirth, String email, String phoneNumber) {
        this.idCard = idCard;
        this.setFullName(fullName);
        this.address = address;
        this.dayOfBirth = dayOfBirth;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public final String getIdCard() {
        return idCard;
    }

    public final void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public final String getFullName() {
        return fullName.lastName + " " + fullName.midName + fullName.firstName;
    }

    public final void setFullName(String fullName) {
        this.fullName = new FullName();
        if (fullName != null && fullName.length() > 0) {
            String[] words = fullName.split("\\s+");
            this.fullName.firstName = words[words.length - 1];
            this.fullName.lastName = words[0];
            this.fullName.midName = "";
            for (int i = 1; i < words.length - 1; i++) {
                this.fullName.midName = words[i] + " ";
            }
        }
    }

    public final String getAddress() {
        return address;
    }

    public final void setAddress(String address) {
        this.address = address;
    }

    public final Date getDayOfBirth() {
        return dayOfBirth;
    }

    public final void setDayOfBirth(Date dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public final String getEmail() {
        return email;
    }

    public final void setEmail(String email) {
        this.email = email;
    }

    public final String getPhoneNumber() {
        return phoneNumber;
    }

    public final void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    class FullName {
        private String firstName;
        private String midName;
        private String lastName;

        public FullName() {
        }

        public FullName(String firstName, String midName, String lastName) {
            this.firstName = firstName;
            this.midName = midName;
            this.lastName = lastName;
        }

        public final String getFirstName() {
            return firstName;
        }

        public final void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public final String getMidName() {
            return midName;
        }

        public final void setMidName(String midName) {
            this.midName = midName;
        }

        public final String getLastName() {
            return lastName;
        }

        public final void setLastName(String lastName) {
            this.lastName = lastName;
        }
    }


    public void eat(String food) {
        System.out.println(fullName + " đang ăn " + food);
    }

    public void sleep() {
        System.out.println(fullName + " đang ngủ");
    }

    protected abstract void work(String job);

    public void talk(String someone) {
        System.out.println(fullName + " đang nói chuyện với " + someone);
    }

    public void relax() {
        System.out.println(fullName + " đang chơi game");
    }


    @Override
    //sắp xếp tên từ a-z
    public int compareTo(Person o) {
        return this.getFullName().compareTo(o.getFullName());
    }
}
