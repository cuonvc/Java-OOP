package lesson25.Ex5;

import java.util.Date;

public abstract class Person {
    private String idCard;  //số cmt
    private FullName fullName;
    private String address;  //địa chỉ
    private Date dayOfBirth;  //ngày sinh
    private String email;   //mail
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

//các hành động
    public void eat(String food) {
        System.out.println(getFullName() + " đang ăn " + food);
    }

    public void sleep() {
        System.out.println(getFullName() + " đang ngủ");
    }

    public abstract void work(String job);

    public void talk() {
        System.out.println(getFullName() + " đang nói chuyện ");
    }

    public void relax() {
        System.out.println(getFullName() + " đang chơi game");
    }



    public final String getIdCard() {
        return idCard;
    }

    public final void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public final String getFullName() {
        return fullName.firstName + " " + fullName.midName + fullName.lastName;
    }

    public final FullName getFullNameStr() {
        return fullName;
    }


    public final void setFullName(String fullName) {
        this.fullName = new FullName();
        if (fullName != null && fullName.length() > 0) {
            String[] words = fullName.split("\\s+");
            this.fullName.firstName = words[0];
            this.fullName.lastName = words[words.length - 1];
            this.fullName.midName = "";
            for (int i = 1; i < words.length - 1; i++) {
                this.fullName.midName += (words[i] + " ");
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
        private String firstName;  //đệm
        private String midName;  //họ
        private String lastName;  //tên


        public FullName(String firstName, String midName, String lastName) {
            this.firstName = firstName;
            this.midName = midName;
            this.lastName = lastName;
        }

        public FullName() {

        }

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
