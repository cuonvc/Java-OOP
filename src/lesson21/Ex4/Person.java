package lesson21.Ex4;

import java.util.Date;

public class Person {
    private String idCard;  //số cmt
    private FullName fullName;  //tên đầy đủ
    private String address;  //địa chỉ
    private Date dayOfBirth;  //ngày sinh
    private String email;
    private String phoneNumber;  //số điện thoại

    public Person(String idCard, String fullName, String address,
                  Date dayOfBirth, String email, String phoneNumber) {
        this.idCard = idCard;
        this.setFullName(fullName);
        this.address = address;
        this.dayOfBirth = dayOfBirth;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Person() {
    }

    public final String getIdCard() {
        return idCard;
    }

    public final void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public final FullName getFullName() {
        return fullName;
    }

    /**
     * setter thiết lập tên đầy đủ
     * @param fullName tên đầy đủ sau thiết lập
     */
    public final void setFullName(String fullName) {
        this.fullName = new FullName();
        if (fullName != null && fullName.length() > 0) {
            var words = fullName.split("\\s+");
            this.fullName.firstName = words[0];
            this.fullName.lastName = words[words.length - 1];
            this.fullName.midName = "";
            for (int i = 1; i < words.length - 1; i++) {
                this.fullName.midName += words[i] + " ";
            }
        }
    }

    public final String getFullNameStr() {
        return fullName.firstName + " " + fullName.midName + fullName.lastName;
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

        public FullName(String firstName, String midName, String lastName) {
            this.firstName = firstName;
            this.midName = midName;
            this.lastName = lastName;
        }


        public FullName() {

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


    public void eat() {
        System.out.println(getFullName() + " đang ăn");
    }

    public void sleep() {
        System.out.println(getFullName() + " đang ngủ nướng");
    }

    public void work(String job) {
        System.out.println(getFullName() + " đang " + job);
    }

    public void talk() {
        System.out.println(getFullName() + " đang nói chuyện");
    }

    public void relax(String something) {
        System.out.println(getFullName() + " đang thư giãn với " + something);
    }
}
