package lesson21.Ex3;

import java.util.Date;

public class Person {
    private String idCard;
    private FullName fullName;
    private String address;
    private Date dayOfBirth;
    private String email;
    private String phoneNumber;


    public Person(String idCard, String fullName, String address, Date dayOfBirth,
                  String email, String phoneNumber) {
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

    public final String getFullName() {
        return fullName.getFirstName() + " " + fullName.getMidName() + fullName.getLastName();
    }

    /**
     * setter thiết lập tên đầy đủ
     * @param fullName tên sau khi thiết lập
     */
    public final void setFullName(String fullName) {
        this.fullName = new FullName();
        if (fullName != null && fullName.length() > 0) {
            String[] words = fullName.split("\\s+");
            this.fullName.firstName = words[0];
            this.fullName.lastName = words[words.length - 1];
            this.fullName.midName = "";
            for (int i = 1; i < words.length - 1; i++) {
                this.fullName.midName += words[i] + " ";
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
        private String firstName;  //họ
        private String midName;  //đệm
        private String lastName;  //tên

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

        public final void setFirstName(String fistName) {
            this.firstName = fistName;
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


    public void eat(String something) {
        System.out.println(getFullName() + " đang ăn " + something);
    }

    public void sleep() {
        System.out.println(getFullName() + " đang ngủ");
    }

    public void work(String job) {
        System.out.println(getFullName() + " đang " + job);
    }

    public void talk() {
        System.out.println(getFullName() + " đang nói chuyện");
    }

    public void relax() {
        System.out.println(getFullName() + " đang thư giãn");
    }
}

