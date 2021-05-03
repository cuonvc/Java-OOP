package lesson18.ex3;

import java.util.Date;

/**
 * lớp mô tả thông tin người nói chung
 */
public class Person {
    private String idCard;  //số cmt
    private FullName fullName;
    private String address;
    private Date birthDay;
    private String email;
    private String phoneNumber;

    public Person() {

    }


    public Person(String idCard, String fullName, String address, Date birthDay, String email, String phoneNumber) {
        this.idCard = idCard;
        this.setFullName(fullName);
        this.address = address;
        this.birthDay = birthDay;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getFullName() {
        return fullName.getLastName() + " " + fullName.getMidName() + fullName.getFirstName();
    }

    public void setFullName(String fullName) {
        this.fullName = new FullName();
        if (fullName != null && fullName.length() > 0) {
            String[] words = fullName.split("\\s+");
            this.fullName.firstName = words[words.length - 1];
            this.fullName.lastName = words[0];
            this.fullName.midName = "";  //phần còn lại
            //trường hợp đề phòng tên đệm có nhiều hơn 1 từ
            for (int i = 1; i < words.length - 1; i++) {
                this.fullName.midName += words[i] + " ";
            }
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    class FullName {
        private String firstName;
        private String lastName;
        private String midName;

        public FullName() {

        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getMidName() {
            return midName;
        }

        public void setMidName(String midName) {
            this.midName = midName;
        }
    }
}
