package lesson18.ex4;

import java.util.Date;

public class Person {
//properties
    private String idCard;  //số cmt
    private FullName fullName;
    private String address;
    private Date birthday;
    private String email;
    private String phoneNumber;

//constructors
    public Person(String idCard, String fullName, String address, Date birthday,
                  String email, String phoneNumber) {
        this.idCard = idCard;
        this.setFullName(fullName);
        this.address = address;
        this.birthday = birthday;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

//getter and setter


    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getFullName() {
        return fullName.firstName + " " + fullName.midName + fullName.lastName;
    }



    public void setFullName(String fullName) {
        this.fullName = new FullName();
        if (fullName != null && fullName.length() > 0) {
            String[] words = fullName.split("\\s+");
            this.fullName.firstName = words[0];
            this.fullName.lastName = words[words.length - 1];
            this.fullName.midName = "";
            //trường hợp nếu tên đệm mà có nhiều hơn 1 từ (vẫn áp dụng cho tên đệm 1 từ)
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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
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


    /**
     * phương thức lấy từng thành phần của tên
     * được tạo từ searchByName (Run)
     * @return last / mid / first Name
     */
    public FullName getName() {
        return fullName;
    }


    class FullName {
        private String firstName;
        private String midName;
        private String lastName;



//        public FullName(String firstName, String midName, String lastName) {
//            this.firstName = firstName;
//            this.midName = midName;
//            this.lastName = lastName;
//        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getMidName() {
            return midName;
        }

        public void setMidName(String midName) {
            this.midName = midName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
    }
}



